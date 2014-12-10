package com.whatbi.zq.bo;

import java.util.List;

import javax.annotation.Resource;

import com.whatbi.zq.dal.domain.ZqProduct;
import com.whatbi.zq.dal.domain.ZqProductExample;
import com.whatbi.zq.dal.persistence.ZqProductMapperExt;

/** 
 * @author yinjie 
 * @version 创建时间：2014年12月8日 下午11:18:37 
 * 类说明 : 贷款经纪人管理贷款客户订单
 */
public class ProductManage
{
    @Resource
    private ZqProductMapperExt zqProductMapperExt;

    public ZqProduct getProduct(String productId)
    {
        return zqProductMapperExt.selectByPrimaryKey(Long.parseLong(productId));
    }

    public List<ZqProduct> getAllProduct()
    {
        return zqProductMapperExt.selectByExample(new ZqProductExample());
    }

    public ZqProduct addProduct(ZqProduct zqFirstLend)
    {
        zqFirstLend.setId((long) zqProductMapperExt.insertSelective(zqFirstLend));
        return zqFirstLend;
    }

    public boolean editProduct(ZqProduct zqFirstLend)
    {
        return zqProductMapperExt.updateByPrimaryKeySelective(zqFirstLend) > 0;
    }

    public boolean delProduct(ZqProduct zqFirstLend)
    {
        zqFirstLend.setIsDeleted("y");
        return editProduct(zqFirstLend);
    }

}
