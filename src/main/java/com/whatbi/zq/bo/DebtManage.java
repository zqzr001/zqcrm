package com.whatbi.zq.bo;

import java.util.List;

import javax.annotation.Resource;

import com.whatbi.zq.dal.domain.ZqFirstDebt;
import com.whatbi.zq.dal.domain.ZqFirstDebtExample;
import com.whatbi.zq.dal.persistence.ZqFirstDebtMapperExt;

/** 
 * @author yinjie 
 * @version 创建时间：2014年12月8日 下午11:18:37 
 * 类说明 : 贷款经纪人管理贷款客户订单
 */
public class DebtManage
{
    @Resource
    private ZqFirstDebtMapperExt zqFirstDebtMapperExt;
    
    public ZqFirstDebt getDebtOrder(String debtOrderId)
    {
        return zqFirstDebtMapperExt.selectByPrimaryKey(Long.parseLong(debtOrderId));
    }
    
    public List<ZqFirstDebt> getAllDebtOrder()
    {
        return zqFirstDebtMapperExt.selectByExample(new ZqFirstDebtExample());
    }
    
    public List<ZqFirstDebt> getAllDebtOrderByExample(ZqFirstDebtExample zqFirstDebtExample)
    {
        return zqFirstDebtMapperExt.selectByExample(zqFirstDebtExample);
    }
    
    public ZqFirstDebt addDebtOrder(ZqFirstDebt zqFirstDebt)
    {
        zqFirstDebt.setId((long) zqFirstDebtMapperExt.insertSelective(zqFirstDebt));
        return zqFirstDebt;
    }
    
    public boolean editDebtOrder(ZqFirstDebt zqFirstDebt)
    {
        return zqFirstDebtMapperExt.updateByPrimaryKeySelective(zqFirstDebt) > 0;
    }
    
    public boolean delDebtOrder(ZqFirstDebt zqFirstDebt)
    {
        zqFirstDebt.setIsDeleted("y");
        return editDebtOrder(zqFirstDebt);
    }

}
