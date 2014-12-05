package com.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;

/**
 * 类DataTypeTransform.java的实现描述：数据转换工具
 * 
 * @author yinjie 2014年6月9日 下午7:32:47
 */
public class DataTypeTransform
{

    public static byte[] toByteByFileString(String fileStr) throws UnsupportedEncodingException
    {
        return fileStr.getBytes("ISO-8859-1");
    }
    
    public static String toFileStringByByte(byte[] fileByte) throws UnsupportedEncodingException
    {
        return new String(fileByte, "ISO-8859-1");
    }
    
    /**
     * 对象转数组
     * 
     * @param obj
     * @return
     */
    public static byte[] toByteArray(Object obj)
    {
        byte[] bytes = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;

        try
        {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(obj);
            oos.flush();
            bytes = bos.toByteArray();
            oos.close();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            if (null != oos)
            {
                try
                {
                    oos.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }

            if (null != bos)
            {
                try
                {
                    bos.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }

        return bytes;
    }

    /**
     * 数组转对象
     * 
     * @param obj
     * @return
     * @throws ClassNotFoundException
     */
    public static Object toObject(byte[] databyte) throws ClassNotFoundException, java.io.IOException
    {
        ByteArrayInputStream bis = new ByteArrayInputStream(databyte);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Object obj = ois.readObject();

        ois.close();
        bis.close();

        return obj;
    }

    /**
     * byte数组转换为Int
     * 
     * @param bRefArr
     * @return
     */
    public static int toInt(byte[] bRefArr)
    {
        return getInt(bRefArr, 0);
    }
    
    /**
     * Int 转换为 byte数组
     * 
     * @param iSource
     * @param iArrayLen
     * @return
     */
    public static byte[] toByteArray(int iSource)
    {
        return getBytes(iSource, new byte[4]);
    }

    public static byte[] getBytes(int iSource, byte[] b)
    {
        b[0] = (byte) (iSource >> 0 & 0xFF);
        b[1] = (byte) (iSource >> 8 & 0xFF);
        b[2] = (byte) (iSource >> 16 & 0xFF);
        b[3] = (byte) (iSource >> 24 & 0xFF);

        return b;
    }

    public static boolean getBoolean(byte[] b, int off)
    {
        return b[off] != 0;
    }
    
    public static char getChar(byte[] b, int off)
    {
        return (char) ((b[off + 1] & 0xFF) + (b[off] << 8));
    }

    public static short getShort(byte[] b, int off)
    {
        return (short) ((b[off + 1] & 0xFF) + (b[off] << 8));
    }

    public static int getInt(byte[] b, int off)
    {
        return ((b[off] & 0xFF)) + ((b[off + 1] & 0xFF) << 8) + ((b[off + 2] & 0xFF) << 16) + ((b[off + 3]) << 24);
    }

    public static float getFloat(byte[] b, int off)
    {
        return Float.intBitsToFloat(getInt(b, off));
    }

    public static long getLong(byte[] b, int off)
    {
        return ((b[off + 7] & 0xFFL)) + ((b[off + 6] & 0xFFL) << 8) + ((b[off + 5] & 0xFFL) << 16)
               + ((b[off + 4] & 0xFFL) << 24) + ((b[off + 3] & 0xFFL) << 32) + ((b[off + 2] & 0xFFL) << 40)
               + ((b[off + 1] & 0xFFL) << 48) + (((long) b[off]) << 56);
    }

    public static double getDouble(byte[] b, int off)
    {
        return Double.longBitsToDouble(getLong(b, off));
    }

    public static void putBoolean(byte[] b, int off, boolean val)
    {
        b[off] = (byte) (val ? 1 : 0);
    }

    public static void putChar(byte[] b, int off, char val)
    {
        b[off + 1] = (byte) (val);
        b[off] = (byte) (val >>> 8);
    }

    public static void putShort(byte[] b, int off, short val)
    {
        b[off + 1] = (byte) (val);
        b[off] = (byte) (val >>> 8);
    }

    public static void putInt(byte[] b, int off, int val)
    {
        b[off + 3] = (byte) (val);
        b[off + 2] = (byte) (val >>> 8);
        b[off + 1] = (byte) (val >>> 16);
        b[off] = (byte) (val >>> 24);
    }

    public static void putFloat(byte[] b, int off, float val)
    {
        putInt(b, off, Float.floatToIntBits(val));
    }

    public static void putLong(byte[] b, int off, long val)
    {
        b[off + 7] = (byte) (val);
        b[off + 6] = (byte) (val >>> 8);
        b[off + 5] = (byte) (val >>> 16);
        b[off + 4] = (byte) (val >>> 24);
        b[off + 3] = (byte) (val >>> 32);
        b[off + 2] = (byte) (val >>> 40);
        b[off + 1] = (byte) (val >>> 48);
        b[off] = (byte) (val >>> 56);
    }

    public static void putDouble(byte[] b, int off, double val)
    {
        putLong(b, off, Double.doubleToLongBits(val));
    }
}
