/*分析输出结果，体会构造函数和一般成员函数在继承中的区别，
 *程序运行完后写出本程序中的构造函数和一般成员函数在继承中的具体区别。*/

/* 继承中，若要运行子类的成员函数，就要先运行父类的构造函数，然后运行子类的构造函数，最后是子类的一般成员函数。
 * 继承中，构造函数默认运行，一般成员函数不是。*/
package com.实验4_1;

class A1{
	protected void print(String s){
		System.out.println(s);
	}
	A1(){
		print("A1()");
	}
	public void f(){
		print("A1:f()");
	}
}
class B1 extends A1{
	B1(){
		print("B1()");
	}
	public void f(){
		print("B1:f()");
	}
}
public class Test1{
	public static void main(String[] arg){
		B1 b = new B1();
		b.f();
	}
}

