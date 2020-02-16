package com.抽象类;

public class Rectangle extends Calculate {

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("长为5宽为2的长方形面积为："+5*2);
	}

	@Override
	public void length() {
		// TODO Auto-generated method stub
		System.out.println("长为5宽为2的长方形周长为："+(5+2)*2);

	}

}
