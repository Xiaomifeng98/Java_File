package com.StringBuffer��;

public class Initial {
	public static void main(String[] args) {
		StringBuffer strBuffer1 = new StringBuffer("ketingting");
		String str = "520";
		
		/**append�����Ὣappend��Ĳ���ת��Ϊ�ַ�����׷�ӵ�StringBuffer�Ķ���󣬲��Ҹ���StringBuffer�Ķ���*/
		strBuffer1.append(str);
		System.out.println(strBuffer1);	//��������Ĳ�����ktt
		
		/**
		 * public char charAt(int n)�õ�����nָ��λ�õĵ����ַ�����һ��λ��Ϊ0��
		 * public void setcharAt(int n,char ch)����ǰStringBuffer����ʵ���е��ַ���λ��n�����ַ��ò���chָ�����ַ��滻
		 */
		if(strBuffer1.charAt(0)=='k'&&strBuffer1.charAt(2)=='t'&&strBuffer1.charAt(6)=='t') {
			System.out.println("���ּ��Ϊktt");
		}
		strBuffer1.setCharAt(0, 'K');		//����ĸ��д
		System.out.println(strBuffer1);
		
		/**
		 * StringBuffer insert(int index,String str)������strָ�����ַ������뵽����indexָ����λ�ã������ص�ǰ����
		 */
		System.out.println(strBuffer1.insert(10, ','));
		
		/**
		 * public StringBuffer reverse()���ö���ʵ���е��ַ���ת�������ص���ǰ���������
		 */
		System.out.println(strBuffer1.reverse());
		System.out.println(strBuffer1.reverse());	//�ָ�һ�£���ú�������
		
		/**
		 * StringBuffer delete(int startIndex,int end Index)�ӵ�ǰStringBuffer����ʵ����ַ���ɾ��һ�����ַ����������ص���ǰ���������
		 * Ҳ����ɾ����startIndex��endIndex-1���ַ���
		 */
		System.out.println(strBuffer1.delete(10 , 11));
		
		/**
		 * StringBuffer replace(int startIndex,int end Index,String str)����ǰStringBuffer����ʵ���е����ַ����ò���strָ�����ַ����滻
		 */
		System.out.println(strBuffer1.replace(10 , 13,"520,"));
	}

}
