package com._03�����������ַ���֮���ת��;

public class Initial {
	public static void main(String[] args) {
		int number = 89;
		String string = "666";
		/**
		 * �ӻ�������ת�����ַ������͵����ַ���
		 */
		String str1 = Integer.toString(number);		//The first method.
		String str2 = String.valueOf(number);		//The second method.
		String str3 = number + "";						//The thrid method.
		
		/**
		 * ���ַ�������ת�����������͵����ַ���
		 */
		double num1 = Double.parseDouble(string);			//The first method.
		double num2 = Double.valueOf(string);			//The second method.
		
		System.out.println("String str1 = Integer.toString(number)   ���к�str1��ֵΪ��" + str1);		
		System.out.println("String str2 = String.valueOf(number)     ���к�str2��ֵΪ��" + str2);		
		System.out.println("String str3 = number + \"\"                       ���к�str3��ֵΪ��" + str3);	
		
		System.out.println("int num1 = Double.parseDouble(string)���к�num1��ֵΪ��" + num1);		
		System.out.println("int num2 = Double.valueOf(string)         ���к�num2��ֵΪ��" + num2);
	}
}
