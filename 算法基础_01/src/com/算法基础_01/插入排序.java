package com.�㷨����_01;

import java.util.Scanner;

public class �������� {
	public static void main(String[] args) {
		
		//����һ���ַ�������
		Scanner Sc = new Scanner(System.in);
		System.out.print("����һ����Ҫ����������飺");
		String s1 = Sc.nextLine();
		
		//���ַ�������ת��Ϊ��������
		String s2[] = s1.split(" ");
		int Size = s2.length;
		int[] a = new int[Size];
		for(int i = 0;i<Size;i++) {
			a[i] = Integer.parseInt(s2[i]);
		}
		
		//��a[i]��a[0],a[1],..,a[j],...,a[i-1]��������Ƚ�
		for(int i = 1;i<Size;i++) {
			int key = a[i];
			
			//�����㷨��˼���������Ƚ�һ������ֱ�Ӱ�ǰ��������ƣ��±��1��
				//����a[2]=6��a[3]=2=key��6>2,��ֱ�Ӱ�a[3]=a[2],
					//��ôa[3]�е�2��ô�죿
						//a[3]�е�2�Ѿ�������key�У����a[1]=1<key,���ϴӴ�С��˳����ôa[2]�͵���key��
			
			//�ó����Ƚϵ�����keyҪһ�����ĺ�ǰ��ıȽ�ֱ��������С��key������
			//������֮ǰһֱ�Ǵ���key�����Գ�������"a[j]>key"���������ܽ���ѭ����������Ĳ�����
				//��ô������������У�ÿ�Ƚ�һ�ξͰѱ��Ƚϵ��Ǹ����ֵ��±��һ
				//����������������һ��Ԫ���±��һ��λ��
				//�����һ��Ԫ�ظպñ�keyС����ô���λ�þ�ֱ����key��λ����
			
			//j�Ľ���Ϊ[0,i-1]
			int j = i-1;
			while(j>=0 && a[j]>key) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
		
		//��ʾ����������
		System.out.print("����������Ϊ��");
		for(int i = 0;i<Size;i++) {
			System.out.print(a[i]+" ");
		}
		Sc.close();
	}
}
