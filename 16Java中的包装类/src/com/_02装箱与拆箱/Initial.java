package com._02װ�������;

public class Initial {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		double score1 = 92.6;
		Double score2 = new Double(score1);	//�ֶ�װ��
		Double score3 = score1;							//�Զ�װ��
		
		Double number1 = 67.8;
		double number2 = number1.doubleValue();	//�ֶ�����
		double number3 = number1;							//�Զ�����
		
		System.out.println("Double score2 = new Double(score1)���к�score2��ֵ��" + score2);
		System.out.println("Double score3 = score1���к�score3��ֵ��" + score3);
		
		System.out.println("double number2 = number1.doubleValue()���к�number2��ֵ��" + number2);
		System.out.println("double number3 = number1���к�number3��ֵ��" + number3);
		
	}

}
