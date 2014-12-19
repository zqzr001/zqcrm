package com.whatbi.zq.view;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.whatbi.zq.bo.UserManage;
import com.whatbi.zq.dal.domain.ZqUser;

/** 
 * @author yinjie 
 * @version 创建时间：2014年12月17日0:03:16
 * 类说明 : 菜单
 */
@Controller
@RequestMapping("/user")
public class User
{
    @Resource
    private UserManage userManage;
    
    @RequestMapping("/list")
    public String list(Model model)
    {
        System.out.println("tree lai guo le");
        
        model.addAttribute("userList", userManage.getAllUser());
        
        return "sys/userList";
    }
    
    @RequestMapping("/add")
    public String addView(Model model)
    {
        System.out.println("tree add view le");
        
        return "sys/userInfo";
    }
    
    @RequestMapping("/edit")
    public String editView(String id, Model model)
    {
        System.out.println("tree edit view le");
        model.addAttribute("zqUser", userManage.getUser(id));
        
        return "sys/userEditInfo";
    }
    
    @RequestMapping("/addUser")
    public String addUser(ZqUser zqUser, Model model)
    {
        System.out.println("tree do add le");
        
        zqUser.setUserPwd("123456");
        userManage.addUser(zqUser);
        model.addAttribute("userList", userManage.getAllUser());
        
        return "sys/userList";
    }
    
    @RequestMapping("/editUser")
    public String editUser(ZqUser zqUser, Model model)
    {
        System.out.println("tree do edit le");
        
        userManage.editUser(zqUser);
        model.addAttribute("userList", userManage.getAllUser());
        
        return "sys/userList";
    }
    
    @RequestMapping("/del")
    public String del(ZqUser zqUser, Model model)
    {
        System.out.println("tree del le");
        
        userManage.delUser(zqUser);
        
        model.addAttribute("userList", userManage.getAllUser());
        
        return "sys/userList";
    }
}
