package com.ange.tool;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class Json{
	
	
	/**
	 * 按照JSON的意义去强制转换一个对象
	 * @param obj 需要转换的对象
	 * @param cls 期望对象的的类
	 * @return cls类型的obj对象
	 */
	@SuppressWarnings("unchecked")
	public static <T> T cast(Object obj,Class<T> cls){
		if(cls==null)
			return null;
		if(obj!=null){
			return parse(tojson(obj), cls);
		}
		try {
			return cls.newInstance();
		} catch (Exception e) {
		}
		if("byte".equals((cls.toString()))) return (T) new Byte((byte) 0);
		else if("short".equals((cls.toString()))) return (T) new Short((short)0);
		else if("int".equals((cls.toString()))) return (T) new Integer(0);
		else if("long".equals((cls.toString()))) return (T) new Long(0L);
		else if("float".equals((cls.toString()))) return (T) new Float(0.0f);
		else if("double".equals((cls.toString()))) return (T) new Double(0.0d);
		else if("char".equals((cls.toString()))) return (T) new Character('\u0000');
		else if("boolean".equals((cls.toString()))) return (T) new Boolean(false);
		else return null;
	}

	/**
	 * 把一个普通对象转化成json字符串
	 * @param obj 要转化的对象
	 * @return json字符串
	 */
	public static String tojson(Object obj){
		return new Gson().toJson(obj);
	}
	
	/**
	 * 把一个简单的JSON字符串解析成一个java对象，对象不能是一个泛型对象
	 * @param jsonString JSON字符串
	 * @param cls 解析后的对象的类名.class
	 * @return 一个java对象
	 */
	public static <T> T parse(String jsonString, Class<T> cls) {
        T t = null;
        try {
            Gson gson = new Gson();
            t = gson.fromJson(jsonString, cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }
	
	/**
	 * 将一个复杂的JSON字符串转化成一个java对象，可以解析泛型对象
	 * @param jsonString 要转化的JSON字符串
	 * @param model 一般写为【new TypeToken<T>(){}】 ,其中T表示解析后的类型
	 * @return
	 */
	public static <T> T parse(String jsonString, TypeToken<T> template) {
		T res = null;
        try {
            Gson gson = new Gson();
            res = gson.fromJson(jsonString, template.getType());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }	
	
	/**

	 * 将obj对象转化成json字符串响应给前端，一次请求只能响应一次

	 * @param obj 需要响应的对象

	 */
	public static void response(Object obj,HttpServletRequest request, HttpServletResponse response) {
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = null;
		try {
		    out = response.getWriter();
		    out.write(obj.toString());
		    out.flush();
		    request.setAttribute("response", obj);
		} catch (IOException e) {
		    e.printStackTrace();
		} 
	}
}
