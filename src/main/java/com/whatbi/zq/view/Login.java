package com.whatbi.zq.view;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
        System.out.println("lai guo le");
        return "sys/sysLogin";
    }
    
    @RequestMapping("/logout")
    public String logout()
    {
        System.out.println("do logout");
        return "redirect:/login";
    }
    
    @RequestMapping("/doLogin")
    public String doLogin(ZqUser user, Model model)
    {
        if (userManage.userLogin(user))
        {
            //return "main";
            //return "redirect:userList";
            return "sys/sysIndex";
        }
        else
        {
            model.addAttribute("loginError", "login");
            return "sys/sysLogin";
        }
    }

}
