package com.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	
	/**
	 * ������װѧ�����Ͷ���
	 */
	public Map<String, Student> students;
	
	/**
	 * �ڹ������г�ʼ��students����
	 */
	public MapTest() {
		this.students = new HashMap<String, Student>();
	}
	
	/**
	 * ������ӣ�����ѧ��ID���ж��Ƿ�ռ��
	 * ��δ��ռ�ã�������ѧ��������������ѧ������
	 * ������ӵ�students��
	 */
	@SuppressWarnings("resource")
	public void testPut() {
		//����һ��Scanner����������ȡID������
		Scanner console = new Scanner(System.in);
		int i = 0;
		while(i < 3) {
			System.out.print("������ѧ��ID��");
			String ID = console.next();
			
			//�ж�ID�Ƿ�ռ�ã���������ڣ���ô����NULL��
			Student st = students.get(ID);
			if(st == null) {
				//��ʾ����ѧ������
				System.out.print("������ѧ��������");
				String name = console.next();
				//�����µ�ѧ������
				Student newStudent = new Student(ID, name);
				//ͨ������students��put���������ID-ѧ��ӳ��
				students.put(ID, newStudent);
				System.out.println("�ɹ����ѧ����" + students.get(ID).name);
				i++;
			}else {
				System.out.println("��ѧ��ID�ѱ�ռ�ã�");
				continue;
			}
		}
		//console.close();//Scanner������֮���ǲ������´򿪵�
	}
	
	/**
	 * ����Map��keySet����������Map������"��"�ļ���
	 * @param args
	 */
	public void testKeySet() {
		Set<String> keySet = students.keySet();
		//ȡ��students������
		System.out.println("�ܹ��У�" + students.size() + "��ѧ����");
		//����keySet��ȡ��ÿһ�������ٵ���get����ȡ��ÿ������Ӧ��value
		for(String stuID : keySet) {
			Student st = students.get(stuID);
			if(st != null) {
				System.out.println("ѧ����" + st.name);
			}
		}
	}
	
	/**
	 * ɾ��Map�е�ӳ��
	 */
	@SuppressWarnings("resource")
	public void testRemove() {
		//����ID
		Scanner console = new Scanner(System.in);
		while(true) {
			//��ʾ�����ɾ��ѧ����ID
			System.out.println("������Ҫɾ����ѧ��ID��");
			String ID = console.next();
			//�жϸ�ID�Ƿ��ж�Ӧ��ѧ������
			Student st = students.get(ID);
			if(st == null) {
				//��ʾ������
				System.out.println("��ID�����ڣ�");
				continue;
			}
			students.remove(ID);
			System.out.println("�ɹ�ɾ��ѧ��" + st.name);
			break;
		}
		//console.close();
	}

	/**
	 * ͨ��entrySet������Map
	 * @param args
	 */
	public void testEntrySet() {
		//ͨ��entrySet����������Map�е����м�ֵ��
		Set<Entry<String, Student>> entrySet = students.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			System.out.println("ȡ�ü���" + entry.getKey());
			System.out.println("��Ӧ��ֵΪ��" + entry.getValue().name);
		}
	}
	
	/**
	 * ����put�����޸�Map�е�����ӳ��
	 * @param args
	 */
	@SuppressWarnings("resource")
	public void testModify() {
		//��ʾ����Ҫ�޸ĵ�ѧ��ID
		System.out.print("������Ҫ�޸ĵ�ѧ��ID��");
		Scanner console = new Scanner(System.in);
		while(true) {
			String stuID = console.next();
			Student student = students.get(stuID);
			if(student == null) {
				System.out.println("��ID�����ڣ����������룡");
				continue;
			}
			System.out.println("��ǰ��ѧ��ID��Ӧ��ѧ��Ϊ��" + student.name);
			System.out.println("������ѧ��������");
			String name = console.next();
			Student newStudent = new Student(stuID, name);
			students.put(stuID, newStudent);
			System.out.println("�޸ĳɹ���");
			break;
		}
	}
	
	public static void main(String[] args) {
		MapTest mt = new MapTest();
		mt.testPut();
		mt.testKeySet();
//		mt.testRemove();
//		mt.testEntrySet();
		mt.testModify();
		mt.testEntrySet();
	}

}
