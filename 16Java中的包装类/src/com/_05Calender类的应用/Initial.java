package com._05Calender���Ӧ��;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@SuppressWarnings("unused")
public class Initial {
	public static void main(String[] args) {
		
		//����Calendar����
		Calendar c = Calendar.getInstance();
		
		//��ȡ��������
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		//�������
		System.out.println("��ǰCalendarʱ�䣺" + year + "-" + month + "-" + day + " " + hour + "" + ":" + minute + ":" + second);
		
		//��Calendar����ת��ΪDate����
		Date date = c.getTime();	
		
		//��ȡ��ǰ������
		Long time = c.getTimeInMillis();	
		
		System.out.println("��ǰDate��ʱ�䣺" + date);
		System.out.println("��ǰtime�ĺ�������" + time);
		
	}
}
