package com.ʵ��5;

import java.util.Scanner;

public class �ַ�����������ʽ {
	public static void main(String args[]){
		System.out.println("������һ���ַ�����");
		Scanner input = new Scanner(System.in);
		String S = input.next();
		String S1=S.replaceAll("[^a-zA-Z]","");
		System.out.println(S1);
		S1=S1.toUpperCase();
		int[] counts=new int[26];
		
		for (int i = 0; i < S1.length(); i++)  
        {  
			char c = S1.charAt(i);					//����ȡ��ÿ����ĸ  
            int index=(int)c-65;					//�����Ϳ��Եõ�ÿ����ĸ��Ӧ�������±�  
            counts[index]=counts[index]+1;			//��Ӧ��ĸ������洢��ĸ�������1  
        }
		
        for (int i = 0; i < counts.length; i++)		//��forѭ����ӡÿ����ĸ���ֵĴ�����û�г����򲻴�ӡ��� 
        {  
            if(counts[i]!=0)						//����0�൱�������ĸû���־�û��Ҫ��ӡ  
            {  
                System.out.println("��ĸ"+(char)(i+'a')+"����:"+counts[i]+"��");  
            }  
        } 
        
		input.close();
	}
}