package com._03基本类型与字符串之间的转换;

public class Initial {
	public static void main(String[] args) {
		int number = 89;
		String string = "666";
		/**
		 * 从基本类型转换到字符串类型的三种方法
		 */
		String str1 = Integer.toString(number);		//The first method.
		String str2 = String.valueOf(number);		//The second method.
		String str3 = number + "";						//The thrid method.
		
		/**
		 * 从字符串类型转换到基本类型的两种方法
		 */
		double num1 = Double.parseDouble(string);			//The first method.
		double num2 = Double.valueOf(string);			//The second method.
		
		System.out.println("String str1 = Integer.toString(number)   运行后str1的值为：" + str1);		
		System.out.println("String str2 = String.valueOf(number)     运行后str2的值为：" + str2);		
		System.out.println("String str3 = number + \"\"                       运行后str3的值为：" + str3);	
		
		System.out.println("int num1 = Double.parseDouble(string)运行后num1的值为：" + num1);		
		System.out.println("int num2 = Double.valueOf(string)         运行后num2的值为：" + num2);
	}
}
