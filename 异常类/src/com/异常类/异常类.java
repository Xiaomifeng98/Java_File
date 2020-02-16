package com.异常类;
import java.util.Scanner;

public class 异常类 {
	public static void main(String args[]) throws Exception{
		Scanner input =new Scanner(System.in);
		String S=input.nextLine();
		学号 num=new 学号();
		try{
			num.setnum(Integer.parseInt(S));
		}
		catch(NumberFormatException e){
			System.out.println("你可能输入非法字符！");
		}
		input.close();
	}
}

@SuppressWarnings("serial")
class IntegerException1 extends Exception{
	String message;
	public IntegerException1(int e){
		message="输入的学号"+e+"大于六位数！";
		}
	public String toString(){
		return message;
	}
}

@SuppressWarnings("serial")
class IntegerException2 extends Exception{
	String message;
	public IntegerException2(int e){
		message="输入的学号"+e+"小于六位数！";
		}
	public String toString(){
		return message;
	}
}

class 学号{
	int num;
	public void setnum(int n) throws Exception{
		if(n>999999){
			throw new IntegerException1(n);
		}
		if(n<100000){
			throw new IntegerException2(n);
		}
		if(n>=100000&&n<=999999){
			System.out.println("成功输入6位数学号："+n);
		}
	}
}