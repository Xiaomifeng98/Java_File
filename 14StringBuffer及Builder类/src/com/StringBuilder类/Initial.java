package com.StringBuilder��;

public class Initial {
    public static void main(String[] args) {
    	
    	/**
    	 * StringBuilder append(����)��׷�����ݵ���ǰStringBuilder����Ľ�β
    	 * StringBuilder Insert(λ��,����)�������ݲ��뵽StringBuilder�����ָ��λ��
    	 * String toString()����StringBuilder����ת��ΪString����
    	 * int length()����ȡ�ַ�������
    	 */
		// ����һ���յ�StringBuilder����
		StringBuilder str = new StringBuilder();
		// ׷���ַ���
		str.append("ktt520");
        // �Ӻ���ǰÿ����λ���붺��
        for(int i = str.length()-3;i>=0;i=i-3){
            str.insert(i,",");
        }
        // ��StringBuilder����ת��ΪString�������
		System.out.print(str.toString());
	}
	

}
