package com.whatbi.zq.view;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.whatbi.zq.bo.CustomerManage;
import com.whatbi.zq.dal.domain.ZqCustomer;

/** 
 * @author yinjie 
 * @version 创建时间：2014年12月17日0:03:16
 * 类说明 : 客户显示控制
 */
@Controller
@RequestMapping("/customer")
public class Customer
{
    @Resource
    private CustomerManage customerManage;
    
    @RequestMapping("/list")
    public String list(Model model)
    {
        System.out.println("tree lai guo le");
        
        model.addAttribute("customerList", customerManage.getAllCustomer());
        
        return "customer/customerList";
    }
    
    @RequestMapping("/add")
    public String addView(Model model)
    {
        System.out.println("tree add view le");
        
        return "customer/customerInfo";
    }
    
    @RequestMapping("/edit")
    public String editView(String id, Model model)
    {
        System.out.println("tree edit view le");
        model.addAttribute("zqCustomer", customerManage.getCustomer(id));
        
        return "customer/customerEditInfo";
    }
    
    @RequestMapping("/addCustomer")
    public String addCustomer(ZqCustomer zqCustomer, Model model)
    {
        System.out.println("tree do add le");
        
        customerManage.addCustomer(zqCustomer);
        model.addAttribute("customerList", customerManage.getAllCustomer());
        
        return "customer/customerList";
    }
    
    @RequestMapping("/editCustomer")
    public String editCustomer(ZqCustomer zqCustomer, Model model)
    {
        System.out.println("tree do edit le");
        
        customerManage.editCustomer(zqCustomer);
        model.addAttribute("customerList", customerManage.getAllCustomer());
        
        return "customer/customerList";
    }
    
    @RequestMapping("/del")
    public String del(ZqCustomer zqCustomer, Model model)
    {
        System.out.println("tree del le");
        
        customerManage.delCustomer(zqCustomer);
        
        model.addAttribute("customerList", customerManage.getAllCustomer());
        
        return "customer/customerList";
    }
}
