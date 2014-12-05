package com.common.mybatis.interceptor;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;

import com.util.CommonUtils;

/**
 * @ClassName: MybatisInterceptor
 * @Description: 对数据库新增、修改操作进行拦截，统一注入相关字段信息
 * @author lichao
 * @date 2014年6月20日 下午3:19:50
 */
@Intercepts({ @Signature(type = Executor.class, method = "update", args = { MappedStatement.class, Object.class }) })
public class MybatisInterceptor implements Interceptor
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

    @SuppressWarnings("unchecked")
    public Object intercept(Invocation invocation) throws Throwable
    {
        Object param = invocation.getArgs()[1];
        try
        {
            if (param != null)
            {
                List<Object> list = new ArrayList<Object>();
                
                if (param instanceof Map<?, ?>){
                    Map<String,Object> map = (Map<String, Object>) param; 
                    list = getParamsFromMap(map);
                }else if(param instanceof List<?>){
                    list = (List<Object>) param;
                }else{
                    list.add(param);
                }
                for (Object element : list)
                {
                    replenishObject(element);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return invocation.proceed();
    }
    
    /**
     * 
    * @Title: getParamsFromMap 
    * @Description: 递归遍历map，取出对 象
    * @param map
    * @return List<Object>
     */
    @SuppressWarnings("unchecked")
    private List<Object> getParamsFromMap(Map<String, Object> map){
        
        List<Object> list = new ArrayList<Object>();
       
        Set<Object> valueSet = new HashSet<Object>(map.values());
        
        for (Object object : valueSet)
        {
            if(object instanceof List<?>){
                list.addAll((List<Object>)object);
            }else if(object instanceof Map<?,?>){
                list.addAll(getParamsFromMap((Map<String, Object>)object));
            }else{
                list.add(object);
            }
        }
        return list;
    }
    
    /**
     * 
    * @Title: replenishObject 
    * @Description: 插入或更新数据时，补充公用字段
    * @param param 待补充pojo类
    * @return void
     */
    private void replenishObject(Object param) throws Exception{
        if(param!=null){
            Field[] fields = param.getClass().getDeclaredFields();
            Method getId = null;
            for (Field field : fields)
            {
                if(ID.equals(field.getName())){
                    getId = param.getClass().getMethod(GETID);
                    break;
                }
            }
            if(CommonUtils.isEmpty(getId)){
                return;
            }
            if (null == getId.invoke(param)){
                
                //insert
                Method setCreator = param.getClass().getMethod(CREATOR, String.class);
                Method setGmtCreate = param.getClass().getMethod(GMTCREATE, Long.class);
                if(!CommonUtils.isEmpty(setCreator)&&!CommonUtils.isEmpty(setGmtCreate)){
                    setCreator.invoke(param, SYSTEM);
                    setGmtCreate.invoke(param, new Date().getTime());
                }
            }else{
                
                //update
                Method setModifier = param.getClass().getMethod(MODIFIER, String.class);
                Method setGmtModified = param.getClass().getMethod(GMTMODIFIED, Long.class);
                
                if(!CommonUtils.isEmpty(setModifier)&&!CommonUtils.isEmpty(setGmtModified)){
                    setModifier.invoke(param, SYSTEM);
                    setGmtModified.invoke(param, new Date().getTime());
                } 
            }
        }
    }

    public Object plugin(Object target)
    {
        return Plugin.wrap(target, this);
    }

    public void setProperties(Properties arg0)
    {

    }

}
