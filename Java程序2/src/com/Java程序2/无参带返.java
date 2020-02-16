package com.Java程序2;

public class 无参带返 {
	public static void main(String[] args) {
		无参带返 hello = new 无参带返();
		hello.getMaxAge();
		int maxScore;
		maxScore=hello.getMaxAge();
		System.out.println("最大年龄为："+maxScore);
	}
	
public int getMaxAge(){
	int ages[]={18,23,21,19,25,29,17};
	int max;
	max=ages[0];
	for(int i=0;i<7;i++){
		if(ages[i]>max){
			max=ages[i];
		}
	}
	return max;
}
}