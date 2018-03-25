package com.ange.tool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateHandle {

	public static final String MS = "yyyy-MM-dd HH:mm:ss.SSS";
	public static final String S = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 获得当前的时间字符串，格式为 yyyy-MM-dd HH:mm:ss.SSS
	 * 
	 * @return 当前的时间的字符串
	 */
	public static String getCurrent() {
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat format = new SimpleDateFormat(MS);
		return format.format(date);
	}

	/**
	 * 获得当前的时间字符串
	 * 
	 * @param style
	 *            指定字符串的格式
	 * @return 当前的时间的字符串
	 */
	public static String getCurrent(String style) {
		Date date = new Date(System.currentTimeMillis());
		if (style == null)
			style = "yyyy-MM-dd HH:mm:ss.SSS";
		SimpleDateFormat format = new SimpleDateFormat(style);
		return format.format(date);
	}

	/**
	 * 毫秒值转字符串
	 * 
	 * @param style
	 *            指定字符串的格式
	 * @return 日期的字符串
	 */
	public static String toString(String style, long time) {
		Date date = new Date(time);
		SimpleDateFormat format = new SimpleDateFormat(style);
		return format.format(date);
	}

	/**
	 * 字符串转日期
	 * 
	 * @param style
	 *            指定字符串的格式
	 * @param str
	 *            日期字符串
	 * @return java.util.Date日期对象
	 */
	public static Date toDate(String style, String str) {
		SimpleDateFormat format = new SimpleDateFormat(style);
		Date date = null;
		try {
			date = format.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * 修改日期字符串的格式
	 * 
	 * @param oldStyle
	 *            原来的格式
	 * @param newStyle
	 *            修改后的格式
	 * @param oldString
	 *            原来的字符串
	 * @return 修改后的字符串
	 */
	public static String change(String oldStyle, String newStyle, String oldString) {
		SimpleDateFormat oldFormat = new SimpleDateFormat(oldStyle);
		SimpleDateFormat newFormat = new SimpleDateFormat(newStyle);
		Date date = null;
		try {
			date = oldFormat.parse(oldString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return newFormat.format(date);
	}

	/**
	 * 
	 * 计算日期差值（字符串形式）
	 * 
	 * @param smdate
	 * 
	 *            日期1 格式yyyy-MM-dd
	 * 
	 * @param bdate
	 * 
	 *            日期2 格式yyyy-MM-dd
	 * 
	 * @return
	 * 
	 * @throws ParseException
	 * 
	 */
	public static int daysBetween(String smdate, String bdate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse(smdate));
		long time1 = cal.getTimeInMillis();
		cal.setTime(sdf.parse(bdate));
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / (1000 * 3600 * 24);
		return Integer.parseInt(String.valueOf(between_days));
	}

	/**
	 * 
	 * 获取当前时间（分年、月、日、星期、当前月第几周）
	 * 
	 * 
	 * 
	 * @return 一维数组【0年份 1月份 2日期 3星期几 4当前月第几周】
	 * 
	 */
	public static String[] getTimeArray() {
		String[] str = new String[5];
		Calendar a = Calendar.getInstance();
		str[0] = "" + a.get(Calendar.YEAR);
		if ((a.get(Calendar.MONTH) + 1) < 10) {
			str[1] = "0" + (a.get(Calendar.MONTH) + 1);
		} else {
			str[1] = "" + (a.get(Calendar.MONTH) + 1);
		}
		if ((a.get(Calendar.DATE)) < 10) {
			str[2] = "0" + (a.get(Calendar.DATE));
		} else {
			str[2] = "" + (a.get(Calendar.DATE));
		}
		str[3] = "" + (a.get(Calendar.DAY_OF_WEEK) - 1);
		a.setFirstDayOfWeek(Calendar.MONDAY);
		str[4] = "" + a.get(Calendar.WEEK_OF_MONTH);
		return str;
	}

	/**
	 * 
	 * 获取当前周的周一
	 * 
	 * @return yyyy-MM-dd
	 * 
	 */
	public static String getCurrentMonday() {

		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DAY_OF_MONTH, -1); // 解决周日会出现 并到下一周的情况

		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.format(cal.getTime());
	}

	/**
	 * 获取指定日期所在季度第一天的日期
	 * 
	 * @return String
	 */
	public static String getCurrentQuarterFirstDay() {
		Calendar cal = Calendar.getInstance();
		;
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		if (month == 1 || month == 2 || month == 3) {
			month = 1;
		} else if (month == 4 || month == 5 || month == 6) {
			month = 4;
		} else if (month == 7 || month == 8 || month == 9) {
			month = 7;
		} else {
			month = 10;
		}

		if (month < 10) {
			return year + "-0" + month + "-01";
		} else {
			return year + "-" + month + "-01";
		}
	}

	/**
	 * 知道差距天数 计算日期
	 * 
	 * @param day
	 *            差距的天数
	 * @return 日期
	 */
	public static String dateGapGetDate(int day, String str) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = format.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
		long i = date.getTime() / 1000;
		i += day * 24 * 60 * 60;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date dates = new Date(i * 1000);
		return simpleDateFormat.format(dates);

	}

	public static long stringToTimestamp(String format, String time) {
		if (format == null) {
			format = "yyyy-MM-dd HH:mm:ss";
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		Date date = null;
		try {
			date = simpleDateFormat.parse(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date.getTime();
	}

	/**
	 * 获取当月最后一天日期字符串
	 * @return yyyy-MM-dd
	 */
	public static String getLastDate() {
		Calendar cale = null;
		cale = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		cale = Calendar.getInstance();
		cale.add(Calendar.MONTH, 1);
		cale.set(Calendar.DAY_OF_MONTH, 0);
		return format.format(cale.getTime());
	}

	
}
