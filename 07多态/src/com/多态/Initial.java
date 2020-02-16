package com.多态;

public class Initial {

	public static void main(String[] args) {
		// 把这种情况叫做多态
		Animal obj1 = new Animal();
		Animal obj2 = new Dog();
		Animal obj3 = new Cat();
		//Dog obj3 = new Animal();错误
		
		//调用的是父类中的方法
		obj1.eat();
		
		//调用的是子类的方法
		obj2.eat();
		//obj2.watchDoor();父类里面没有这个方法，就算子类里面有也不行
		
		//如果obj3里面没有eat的方法，那么会调用父类里面的eat方法
		obj3.eat();
	}

}
