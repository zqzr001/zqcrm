package com.whatbi.zq.bo;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.whatbi.zq.dal.domain.ZqCustomer;
import com.whatbi.zq.dal.domain.ZqCustomerExample;
import com.whatbi.zq.dal.persistence.ZqCustomerMapperExt;

/** 
 * @author yinjie 
 * @version 创建时间：2014年12月18日23:38:09
 * 类说明 : 客户管理
 */
@Service
public class CustomerManage
{
    @Resource
    private ZqCustomerMapperExt zqCustomerMapperExt;
    
    public ZqCustomer getCustomer(String customerId)
    {
        return zqCustomerMapperExt.selectByPrimaryKey(Long.parseLong(customerId));
    }
    
    public List<ZqCustomer> getAllCustomer()
    {
        return zqCustomerMapperExt.selectByExample(new ZqCustomerExample());
    }
    
    public List<ZqCustomer> getCustomerByName(String customerName)
    {
        ZqCustomerExample example = new ZqCustomerExample();
        example.createCriteria().andCNameEqualTo(customerName);
        List<ZqCustomer> list = zqCustomerMapperExt.selectByExample(example);
        return list;
    }
    
    public ZqCustomer addCustomer(ZqCustomer zqCustomer)
    {
        zqCustomer.setId((long)zqCustomerMapperExt.insertSelective(zqCustomer));
        return zqCustomer;
    }
    
    public boolean editCustomer(ZqCustomer zqCustomer)
    {
        return zqCustomerMapperExt.updateByPrimaryKeySelective(zqCustomer) > 0;
    }
    
    public boolean delCustomer(ZqCustomer zqCustomer)
    {
        zqCustomer.setIsDeleted("y");
        return editCustomer(zqCustomer);
    }
}
