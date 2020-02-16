package com.Java³ÌÐò3;

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

