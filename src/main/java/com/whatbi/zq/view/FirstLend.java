package com.whatbi.zq.view;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.util.FormatDate;
import com.whatbi.zq.bo.LendManage;
import com.whatbi.zq.dal.domain.ZqFirstLend;

/** 
 * @author yinjie 
 * @version 创建时间：2014年12月19日0:34:53
 * 类说明 : 出借订单显示控制
 */
@Controller
@RequestMapping("/lend")
public class FirstLend
{
    @Resource
    private LendManage lendManage;
    
    @RequestMapping("/list")
    public String list(Model model)
    {
        System.out.println("lend lai guo le");
        
        model.addAttribute("lendList", lendManage.getAllLendOrder());
        
        return "lend/lendList";
    }
    
    @RequestMapping("/add")
    public String addView(Model model)
    {
        System.out.println("lend add view le");
        
        return "lend/lendInfo";
    }
    
    @RequestMapping("/edit")
    public String editView(String id, Model model)
    {
        System.out.println("lend edit view le");
        model.addAttribute("zqLend", lendManage.getLendOrder(id));
        
        return "lend/lendEditInfo";
    }
    
    @RequestMapping("/addLend")
    public String addLend(ZqFirstLend zqLend, String startdate, String enddate, Model model)
    {
        System.out.println("lend do add le");
        
        zqLend.setLStartdate(FormatDate.getLongByDate(startdate));
        zqLend.setLEnddate(FormatDate.getLongByDate(enddate));
        lendManage.addLendOrder(zqLend);
        model.addAttribute("lendList", lendManage.getAllLendOrder());
        
        return "lend/lendList";
    }
    
    @RequestMapping("/editLend")
    public String editLend(ZqFirstLend zqLend, Model model)
    {
        System.out.println("lend do edit le");
        
        lendManage.editLendOrder(zqLend);
        model.addAttribute("lendList", lendManage.getAllLendOrder());
        
        return "lend/lendList";
    }
    
    @RequestMapping("/del")
    public String del(ZqFirstLend zqLend, Model model)
    {
        System.out.println("lend del le");
        
        lendManage.delLendOrder(zqLend);
        
        model.addAttribute("lendList", lendManage.getAllLendOrder());
        
        return "lend/lendList";
    }
    
    @RequestMapping("/export")
    public String export(ZqFirstLend zqLend, Model model)
    {
        System.out.println("lend export le");
        
        //TODO 导出目前暂未实现
        
        model.addAttribute("lendList", lendManage.getAllLendOrder());
        
        return "lend/lendList";
    }
}
