package com._02装箱与拆箱;

public class Initial {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double score1 = 92.6;
		Double score2 = new Double(score1);	//手动装箱
		Double score3 = score1;							//自动装箱
		
		Double number1 = 67.8;
		double number2 = number1.doubleValue();	//手动拆箱
		double number3 = number1;							//自动拆箱
		
		System.out.println("Double score2 = new Double(score1)运行后score2的值：" + score2);
		System.out.println("Double score3 = score1运行后score3的值：" + score3);
		
		System.out.println("double number2 = number1.doubleValue()运行后number2的值：" + number2);
		System.out.println("double number3 = number1运行后number3的值：" + number3);
		
	}

}
