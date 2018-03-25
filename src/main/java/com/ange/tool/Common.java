package com.ange.tool;

public class Common {
	
	private static Integer EffectiveTime =30;//有效时间 单位分钟
	private static String SecretKey="angeKey";//密钥 

	public static Integer getEffectiveTime() {
		return EffectiveTime;
	}

	public static void setEffectiveTime(Integer effectiveTime) {
		EffectiveTime = effectiveTime;
	}

	public static String getSecretKey() {
		return SecretKey;
	}

	public static void setSecretKey(String secretKey) {
		SecretKey = secretKey;
	}
	
}
