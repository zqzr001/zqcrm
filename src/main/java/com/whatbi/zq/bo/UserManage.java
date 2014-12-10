package com.whatbi.zq.bo;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.whatbi.zq.dal.domain.ZqUser;
import com.whatbi.zq.dal.domain.ZqUserExample;
import com.whatbi.zq.dal.persistence.ZqUserMapperExt;

/** 
 * @author yinjie 
 * @version 创建时间：2014年12月8日 下午10:03:16 
 * 类说明 : 用户管理
 */
@Service
public class UserManage
{
    @Resource
    private ZqUserMapperExt zqUserMapperExt;
    
    public boolean userLogin(ZqUser zqUser)
    {
        ZqUser dbUser = getUserByName(zqUser.getUserName());
        
        if (null != dbUser)
        {
            return zqUser.getUserPwd().equals(dbUser.getUserPwd());
        }
        else
        {
            return false;
        }
    }

    public ZqUser getUser(String userId)
    {
        return zqUserMapperExt.selectByPrimaryKey(Long.parseLong(userId));
    }
    
    public List<ZqUser> getAllUser()
    {
        return zqUserMapperExt.selectByExample(new ZqUserExample());
    }
    
    public ZqUser getUserByName(String userName)
    {
        ZqUserExample example = new ZqUserExample();
        example.createCriteria().andUserNameEqualTo(userName);
        List<ZqUser> list = zqUserMapperExt.selectByExample(example);
        if (null != list && list.size() > 0)
        {
            return list.get(0);
        }
        else
        {
            return null;
        }
    }
    
    public ZqUser addUser(ZqUser zqUser)
    {
        zqUser.setId((long) zqUserMapperExt.insertSelective(zqUser));
        return zqUser;
    }
    
    public boolean editUser(ZqUser zqUser)
    {
        return zqUserMapperExt.updateByPrimaryKeySelective(zqUser) > 0;
    }
    
    public boolean delUser(ZqUser zqUser)
    {
        zqUser.setIsDeleted("y");
        return editUser(zqUser);
    }
}
