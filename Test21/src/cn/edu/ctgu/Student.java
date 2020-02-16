package cn.edu.ctgu;

public class Student {
	private	int no;
	private	String name;
	private	String sex;
	Student(){
	}
	Student(int n,String na,String se){
		no=n;name=na;sex=se;
	}
	public int GetNo(){
		return no;
	}
	public String GetName(){
		return name;
	}

	public String GetSex(){
		return sex;
	}

	public void SetNo(int n){
		no = n;
	}

	public void SetName(String m){
		name = m;
	}

	public void SetSex(String s){
		sex = s;
	}
}
