package com.ange.tool;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Property {

	private static Map<String, Property> allprop=new HashMap<String, Property>();
	private static boolean debugMode=false;
	private Properties prop = new Properties();
	private String pathName=null;

	public Property(String filePath){
		try{
			String path = Thread.currentThread().getContextClassLoader()
					.getResource(filePath).getPath();    
			InputStream in = new FileInputStream(path);
			prop.load(in); 
			in.close();
			this.pathName=filePath;
		}
		catch(Exception e){
			System.err.println("加载配置文件："+filePath+"时出错");
			e.printStackTrace();
		}
	}

	/**
	 * 使用文件路径或者别名获的一个Property对象
	 * @param name 文件路径或别名
	 * @return
	 */
	public static Property getFile(String name){
		Property pro=allprop.get(name);
		if(pro==null && name.endsWith(".properties")){
			Property p=new Property(name);
			allprop.put(name, p);
			return p;
		}
		return pro;
	}

	/**
	 * 查看当前是否是debug模式
	 * @return true是，false不是
	 */
	public static boolean isDebugMode() {
		return debugMode;
	}

	/**
	 * 设置当前模式是否是debug模式，如果是表示每次取值时都加载文件，实时更新
	 * @param debugMode true实时更新，效率低；false不实时更新，效率高
	 */
	public static void setDebugMode(boolean debugMode) {
		Property.debugMode = debugMode;
	}

	/**
	 * 从某个配置文件中取出键为key的值
	 * @param key
	 * @return
	 */
	public String getValue(String key){
		if(key==null)
			return null;
		if(debugMode){
			try{
				String path = Thread.currentThread().getContextClassLoader()
						.getResource(this.pathName).getPath();    
				InputStream in = new FileInputStream(path);
				prop.load(in); 
				in.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		
		String value=prop.getProperty(key);
		if(value==null)
			return null;
		try {
			return new String(value.getBytes("ISO8859_1"), "UTF-8").trim();
		} catch (UnsupportedEncodingException e) {
			System.err.println("转换编码时出错");
		}
		return null;
	}
	/**
	 * 给配置文件设置一个别名,不能以.properties结尾
	 * @param name 别名
	 * @return 设置成功返回true
	 */
	public boolean setFileNickname(String name){
		if(name.endsWith(".properties"))
			return false;
		if(allprop.get(name)==null){
			allprop.put(name, this);
			return true;
		}
		System.err.println("别名 "+name+" 已经注册过了，不能重复注册");
		return false;
	}

}
