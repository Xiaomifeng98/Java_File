package com.String�ೣ�õķ���;

public class Initial {

	public static void main(String[] args) {
		String string1 = "1138803648@qq.com";
		String string1_1 = "1138803648@QQ.COM";
		String string2 = "wenqingfeng1998@outlook.com";
		String string3 = "1138803648";
		
		System.out.println("string1  :"+string1);
		System.out.println("string1_1:"+string1_1);
		System.out.println("string2  :"+string2);
		System.out.println("string3  :"+string3);
		System.out.println("");
		
		// public int length()
		// �����ַ�������
		int length_length = string1.length();
		System.out.println("string1�ĳ���Ϊ��"+length_length);
		
		// public boolean equals(String s)
		// �Ƚ��ַ����Ƿ���ȣ����ز������͵�ֵ
		boolean equals_buer = string1.equals(string2);
		System.out.println("string1��string2�Ƚ�֮���ֵΪ��"+equals_buer);
		
		// public boolean startWith(String s)
		// public boolean endWith(String s)
		// �ж��ַ���ǰ׺���ߺ�׺�Ƿ�Ϊָ�����ַ��������ز������͵�ֵ
		boolean startWith_buer = string1.startsWith("113");
		boolean endWith_buer = string2.endsWith("com");
		System.out.println("string1�Ƿ��ԡ�113����ʼ��"+startWith_buer);
		System.out.println("string2�Ƿ��ԡ�com����β��"+endWith_buer);

		// public boolean regionMatches(int firstStart,String other,int otherStart,int length)
		// ���ַ�����firstStart��ʼȡlength������Other��otherStart��ʼ�Ƚ��Ƿ���ͬ
		boolean regionMatches_buer1 = string1.regionMatches(13, string2, 23, 3);
		System.out.println("string1.regionMatches(13, string2, 23, 3)��ֵΪ��"+regionMatches_buer1);
		// public boolean regionMatches(boolean b,int firstStart,String other,int otherStart,int length)
		// ͨ��b���Ծ����Ƿ���Դ�Сд
		boolean regionMatches_buer2 = string1.regionMatches(true, 0, string1_1, 0, length_length);
		System.out.println("string1.regionMatches(true, 0, string1_1, 0, length_length)��ֵΪ��"+regionMatches_buer2);

		// public int compareTo(String s)
		// �Ƚ��ַ����Ĵ�С����ͬ����0�����ڷ�����ֵ��С�ڷ��ظ�ֵ
		// public int compareToIgnoreCase(String s)�����ɺ��Դ�Сд
		if(string1.compareTo(string2) == 0) {
			System.out.println("string1��string2�Ĵ�С���");
		}
		if(string1.compareTo(string2) < 0) {
			System.out.println("string1С��string2");
		}
		if(string1.compareTo(string2) > 0) {
			System.out.println("string1����string2");
		}
		
		// �жϵ�ǰ�ַ����Ƿ���ָ�����ַ����������ز������͵�ֵ
		// public boolean contains(String s)
		boolean contains_buer = string1.contains(".com");
		System.out.println("string1���Ƿ��С�.com����"+contains_buer);
		
		//�����ַ���s��һ�γ��ֵ�λ��
		//public int indexOf(String s)
		int indexOf_int = string1.indexOf("@");
		System.out.println("string1�ַ����С�@���ַ�����һ�γ��ֵ�λ���ǣ�"+indexOf_int);
		//�����ַ����ڵ�startpointeλ���Ժ��һ�γ��ֵ�λ��
		//public int indexOf(String s,int startpoint)
		int indexOf_int2 = string2.indexOf("ng", 7);
		System.out.println("string2�ַ����ڵ�7λ�Ժ��һ�γ��֡�ng����λ���ǣ�"+indexOf_int2);
		
		//��ȡ��startpointλ�õ������ַ���
		//public String substring(int startpoint)
		String string_substring1 = string2.substring(16);
		System.out.println("��16λ��ʼ��string2��ȡ���ַ���Ϊ��"+string_substring1);
		//��ȡ��startλ�õ�endλ�õ��ַ���
		//public String substring(int start,int end)
		String strign_substring2 = string2.substring(16, 23);
		System.out.println("��16λ��ʼ��23λstring2��ȡ���ַ���Ϊ��"+strign_substring2);
		
		//��ȡȥ��ǰ��ո���ַ���
		//public String trim()
		
		//��������ɵ��ַ���ת����int���͵����ݣ�����Ҫʹ��Integer����ô˷���
		//public static int parseInt(String s)
		int parseInt_string = Integer.parseInt(string3);
		System.out.println("string3ת������������֮���ǣ�"+parseInt_string);
		//���ƵĻ��������ĺܶ��ַ���������double��float��long��short��byte������Ӧ������÷���

	}

}
