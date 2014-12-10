package com.whatbi.zq.bo;

import java.util.List;

import javax.annotation.Resource;

import com.whatbi.zq.dal.domain.ZqFirstLend;
import com.whatbi.zq.dal.domain.ZqFirstLendExample;
import com.whatbi.zq.dal.persistence.ZqFirstLendMapperExt;

/**
 * @author yinjie
 * @version 创建时间：2014年12月8日 下午11:18:37 类说明 : 理财经纪人管理投资客户订单
 */
public class LendManage
{
    @Resource
    private ZqFirstLendMapperExt zqFirstLendMapperExt;

    public ZqFirstLend getLendOrder(String lendOrderId)
    {
        return zqFirstLendMapperExt.selectByPrimaryKey(Long.parseLong(lendOrderId));
    }

    public List<ZqFirstLend> getAllLendOrder()
    {
        return zqFirstLendMapperExt.selectByExample(new ZqFirstLendExample());
    }

    public ZqFirstLend addLendOrder(ZqFirstLend zqFirstLend)
    {
        zqFirstLend.setId((long) zqFirstLendMapperExt.insertSelective(zqFirstLend));
        return zqFirstLend;
    }

    public boolean editLendOrder(ZqFirstLend zqFirstLend)
    {
        return zqFirstLendMapperExt.updateByPrimaryKeySelective(zqFirstLend) > 0;
    }

    public boolean delLendOrder(ZqFirstLend zqFirstLend)
    {
        zqFirstLend.setIsDeleted("y");
        return editLendOrder(zqFirstLend);
    }

}
