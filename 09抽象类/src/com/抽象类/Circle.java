package com.抽象类;

public class Circle extends Calculate {
	public void area() {
		System.out.println("半径为5的圆的面积为："+5*5*3.14);
	}

	public void length() {
		
		//控制小数位数可以用C语言的方法
		System.out.printf("半径为5的圆的周长为：%.2f",5*2*3.14);
	}

}
