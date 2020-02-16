package com._04date和SimpleDateFormat类表示时间;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Initial {

	public static void main(String[] args) {
		
		/**
		 * 将日期转换为指定格式的文本
		 */
		// 创建Date对象，表示当前时间
		Date m = new Date();
		System.out.println("利用Date直接输出日期：" + m);
		
		//创建SimpleDateFormat对象，指定目标格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		
		//使用format()方法，格式化时间，转换为指定格式字符串
		String today = sdf.format(m);
		
		//输出转换后的字符串
		System.out.println(today);
		
		/**
		 * 将指定的文本转换为日期
		 */
		//创建日期格式字符串
		String day = "2019年06月20日 20:58:24";
		
		//创建SimpleDateFormat对象，指定字符串格式
		SimpleDateFormat SDF = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
	
		try {
			//调用parse()方法，将字符串转为日期
			Date d = SDF.parse(day);
			
			//输出转换后的时间
			System.out.println("指定文本转换为日期：" + d);
			
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		
		
	}

}
