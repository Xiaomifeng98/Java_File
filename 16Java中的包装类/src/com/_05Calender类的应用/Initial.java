package com._05Calender类的应用;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@SuppressWarnings("unused")
public class Initial {
	public static void main(String[] args) {
		
		//创建Calendar对象
		Calendar c = Calendar.getInstance();
		
		//获取日期数据
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		//输出日期
		System.out.println("当前Calendar时间：" + year + "-" + month + "-" + day + " " + hour + "" + ":" + minute + ":" + second);
		
		//将Calendar对象转换为Date对象
		Date date = c.getTime();	
		
		//获取当前毫秒数
		Long time = c.getTimeInMillis();	
		
		System.out.println("当前Date的时间：" + date);
		System.out.println("当前time的毫秒数：" + time);
		
	}
}
