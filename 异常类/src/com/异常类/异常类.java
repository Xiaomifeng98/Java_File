package com.�쳣��;
import java.util.Scanner;

public class �쳣�� {
	public static void main(String args[]) throws Exception{
		Scanner input =new Scanner(System.in);
		String S=input.nextLine();
		ѧ�� num=new ѧ��();
		try{
			num.setnum(Integer.parseInt(S));
		}
		catch(NumberFormatException e){
			System.out.println("���������Ƿ��ַ���");
		}
		input.close();
	}
}

@SuppressWarnings("serial")
class IntegerException1 extends Exception{
	String message;
	public IntegerException1(int e){
		message="�����ѧ��"+e+"������λ����";
		}
	public String toString(){
		return message;
	}
}

@SuppressWarnings("serial")
class IntegerException2 extends Exception{
	String message;
	public IntegerException2(int e){
		message="�����ѧ��"+e+"С����λ����";
		}
	public String toString(){
		return message;
	}
}

class ѧ��{
	int num;
	public void setnum(int n) throws Exception{
		if(n>999999){
			throw new IntegerException1(n);
		}
		if(n<100000){
			throw new IntegerException2(n);
		}
		if(n>=100000&&n<=999999){
			System.out.println("�ɹ�����6λ��ѧ�ţ�"+n);
		}
	}
}