package com.Java����2;

public class �޲δ��� {
	public static void main(String[] args) {
		�޲δ��� hello = new �޲δ���();
		hello.getMaxAge();
		int maxScore;
		maxScore=hello.getMaxAge();
		System.out.println("�������Ϊ��"+maxScore);
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