package com._06Math���������;

public class Initial {
	public static void main(String[] args) {
		double a = 6.52;
		int b = (int)a;
		System.out.println("int b = (int)dou\n           ǿ��ת����" + b);
		
		long c = Math.round(a);
		System.out.println("long c = Math.round(a)\n           ����round���������������룺" + c);
		
		double d = Math.floor(a);
		System.out.println("double d = Math.floor(a)\n           ����floor����������С�ڲ��������������" + d);
		
		double e = Math.ceil(a);
		System.out.println("double e Math.ceil(a)\n           ����ceil���������ش��ڲ�������С������" + e);
		
		double f = Math.random();
		System.out.println("double f = Math.random()\n           ����random����������[0,1]�������������" + f);

		double g = (int)(Math.random() * 101);
		System.out.println("double g = (int)(Math.random() * 101)\n           ����[0,100]�����������" + g);
	
		/**
		 * foreachѭ����������е�Ԫ��ʾ��
		 */
		//ѭ�������鸳ֵ
		int[] nums = new int[10];
		for(int i = 0; i < 10; i++) {
			int h = (int)(Math.random() * 10);
			nums[i] = h;
		}
		System.out.print("foreach���ѭ��������飺");
		//foreach����ʽ
		for(int num : nums) {
			System.out.print(num + " ");
		}
		
	}
}
