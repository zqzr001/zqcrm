package com.whatbi.zq.view;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.util.FormatDate;
import com.whatbi.zq.bo.ProductManage;
import com.whatbi.zq.dal.domain.ZqProduct;

/** 
 * @author yinjie 
 * @version 创建时间：2014年12月20日0:12:52
 * 类说明 : 理财产品显示控制
 */
@Controller
@RequestMapping("/product")
public class Product
{
    @Resource
    private ProductManage productManage;
    
    @RequestMapping("/list")
    public String list(Model model)
    {
        System.out.println("product lai guo le");
        
        model.addAttribute("productList", productManage.getAllProduct());
        
        return "product/productList";
    }
    
    @RequestMapping("/add")
    public String addView(Model model)
    {
        System.out.println("product add view le");
        
        return "product/productInfo";
    }
    
    @RequestMapping("/edit")
    public String editView(String id, Model model)
    {
        System.out.println("product edit view le");
        model.addAttribute("zqProduct", productManage.getProduct(id));
        
        return "product/productEditInfo";
    }
    
    @RequestMapping("/addProduct")
    public String addProduct(ZqProduct zqProduct, String startdate, String enddate, Model model)
    {
        System.out.println("product do add le");
        
        zqProduct.setProStartdate(FormatDate.getLongByDate(startdate));
        zqProduct.setProEnddate(FormatDate.getLongByDate(enddate));
        productManage.addProduct(zqProduct);
        model.addAttribute("productList", productManage.getAllProduct());
        
        return "product/productList";
    }
    
    @RequestMapping("/editProduct")
    public String editProduct(ZqProduct zqProduct, Model model)
    {
        System.out.println("product do edit le");
        
        productManage.editProduct(zqProduct);
        model.addAttribute("productList", productManage.getAllProduct());
        
        return "product/productList";
    }
    
    @RequestMapping("/del")
    public String del(ZqProduct zqProduct, Model model)
    {
        System.out.println("product del le");
        
        productManage.delProduct(zqProduct);
        
        model.addAttribute("productList", productManage.getAllProduct());
        
        return "product/productList";
    }
}
