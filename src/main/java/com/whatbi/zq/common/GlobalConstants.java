package com.whatbi.zq.common;

/** 
 * @author yinjie 
 * @version 创建时间：2014年12月10日 下午10:16:15 
 * 类说明 : 公共变量
 */
public class GlobalConstants
{

    private GlobalConstants()
    {
        // 私有化构造方法, 禁止创建实例
    }

    //原始债权可用余额修改的对象锁
    public static final Object DEBT_USE_MONEY_LOCK = new Object();
    
    //30年的毫秒数             秒 * 分钟 * 小时 * 日 * 月 * 年  
    public static final long MAX_END_DATE = 1000 * 60 * 60 * 24 * 30 * 12 * 30;
    
}
