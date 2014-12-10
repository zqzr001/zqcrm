package com.whatbi.zq.view;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.whatbi.zq.bo.UserManage;
import com.whatbi.zq.dal.domain.ZqUser;

/** 
 * @author yinjie 
 * @version 创建时间：2014年12月8日 下午10:46:55 
 * 类说明 
 */
@Controller
public class Login
{
    @Resource
    private UserManage userManage;
    
    @RequestMapping("/login")
    public String login()
    {
        return "login";
    }
    
    @RequestMapping("/doLogin")
    public String doLogin(ZqUser user)
    {
        if (userManage.userLogin(user))
        {
            return "main";
        }
        else
        {
            return "login";
        }
    }

}