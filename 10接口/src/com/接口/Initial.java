package com.接口;

public class Initial {
	public static void main(String args[]){
		Jiekou jiekou = new Lei();
		jiekou.show();
		
		/**
		 * 匿名内部类，在定义的时候不关注内部类的名字，仅仅在使用的时候定义的，语法格式
		 * Interface i = new Interface(){
		 * 		public void method(){
		 * 			System.out.println("匿名内部类实现接口的方式");
		 * 		}
		 * }
		 */
		
		Jiekou jiekou2 = new Jiekou(){
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("使用匿名内部类的方式实现接口");
			}
		};//需要打上分号
		jiekou2.show();
		
		new Jiekou(){
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("使用另一种匿名内部类的方式实现接口");
			}
		}.show();
		
	}
}
