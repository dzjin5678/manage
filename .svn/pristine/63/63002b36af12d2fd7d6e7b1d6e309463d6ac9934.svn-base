package com.ange.tool;

import java.security.MessageDigest;

public class MD5 {
	
	
    
    /**
	 * 获得明码MD5加密后的32位字符串
	 * @param clearText 要加密的字符串
	 * @return 加密后的字符串
	 */
    public static String encodePA(String clearText) {
    	char hexDigits[]={'P','O','N','M','L','K','J','I','H','G','F','E','D','C','B','A'};
    	return new MD5("MD5",hexDigits).encode(clearText);
    }


    
    
    
    
    
    /**
	 * 获得明码MD5加密后的32位字符串
	 * @param clearText 要加密的字符串
	 * @return 加密后的字符串
	 */
    public static String encodePA2(String clearText) {
    	char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9','A', 'B', 'C', 'D', 'E', 'F' };
    	return new MD5("MD5",hexDigits).encode(clearText);
    }

    
    
    
    
    private String algorithm;
    private char hexDigits[]={ '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
	
	/**
	 * @param algorithm 算法名字
	 */
	public MD5(String algorithm){
		this.algorithm=algorithm;
	}
	/**
	 * 
	 * @param algorithm 算法名字
	 * @param hexDigits 一个长度为16的字符数组，生成的摘要的元素
	 */
	public MD5(String algorithm,char hexDigits[]){
		this.algorithm=algorithm;
		this.hexDigits=hexDigits;
	}

	/**
	 * 获得明码MD5加密后的32位字符串
	 * @param clearText 要加密的字符串
	 * @return 加密后的字符串
	 */
    public String encode(String clearText) {

       try {
            byte[] btInput = clearText.getBytes();
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance(algorithm);
            // 使用指定的字节更新摘要
            mdInst.update(btInput);
           // 获得密文
           byte[] md = mdInst.digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
