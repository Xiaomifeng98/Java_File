package com.equals����;

public class Equals {
	public static void main(String args[]){
		Telephone Tel = new Telephone();
		Tel.CPU = 2.4;
		Tel.RAM = 4;
		Tel.size = 6.0;
		Telephone Tel2 = new Telephone();
		Tel2.CPU = 2.4;
		Tel2.RAM = 4;
		Tel2.size = 6.0;
		
		//ֻ�ǱȽ�����������ڴ��ַ�Ƿ���ͬ
		//��Ȼ��һ�����ʹ����Ķ��󣬵������ǵ��ڴ��ַ�ǲ�һ���ģ��������ǵ�ֵҲ��һ��
		//
		if(Tel.equals(Tel2)){
			System.out.println("������������ͬ��");
		}else System.out.println("���������ǲ�ͬ��");
		
	}
}
