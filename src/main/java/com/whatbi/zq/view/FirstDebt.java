package com.whatbi.zq.view;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.util.FormatDate;
import com.whatbi.zq.bo.DebtManage;
import com.whatbi.zq.dal.domain.ZqFirstDebt;

/** 
 * @author yinjie 
 * @version 创建时间：2014年12月19日0:34:53
 * 类说明 : 原始债权显示控制
 */
@Controller
@RequestMapping("/debt")
public class FirstDebt
{
    @Resource
    private DebtManage debtManage;
    
    @RequestMapping("/list")
    public String list(Model model)
    {
        System.out.println("debt lai guo le");
        
        model.addAttribute("debtList", debtManage.getAllDebtOrder());
        
        return "debt/debtList";
    }
    
    @RequestMapping("/add")
    public String addView(Model model)
    {
        System.out.println("debt add view le");
        
        return "debt/debtInfo";
    }
    
    @RequestMapping("/edit")
    public String editView(String id, Model model)
    {
        System.out.println("debt edit view le");
        model.addAttribute("zqDebt", debtManage.getDebtOrder(id));
        
        return "debt/debtEditInfo";
    }
    
    @RequestMapping("/addDebt")
    public String addDebt(ZqFirstDebt zqDebt, String startdate, String enddate, Model model)
    {
        System.out.println("debt do add le");
        
        zqDebt.setDStartdate(FormatDate.getLongByDate(startdate));
        zqDebt.setDEnddate(FormatDate.getLongByDate(enddate));
        zqDebt.setDUseMoney(zqDebt.getDMoney());
        debtManage.addDebtOrder(zqDebt);
        model.addAttribute("debtList", debtManage.getAllDebtOrder());
        
        return "debt/debtList";
    }
    
    @RequestMapping("/editDebt")
    public String editDebt(ZqFirstDebt zqDebt, Model model)
    {
        System.out.println("debt do edit le");
        
        debtManage.editDebtOrder(zqDebt);
        model.addAttribute("debtList", debtManage.getAllDebtOrder());
        
        return "debt/debtList";
    }
    
    @RequestMapping("/del")
    public String del(ZqFirstDebt zqDebt, Model model)
    {
        System.out.println("debt del le");
        
        debtManage.delDebtOrder(zqDebt);
        
        model.addAttribute("debtList", debtManage.getAllDebtOrder());
        
        return "debt/debtList";
    }
}
