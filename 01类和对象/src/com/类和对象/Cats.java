package com.类和对象;

//定义一个class类，类名叫做Cats；
	//那么Cats是什么样的，就是它的特征（在类里面叫做属性）；
	//Cats能够做什么是它的行为（在类里面叫做方法）；
public class Cats {
	
	//定义类的属性：年龄，重量，长度；
	int age;
	float Weight;
	float Length;
	
	//定义类的方法：猫的行为
	public void Catch(){
		System.out.println("猫能够捉老鼠");
	}
	public void Sleep(){
		System.out.println("猫会睡觉");
	}
	
}
