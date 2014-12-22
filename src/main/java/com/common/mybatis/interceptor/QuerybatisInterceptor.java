package com.common.mybatis.interceptor;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Properties;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

/**
 * @ClassName: QuerybatisInterceptor
 * @Description: 对数据库查询操作进行拦截, 设置查询条件
 * @author 殷洁
 * @date 2014年12月20日2:03:56
 */
@Intercepts({ @Signature(type = Executor.class, method = "query", args = { MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}) })
public class QuerybatisInterceptor implements Interceptor
{

    public static final String ID          = "id";       // 主键
    public static final String GETID       = "getId";       // get主键
    public static final String CREATOR     = "setCreator";     // 创建者
    public static final String GMTCREATE   = "setGmtCreate";   // 创建时间
    public static final String MODIFIER    = "setModifier";    // 修改者
    public static final String GMTMODIFIED = "setGmtModified"; // 修改时间
    public static final String SYSTEM      = "system";         // 系统管理员

    public static final String RECORD      = "record";
    
    public static final String LIST      = "list";

    @SuppressWarnings("rawtypes")
    public Object intercept(Invocation invocation) throws Throwable
    {
        Object param = invocation.getArgs()[1];
        
        try
        {
            if (param != null)
            {
                Method method = param.getClass().getMethod("getOredCriteria");
                List list = (List) method.invoke(param);
                
                Object criteria = null;
                
                if (list.size() == 0)
                {
                    Object obj = param.getClass().newInstance();
                    invocation.getArgs()[1] = obj;
                    Method method2 = obj.getClass().getMethod("createCriteria");
                    criteria = method2.invoke(obj);
                }
                else
                {
                    criteria = ((List) method.invoke(param)).get(0);
                }
                
                
                Method method2 = criteria.getClass().getDeclaredMethod("andIsDeletedEqualTo", String.class);
                method2.invoke(criteria, "n");
                
                
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return invocation.proceed();
    }
    
    public Object plugin(Object target)
    {
        return Plugin.wrap(target, this);
    }

    public void setProperties(Properties arg0)
    {

    }
}
