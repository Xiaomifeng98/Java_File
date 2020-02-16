package com.实验5;

import java.util.Scanner;

public class 字符串与正则表达式 {
	public static void main(String args[]){
		System.out.println("请输入一段字符串：");
		Scanner input = new Scanner(System.in);
		String S = input.next();
		String S1=S.replaceAll("[^a-zA-Z]","");
		System.out.println(S1);
		S1=S1.toUpperCase();
		int[] counts=new int[26];
		
		for (int i = 0; i < S1.length(); i++)  
        {  
			char c = S1.charAt(i);					//依次取出每个字母  
            int index=(int)c-65;					//这样就可以得到每个字母对应的数组下标  
            counts[index]=counts[index]+1;			//对应字母出现则存储字母的数组加1  
        }
		
        for (int i = 0; i < counts.length; i++)		//此for循环打印每个字母出现的次数，没有出现则不打印输出 
        {  
            if(counts[i]!=0)						//等于0相当于这个字母没出现就没必要打印  
            {  
                System.out.println("字母"+(char)(i+'a')+"出现:"+counts[i]+"次");  
            }  
        } 
        
		input.close();
	}
}