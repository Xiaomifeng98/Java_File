package com.�����;


import java.util.*;
import java.io.*;

public class Baobao {
	public static void main(String args[]) {
		//���ļ���ȡ���ַ���File_String,ÿһ�зֿ�Word[]
		String File_String;	
		int Danjia,Sum=0,New,i=0,k=1;
		
		//���÷ָ���
		String Regex = "\n";
		String Regex2 = ",";
		
		
		//�����ļ�����
		File file = new File("oop1802.txt");

		Scanner File_SC;
		try {
			File_SC = new Scanner(file);
			
			//����ѭ��ɨ����һ�в����ز���ֵ
			while(File_SC.hasNext()){
				File_SC.useDelimiter(Regex);
				File_String = File_SC.nextLine();
				
				//�����������е�ʱ������Sum,���Ʊ���i
				//��ʱ��i=3������һ��Sum�����⣬������k���ƣ���������ʱ��k=1
				if(File_String.length() == 0)
					i++;
				if(i == 3 && k == 1){
					System.out.println("�����ܼ�:"+Sum+"\n");
					Sum = 0;
					i = 0;
				}
				
				//�򵥵�˵�����ȡ����һ�в��ǿյĻ��ͼ���ִ��
				if(File_String.length()!=0){
					i = 0;
					
					//���ַ����ָ�ɼ�������
					String Words[] = File_String.split(Regex2);
					
					//���������WordsӦ����5�����飬������ԵĻ�����ʾ������������ľ��������
					if(Words.length != 5){
						System.out.println("��������\n");
						k = 0;
						continue;
					}
					
					String MovieType = Words[0];
					
					float MovieNum = Float.parseFloat(Words[1].toString());
					//�ж������Ƿ�λС������С�ڵ���������֣�����һ��
					if((int)MovieNum != MovieNum||MovieNum <= 0){
						System.out.println("��������\n");
						k = 0;
						continue;
					}
					
					String IsNew = Words[2];
					
					float Lend = Float.parseFloat(Words[3].toString());
					if((int)Lend != Lend||Lend <= 0){
						System.out.println("��������\n");
						k = 0;
						continue;
					}
					
					String Opera = Words[4];
					
					//�ж�����һ�ֵ�Ӱ���������۸�
					if (MovieType.equals("����Ƭ")||MovieType.equals("ŷ��Ƭ")){
						Danjia = 3;
					}
					else if (MovieType.equals("�պ�Ƭ")||MovieType.equals("��������Ƭ")){
						Danjia = 2;
					}
					else if(MovieType.equals("����Ƭ")){
						Danjia = 1;
					}
					else{//�����Ϊ�����Ķ����Ļ�������һ��
						System.out.println("��������\n");
						k = 0;
						continue;
					}
					
					//�ж��Ƿ�����Ƭ�����涨����
					if(IsNew.equals("��")){
						New = 2;
					}
					else if(IsNew.equals("��")){
						New = 1;
					}
					else {
						System.out.println("��������\n");
						k = 0;
						continue;
					}
					
					//�涨��Ӱ�Ĳ���
					if(Opera.equals("��")){
						MovieNum = (int)((MovieNum+1)/2);
					}
					else if(Opera.equals("��")){
						MovieNum = (int)MovieNum;
					}
					else{
						System.out.println("��������\n");
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
