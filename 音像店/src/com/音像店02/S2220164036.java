package com.音像店02;

//此程序有问题，不想改
import java.util.*;
import java.io.*;
public class S2220164036 {
	public static void main(String[] args) {
		String File_String;
		int i=0,k=1;
		double sum=0;
		//分隔符
		String Regex = "\n";
		String Regex2 = ",";
		//读取
		Scanner File_SC;
		File file = new File("oop1802.txt");
		try {
			File_SC = new Scanner(file);
			while(File_SC.hasNext()){
				File_SC.useDelimiter(Regex);
				File_String = File_SC.nextLine();
				if(File_String.length() == 0)i++;
				if(i == 1 && k == 1){
					System.out.println("费用总计:"+sum);
					sum = 0;
					i = 0;
				}
				String Words[] = File_String.split(Regex2);
				if(File_String.length()!=0){
					i = 0;
				}
				if(Words.length != 5){
					System.out.println("输入有误");
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
		if(type.equals("美国片") || type.equals("欧洲片")){
			Danjia=3;
			another=0.5;
		}else if(type.equals("国产片")) {
			Danjia=1;
		}else if(type.equals("日韩片") || type.equals("其他地区片")){
			Danjia=2;
			another=0.2;
		}else{
			System.out.println("输入有误");
		}
		if(IsNew.equals("是"))
			new1=2;
		else if(IsNew.equals("否")){
			new1 = 1;
		}
		else{
			System.out.println("输入有误");
		}
		if(IsCon.equals("是"))
			number=(number+1)/2;
		else if(IsCon.equals("否"))
			System.out.println("输入有误");
		sum=Danjia*number*new1* days*(1+another);
	}
}