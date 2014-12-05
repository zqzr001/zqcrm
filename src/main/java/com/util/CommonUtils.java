/**   
 * @Title: CommonUtils.java 
 * @Package com.tairan.app.bo.util 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lichao   
 * @date 2014年6月17日 下午4:25:37 
 * @version V1.0   
 */
package com.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;


/**
 * @ClassName: CommonUtils
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author lichao
 * @date 2014年6月17日 下午4:25:37

 */
public class CommonUtils
{
    public static final double EARTH_RADIUS = 6378137.0; //地球半径，以米为单位
    
    /*
     * 获取当天时间
     */
    public static Long getStartTime()
    {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime().getTime();
    }
    
    /**
     * 获取今天星期几
     * zhanfeilong
     */
    public static int getWeekOfDate()
    {
        Date dt=new Date();
        int[] weekDays = { 7, 1, 2, 3, 4, 5, 6 };
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0) w = 0;
        return weekDays[w];
    }
    /**
     * @Title: genRandomNum
     * @Description: 返回指定位数的随机数字
     * @param @param pwd_len
     * @param @return 设定文件
     * @return String 返回类型
     * @throws
     */
    public static String genRandomNum(int pwd_len)
    {
        final int maxNum = 36;
        int i;
        int count = 0;
        char[] str = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        StringBuffer pwd = new StringBuffer("");
        Random r = new Random();
        while (count < pwd_len)
        {
            i = Math.abs(r.nextInt(maxNum));

            if (i >= 0 && i < str.length)
            {
                pwd.append(str[i]);
                count++;
            }
        }
        return pwd.toString();
    }

    /**
     * @Title: genRandomStr
     * @Description: 返回指定位数的随机数字或字母
     * @param @param pwd_len
     * @param @return 设定文件
     * @return String 返回类型
     * @throws
     */
    public static String genRandomStr(int pwd_len)
    {
        final int maxNum = 36;
        int i;
        int count = 0;
        char[] str = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        StringBuffer pwd = new StringBuffer("");
        Random r = new Random();
        while (count < pwd_len)
        {
            i = Math.abs(r.nextInt(maxNum));

            if (i >= 0 && i < str.length)
            {
                pwd.append(str[i]);
                count++;
            }
        }
        return pwd.toString();
    }

    /**
     * 日期转换成字符串
     * 
     * @param date
     * @return str
     */
    public static String DateToStr(Date date, String formatString)
    {
        SimpleDateFormat format = null;
        format = new SimpleDateFormat(formatString);
        String str = format.format(date);
        return str;
    }

    public static String getSignatureSeed(Long userNum)
    {
        StringBuffer seed = new StringBuffer();
        seed.append(userNum);
        Date date = new Date();
        String dateStr = DateToStr(date, "yyyyMMddHHmmss");
        seed.append(dateStr);
        seed.append(genRandomStr(8));
        return seed.toString();
    }

    public static boolean isEmpty(String str)
    {
        if (str == null || "".equals(str))
        {
            return true;
        }
        return false;
    }

    public static boolean isEmpty(Object obj)
    {
        if (obj == null)
        {
            return true;
        }
        return false;
    }

    // 首字母转小写
    public static String toLowerCaseFirstOne(String s)
    {
        if (Character.isLowerCase(s.charAt(0))) return s;
        else return (new StringBuilder()).append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
    }

    // 首字母转大写
    public static String toUpperCaseFirstOne(String s)
    {
        if (Character.isUpperCase(s.charAt(0))) return s;
        else return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
    }
    
    /** 
     * 地球经度或纬度转化为弧度(rad) 
     * */  
    private static double rad(double d)  
    {  
       return d * Math.PI / 180.0;  
    }
    
    /** 
     * 基于googleMap中的算法得到两经纬度之间的距离,计算精度与谷歌地图的距离精度差不多，相差范围在0.2米以下 
     * @param lon1 第一点的精度 
     * @param lat1 第一点的纬度 
     * @param lon2 第二点的精度 
     * @param lat3 第二点的纬度 
     * @return 返回的距离，单位m 
     * */  
    public static double GetDistance(double lon1,double lat1,double lon2, double lat2)  
    {  
       double radLat1 = rad(lat1);  
       double radLat2 = rad(lat2);  
       double a = radLat1 - radLat2;  
       double b = rad(lon1) - rad(lon2);  
       double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a/2),2)+Math.cos(radLat1)*Math.cos(radLat2)*Math.pow(Math.sin(b/2),2)));  
       s = s * EARTH_RADIUS;  
       //s = Math.round(s * 10000) / 10000;  
       return s;  
    }
}
