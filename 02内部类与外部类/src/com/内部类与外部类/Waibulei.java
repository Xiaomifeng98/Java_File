package com.内部类与外部类;

public class Waibulei {
	static int score =90;
	String name="baobao";
	
	//内部类
	public class Neibulei{
		int score =100;
		String name = "xiaokeai";
		public void show(){
			System.out.println("访问外部类的静态成员变量score："+Waibulei.score);
			System.out.println("访问内部类的非静态成员变量score："+score);
			System.out.println("访问外部类的非静态成员变量name："+Waibulei.this.name);
			System.out.println("访问内部类的非静态成员变量name："+name);
		}
	}
	
	public static void main(String args[]){
		Waibulei Wai =new Waibulei();
		Neibulei Nei =Wai.new Neibulei();
		Nei.show();
	}
}
