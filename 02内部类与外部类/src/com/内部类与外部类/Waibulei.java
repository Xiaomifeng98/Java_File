package com.�ڲ������ⲿ��;

public class Waibulei {
	static int score =90;
	String name="baobao";
	
	//�ڲ���
	public class Neibulei{
		int score =100;
		String name = "xiaokeai";
		public void show(){
			System.out.println("�����ⲿ��ľ�̬��Ա����score��"+Waibulei.score);
			System.out.println("�����ڲ���ķǾ�̬��Ա����score��"+score);
			System.out.println("�����ⲿ��ķǾ�̬��Ա����name��"+Waibulei.this.name);
			System.out.println("�����ڲ���ķǾ�̬��Ա����name��"+name);
		}
	}
	
	public static void main(String args[]){
		Waibulei Wai =new Waibulei();
		Neibulei Nei =Wai.new Neibulei();
		Nei.show();
	}
}
