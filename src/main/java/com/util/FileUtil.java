package com.util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;

/**
 * 
 * 类FileUtil.java的实现描述：关于文件处理的一些公共方法 
 * @author yinjie 2014年6月24日 下午1:25:37
 */
public class FileUtil
{
    private static Random random = new Random();
    private static SimpleDateFormat format = new SimpleDateFormat("/yyyy/MM/dd/HH");
    private static Calendar cal = Calendar.getInstance();
    
    static
    {
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
    }
    
    /**
     * 获取文件存储路径
     * 
     * @return FileUrl
     */
    private static String getFileUrl()
    {
        return format.format(cal.getTime());
    }
    
    /**
     * 获取文件名称
     * 
     * @return FileName
     */
    private static String getFileName()
    {
        return cal.getTime().getTime() + String.valueOf(random.nextLong()).substring(1, 4);
    }
    
    /**
     * 根据文件后辍名, 生成文件存储目录
     * 
     * @param suffixName
     * @return
     */
    public static String getFilePath(String suffixName)
    {
        return getFileUrl() + File.separatorChar + getFileName() + suffixName;
    }
}
