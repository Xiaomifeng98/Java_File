package com.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {

	public List<Course> coursesToSelect;
	
	public Student student;

	private Scanner console;
	
	public SetTest() {
		coursesToSelect = new ArrayList<Course>();
		console = new Scanner(System.in);
	}
	
	//������coursesToSelect����ӱ�ѡ�γ�
	public void testAdd() {
		
		Course cr1  = new Course("1", "���ݽṹ");
		coursesToSelect.add(cr1);
		
		Course cr2 = new Course("2", "C����");
		coursesToSelect.add(0, cr2);	
		
		Course[] course = {new Course("3", "��ɢ��ѧ"), new Course("4", "�������")};
		coursesToSelect.addAll(Arrays.asList(course));
		
		Course[] course2 =  {new Course("5", "�ߵ���ѧ"), new Course("6", "��ѧӢ��")};
		coursesToSelect.addAll(2, Arrays.asList(course2));
		
	}
	
	public void testForEach() {
		System.out.println("�����¿γ̴�ѡ(ͨ��foreach����)");
		for(Object obj : coursesToSelect) {
			Course cr = (Course)obj;
			System.out.println("�γ̣�" + cr.id + ":" + cr.name);
		}
	}
	
	public void testForEachforSet(Student student) {
		//��ӡ�����ѧ����ѡ�Ŀγ�
		System.out.println("һ��ѡ����" + student.courses.size() + "�ſγ̣�");
		for(Course cr : student.courses) {
			System.out.println("ѡ���˿γ̣�" + cr.id + ":" + cr.name);
		}
	}
	
	/**
	 * ����List��contains����
	 */
	public void testListContains() {
		//ȡ�ñ�ѡ�γ����еĵ�0��Ԫ��
		Course course = coursesToSelect.get(0);
		//��ӡ���coursesToSelect�Ƿ����course����
		System.out.println("ȡ�ÿγ̣�" + course.name);
		//�����������true
		System.out.println("��ѡ�γ����Ƿ�����γ̣�" + course.name + "." + 
		coursesToSelect.contains(course));
		
		/**
		 * ��ѯ�Ƿ���ָ���Ŀγ̣�����У��򷵻�true�����򷵻�false
		 */
		//��ʾ����γ�����
		System.out.println("������γ����ƣ�");
		String name = console.next();
		//����һ���µĿγ̶���ID�����ƣ���course������ȫһ��
		Course course2 = new Course();
		course2.name = name;
		//coursesToSelect.add(course2);//������ӿγ�
		System.out.println("�´����γ̣�" + course2.name);
		System.out.println("��ѡ�γ����Ƿ�����γ̣�" + course2.name + "." + 
		coursesToSelect.contains(course2));
		
	}
	
	/**
	 * ����Set��contains����
	 */
	public void testSetContains() {
		//��ʾ����γ�����
		System.out.print("������ѧ����ѡ�Ŀγ����ƣ�");
		String name = console.next();
		//����һ���µĿγ̶���ID�����ƣ���course������ȫһ��
		Course course2 = new Course();
		course2.name = name;
		System.out.println("�´����γ̣�" + course2.name);
		System.out.println("��ѡ�γ����Ƿ�����γ̣�" + course2.name + "." + student.courses.contains(course2));
	}
	
	//����ѧ�����󣬲�ѡ��
	public void createStudentAndSelectCours() {
		//����һ��ѧ������
		Student student = new Student("1", "С��");
		System.out.println("��ӭѧ��" + student.name + "ѡ�Σ�");
		
		//����һ��Scanner���� �������մӼ�������Ŀγ�ID
		Scanner console = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {	//������ѡ����
			System.out.print("������γ�ID��");
			String courseID = console.next();
			for(Course cr : coursesToSelect) {
				if(cr.id.equals(courseID)) {
					student.courses.add(cr);
				}
			}
		}
		//console.close();
	}
	
	public static void main(String[] args) {
		
		SetTest st = new SetTest();
		st.testAdd();
//		st.testListContains();
		st.testForEach();
		
		st.createStudentAndSelectCours();
		st.testSetContains();
		
//		st.testForEachforSet(student);
//		console.close();
	}
}
