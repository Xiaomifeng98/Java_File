package com.�����02;

//�˳��������⣬�����
import java.util.*;
import java.io.*;
public class S2220164036 {
	public static void main(String[] args) {
		String File_String;
		int i=0,k=1;
		double sum=0;
		//�ָ���
		String Regex = "\n";
		String Regex2 = ",";
		//��ȡ
		Scanner File_SC;
		File file = new File("oop1802.txt");
		try {
			File_SC = new Scanner(file);
			while(File_SC.hasNext()){
				File_SC.useDelimiter(Regex);
				File_String = File_SC.nextLine();
				if(File_String.length() == 0)i++;
				if(i == 1 && k == 1){
					System.out.println("�����ܼ�:"+sum);
					sum = 0;
					i = 0;
				}
				String Words[] = File_String.split(Regex2);
				if(File_String.length()!=0){
					i = 0;
				}
				if(Words.length != 5){
					System.out.println("��������");
					k = 0;
					continue;
					}
				rent p=new rent(Words);
				sum+=p.sum;
				k=1;
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

class rent {
	int Danjia;
	int new1;
	int m;
	double sum=0;
	double another=0;
	public String type;
	public int number;
	public String IsNew;
	public int days;
	public String IsCon;
	public rent() {}
	public rent(String  word[]){
		type=word[0];
		number=Integer.parseInt(word[1].toString());
		IsNew=word[2];
		days=Integer.parseInt(word[3].toString());
		IsCon=word[4];
		if(type.equals("����Ƭ") || type.equals("ŷ��Ƭ")){
			Danjia=3;
			another=0.5;
		}else if(type.equals("����Ƭ")) {
			Danjia=1;
		}else if(type.equals("�պ�Ƭ") || type.equals("��������Ƭ")){
			Danjia=2;
			another=0.2;
		}else{
			System.out.println("��������");
		}
		if(IsNew.equals("��"))
			new1=2;
		else if(IsNew.equals("��")){
			new1 = 1;
		}
		else{
			System.out.println("��������");
		}
		if(IsCon.equals("��"))
			number=(number+1)/2;
		else if(IsCon.equals("��"))
			System.out.println("��������");
		sum=Danjia*number*new1* days*(1+another);
	}
}