package com.引用类型转换;

public class Initial {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Animal animal = new Dog();		//自动类型提升 向上类型转换
		Dog dog = (Dog)animal;			//强制类型转换 向下类型转换
		animal.eat();
		
		//非法，因为watchdoor是子类新增的方法
		/**animal.watchDoor();*/
		dog.watchDoor();
		
		//1.编译时 Cat类型 
		//2.运行时 Dog类型
		//两个类型不匹配，无法进行转换，所以编译器会报错
		/**Cat cat = (Cat)animal;*/
		
		//为防止编译器报错，利用instanceof（返回值的是布尔类型）避免类型转换安全性问题
		if(animal instanceof Cat){
			Cat cat = (Cat)animal;
		}else{
			System.out.println("无法进行强制转换");
		}
	}

}
