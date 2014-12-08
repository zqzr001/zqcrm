package com.whatbi.zq;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.whatbi.zq.dal.persistence.ZqUserMapperExt;

/** 
 * @author yinjie 
 * @version 创建时间：2014年12月5日 下午5:20:47 
 * 类说明 
 */
@Controller
public class Info
{

    @Resource
    private ZqUserMapperExt zqUserMapperExt;
    
    @RequestMapping("/getUser")
    public void getUser()
    {
        System.out.println(zqUserMapperExt.selectByPrimaryKey(1l).getUserName());
    }
}
