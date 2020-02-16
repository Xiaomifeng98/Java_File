package com._04date��SimpleDateFormat���ʾʱ��;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Initial {

	public static void main(String[] args) {
		
		/**
		 * ������ת��Ϊָ����ʽ���ı�
		 */
		// ����Date���󣬱�ʾ��ǰʱ��
		Date m = new Date();
		System.out.println("����Dateֱ��������ڣ�" + m);
		
		//����SimpleDateFormat����ָ��Ŀ���ʽ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");
		
		//ʹ��format()��������ʽ��ʱ�䣬ת��Ϊָ����ʽ�ַ���
		String today = sdf.format(m);
		
		//���ת������ַ���
		System.out.println(today);
		
		/**
		 * ��ָ�����ı�ת��Ϊ����
		 */
		//�������ڸ�ʽ�ַ���
		String day = "2019��06��20�� 20:58:24";
		
		//����SimpleDateFormat����ָ���ַ�����ʽ
		SimpleDateFormat SDF = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
	
		try {
			//����parse()���������ַ���תΪ����
			Date d = SDF.parse(day);
			
			//���ת�����ʱ��
			System.out.println("ָ���ı�ת��Ϊ���ڣ�" + d);
			
		} catch (ParseException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		
		
	}

}
