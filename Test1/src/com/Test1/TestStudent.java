package com.Test1;

public class TestStudent {
	Student St=new Student();
	void get(int a,String b,String c){
		St.no=a;
		St.name=b;
		St.sex=c;
	}
	void set(){
		System.out.println(""+St.no);
		System.out.println(""+St.name);
		System.out.println(""+St.sex);
	}
}
