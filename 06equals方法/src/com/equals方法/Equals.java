package com.equals方法;

public class Equals {
	public static void main(String args[]){
		Telephone Tel = new Telephone();
		Tel.CPU = 2.4;
		Tel.RAM = 4;
		Tel.size = 6.0;
		Telephone Tel2 = new Telephone();
		Tel2.CPU = 2.4;
		Tel2.RAM = 4;
		Tel2.size = 6.0;
		
		//只是比较两个对象的内存地址是否相同
		//虽然是一个类型创建的对象，但是他们的内存地址是不一样的，所以他们的值也不一样
		//
		if(Tel.equals(Tel2)){
			System.out.println("两个对象是相同的");
		}else System.out.println("两个对象是不同的");
		
	}
}
