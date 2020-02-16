package com.Collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
	
	/**
	 * ���з��͡���Course��List��������
	 * �����Ǹ�������
	 */
	public List<Course> courses;
	
	public TestGeneric() {
		this.courses = new ArrayList<Course>();
	}
	/**
	 * ��������
	 */
	public void testAdd() {
		Course cr1 = new Course("1", "��ѧ����");
		courses.add(cr1);
		Course cr2 = new  Course("2", "Java����");
		courses.add(cr2);
		//���ͼ����У�������ӷ��͹涨�����ͼ�������������Ķ��󣬷���ᱨ��
		//courses.add("�ܷ������ֵĶ���");
	}
	
	public void testForEach() {
		for(Course cr : courses) {
			System.out.println(cr.id + ":" + cr.name);
		}
	}
	
	/**
	 * ���ͼ��Ͽ�����ӷ��������͵Ķ���ʵ��
	 ** ���ͼ����в���ʹ�û����������ͣ�����int��long��boolean������
	 ** ����ʹ�ð�װ���޶��������Ļ�����������
	 */
	public void testChild() {
		ChildCourse ccr = new ChildCourse();
		ccr.id = "3";
		ccr.name = "�����͵Ŀγ̶���ʵ��";
		courses.add(ccr);
	}
	
	/**
	 * ���Ͳ���ʹ�û�������
	 */
	public void testBasicType() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		System.out.println("�������ͱ���ʹ�ð�װ����Ϊ���ͣ�" + list.get(0));
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TestGeneric tg = new TestGeneric();
		tg.testAdd();
		tg.testForEach();
		tg.testChild();
		tg.testForEach();
		tg.testBasicType();
	}

}
