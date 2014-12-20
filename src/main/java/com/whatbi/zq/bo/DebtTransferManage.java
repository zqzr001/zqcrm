package com.whatbi.zq.bo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import com.util.FormatDate;
import com.whatbi.zq.common.GlobalConstants;
import com.whatbi.zq.dal.domain.ZqDebtTransfer;
import com.whatbi.zq.dal.domain.ZqFirstDebt;
import com.whatbi.zq.dal.domain.ZqFirstDebtExample;
import com.whatbi.zq.dal.domain.ZqFirstLend;
import com.whatbi.zq.dal.persistence.ZqDebtTransferMapperExt;

/**
 * @author yinjie
 * @version 创建时间：2014年12月8日 下午11:18:37 类说明 : 债权转让报告生成
 */
public class DebtTransferManage
{

    @Resource
    private ZqDebtTransferMapperExt zqDebtTransferMapperExt;

    @Resource
    private DebtManage              debtManage;

    @Resource
    private LendManage              lendManage;

    @Resource
    private ProductManage           productManage;

    public ZqDebtTransfer getDebtTransferReport(String debtTransferReportId)
    {
        return zqDebtTransferMapperExt.selectByPrimaryKey(Long.parseLong(debtTransferReportId));
    }

    /**
     * 生成订单(应该是整个系统里面惟一需要理解的地方了)
     * 
     * @param productRate 理财产品利率
     * @param lendOrderId 出借订单ID
     * @return
     */
    public void GenerateDebtTransferReport(Double proRate, String lendOrderId)
    {
        // TODO 目前系统只有一种债权转让计算方式

        // 以出借对象为原型, 获取到的报告时间, 存放在出借对象里面
        ZqFirstLend firstLend = getReportDate(lendOrderId);
        
        // 转让成功后的债权
        List<ZqDebtTransfer> zqDebtTransfered;
        
        // 此处效率很差, 需要优化
        synchronized (GlobalConstants.DEBT_USE_MONEY_LOCK)
        {
            List<ZqFirstDebt> zqFirstDebts = findDebtFromDB(firstLend);
            
            // 对符合条件的债权进行计算, 找出要进行转让的债权
            List<ZqFirstDebt> zqDebtTransfers = findDebtByLend(zqFirstDebts, firstLend);
            
            // 合适的债权找到后, 进行转让计算, 并返回转让成功后的债权
            zqDebtTransfered = doDebtTransfer(zqDebtTransfers, firstLend);
        }
        
        // 生成转让债权列表
        ZqDebtTransfer zqDebtTransfer = new ZqDebtTransfer();
        zqDebtTransfer.setCustLendId(firstLend.getCId());
        zqDebtTransfer.setProStartdate(firstLend.getLStartdate());
        zqDebtTransfer.setProEnddate(firstLend.getLEnddate());
        zqDebtTransfer.setProRate(proRate.toString());
        
        for (ZqDebtTransfer debtTransfer : zqDebtTransfered)
        {
            zqDebtTransfer.setCustDebtId(debtTransfer.getCustDebtId());
            zqDebtTransfer.setProMoney(debtTransfer.getProMoney());
            
            zqDebtTransferMapperExt.insertSelective(zqDebtTransfer);
        }
    }

    /**
     * 生成订单报告
     * 
     * @param productId
     * @return
     */
    public ZqDebtTransfer GenerateDebtTransfer(String productId)
    {
        // TODO 目前系统只有一种债权计算方式

        return zqDebtTransferMapperExt.selectByPrimaryKey(Long.parseLong(productId));
    }

    //以出借对象为原型, 获取到的报告时间, 存放在出借对象里面
    private ZqFirstLend getReportDate(String lendOrderId)
    {
        //首先确定时间, 1报告日期 2下一个报告日期(目前周期按一个月算, 对外最小单位为月)
        ZqFirstLend firstLend = lendManage.getLendOrder(lendOrderId);
        
        Calendar now = Calendar.getInstance();
        for (int i = 0; i < 30; i++)
        {
            long tempDate = FormatDate.getDateAfterMonth(firstLend.getLStartdate(), i).getTime();
            if (tempDate < now.getTimeInMillis())
            {
                continue;
            }
            else
            {
                firstLend.setLStartdate(tempDate);
                break;
            }
        }
        
        long nextReportDate = FormatDate.getDateAfterMonth(firstLend.getLStartdate(), 1).getTime();
        if (firstLend.getLEnddate() > nextReportDate)
        {
            firstLend.setLEnddate(nextReportDate);
        }
        
        return firstLend;
    }
    
    //以这个时间为单位, 去原始债权表中查找适合的债权, 可用余额必须大于0
    private List<ZqFirstDebt> findDebtFromDB(ZqFirstLend firstLend)
    {
        ZqFirstDebtExample example = new ZqFirstDebtExample();
        example.createCriteria()
        .andDStartdateBetween(0l, firstLend.getLStartdate())
        .andDEnddateBetween(firstLend.getLEnddate(),
                            firstLend.getLEnddate() + GlobalConstants.MAX_END_DATE)
        .andDUseMoneyBetween(1d,firstLend.getLMoney());
        
        // 以这个时间为单位, 去原始债权表中查找适合的债权, 可用余额必须大于0
        return debtManage.getAllDebtOrderByExample(example);
    }
    
    // 对符合条件的债权进行计算, 找出要进行转让的债权
    private List<ZqFirstDebt> findDebtByLend(List<ZqFirstDebt> zqFirstDebts, ZqFirstLend firstLend)
    {
        // 对符合条件的债权进行计算, 找出要进行转让的债权
        double totalMoney = 0;
        List<ZqFirstDebt> zqDebtTransfers = new ArrayList<ZqFirstDebt>();
        for (ZqFirstDebt firstDebt : zqFirstDebts)
        {
            //添加到转让列表里面
            zqDebtTransfers.add(firstDebt);
            
            //原始债权的可用金额大于要出借的金额时, 退出
            if (firstDebt.getDUseMoney() >= firstLend.getLMoney())
            {
                break;
            }
            else
            {
                //反之, 就需要累计金额, 然后再比较大小
                totalMoney += firstDebt.getDUseMoney();
                
                if (totalMoney >= firstLend.getLMoney())
                {
                    break;
                }
            }
        }
        
        if (totalMoney < firstLend.getLMoney())
        {
            //原始债权不够转让, 交易失败, 返回NULL
            return null;
        }
        
        return zqDebtTransfers;
    }
    
    //执行债权转让, 需要进行事务处理
    @Transactional
    private List<ZqDebtTransfer> doDebtTransfer(List<ZqFirstDebt> zqDebtTransfers, ZqFirstLend firstLend)
    {
        List<ZqDebtTransfer> zqDebtTransfered = new ArrayList<ZqDebtTransfer>();
        
        // 合适的债权找到后, 进行转让计算
        double totalMoney = 0;
        for (ZqFirstDebt firstDebt : zqDebtTransfers)
        {
            //构造债权列表
            ZqDebtTransfer debtTransfer = new ZqDebtTransfer();
            debtTransfer.setCustDebtId(firstDebt.getCId());
            debtTransfer.setProMoney(firstDebt.getDUseMoney());
            zqDebtTransfered.add(debtTransfer);
            
            //原始债权的可用金额大于要出借的金额时, 更新DB
            if (firstDebt.getDUseMoney() >= firstLend.getLMoney())
            {
                // 记录转让金额
                debtTransfer.setProMoney(firstLend.getLMoney());
                
                firstDebt.setDUseMoney(firstDebt.getDUseMoney() - firstLend.getLMoney());
                debtManage.editDebtOrder(firstDebt);
                
                //这一步其实没必要, 正常情况下条件是不会成立的, 加这个是为了加一层保险
                break;
            }
            else
            {
                //反之, 累计出借金额, 直到出借满额
                totalMoney += firstDebt.getDUseMoney();
                double tempMoney = totalMoney - firstLend.getLMoney();
                firstDebt.setDUseMoney(tempMoney < 0 ? 0d : tempMoney);
                debtManage.editDebtOrder(firstDebt);
                
                // 记录转让金额
                if (tempMoney >= 0)
                {
                    debtTransfer.setProMoney(debtTransfer.getProMoney() - tempMoney);
                    break;
                }
            }
        }
        
        return zqDebtTransfered;
    }
}
