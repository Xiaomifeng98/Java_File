package com.�ӿ�;

public class Initial {
	public static void main(String args[]){
		Jiekou jiekou = new Lei();
		jiekou.show();
		
		/**
		 * �����ڲ��࣬�ڶ����ʱ�򲻹�ע�ڲ�������֣�������ʹ�õ�ʱ����ģ��﷨��ʽ
		 * Interface i = new Interface(){
		 * 		public void method(){
		 * 			System.out.println("�����ڲ���ʵ�ֽӿڵķ�ʽ");
		 * 		}
		 * }
		 */
		
		Jiekou jiekou2 = new Jiekou(){
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("ʹ�������ڲ���ķ�ʽʵ�ֽӿ�");
			}
		};//��Ҫ���Ϸֺ�
		jiekou2.show();
		
		new Jiekou(){
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("ʹ����һ�������ڲ���ķ�ʽʵ�ֽӿ�");
			}
		}.show();
		
	}
}
