package com.whatbi.zq.view;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.whatbi.zq.bo.UserManage;

/** 
 * @author yinjie 
 * @version 创建时间：2014年12月17日0:03:16
 * 类说明 : 菜单
 */
@Controller
@RequestMapping("/menu")
public class Menu
{
    @Resource
    private UserManage userManage;
    
    @RequestMapping("/tree")
    public String tree(String parentId, Model model)
    {
        System.out.println("tree lai guo le");
        model.addAttribute("parentId", parentId);
        return "sys/menuTree";
    }
}
