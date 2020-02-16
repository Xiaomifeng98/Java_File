package com.音像店;


import java.util.*;
import java.io.*;

public class Baobao {
	public static void main(String args[]) {
		//从文件读取的字符串File_String,每一行分开Word[]
		String File_String;	
		int Danjia,Sum=0,New,i=0,k=1;
		
		//设置分隔符
		String Regex = "\n";
		String Regex2 = ",";
		
		
		//定义文件对象
		File file = new File("oop1802.txt");

		Scanner File_SC;
		try {
			File_SC = new Scanner(file);
			
			//设置循环扫描下一行并返回布尔值
			while(File_SC.hasNext()){
				File_SC.useDelimiter(Regex);
				File_String = File_SC.nextLine();
				
				//当有三个空行的时候就输出Sum,控制变量i
				//有时候i=3但是上一个Sum有问题，所以用k控制，当有问题时，k=1
				if(File_String.length() == 0)
					i++;
				if(i == 3 && k == 1){
					System.out.println("费用总计:"+Sum+"\n");
					Sum = 0;
					i = 0;
				}
				
				//简单的说如果读取的那一行不是空的话就继续执行
				if(File_String.length()!=0){
					i = 0;
					
					//把字符串分割成几个数组
					String Words[] = File_String.split(Regex2);
					
					//正常情况下Words应该有5个数组，如果不对的话就提示错误（我最后解决的就是这个）
					if(Words.length != 5){
						System.out.println("输入有误\n");
						k = 0;
						continue;
					}
					
					String MovieType = Words[0];
					
					float MovieNum = Float.parseFloat(Words[1].toString());
					//判断数字是否位小数或者小于等于零的数字，下面一样
					if((int)MovieNum != MovieNum||MovieNum <= 0){
						System.out.println("输入有误\n");
						k = 0;
						continue;
					}
					
					String IsNew = Words[2];
					
					float Lend = Float.parseFloat(Words[3].toString());
					if((int)Lend != Lend||Lend <= 0){
						System.out.println("输入有误\n");
						k = 0;
						continue;
					}
					
					String Opera = Words[4];
					
					//判断是哪一种电影，并给出价格
					if (MovieType.equals("美国片")||MovieType.equals("欧洲片")){
						Danjia = 3;
					}
					else if (MovieType.equals("日韩片")||MovieType.equals("其他地区片")){
						Danjia = 2;
					}
					else if(MovieType.equals("国产片")){
						Danjia = 1;
					}
					else{//输入的为其他的东西的话，下面一样
						System.out.println("输入有误\n");
						k = 0;
						continue;
					}
					
					//判断是否是新片，并规定部数
					if(IsNew.equals("是")){
						New = 2;
					}
					else if(IsNew.equals("否")){
						New = 1;
					}
					else {
						System.out.println("输入有误\n");
						k = 0;
						continue;
					}
					
					//规定电影的部数
					if(Opera.equals("是")){
						MovieNum = (int)((MovieNum+1)/2);
					}
					else if(Opera.equals("否")){
						MovieNum = (int)MovieNum;
					}
					else{
						System.out.println("输入有误\n");
						k = 0;
						continue;
					}
					Sum =Danjia*New*(int)MovieNum*(int)Lend + Sum;
					k=1;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
