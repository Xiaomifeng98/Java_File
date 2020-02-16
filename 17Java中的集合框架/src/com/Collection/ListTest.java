package com.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * ��ѡ�γ���
 */
public class ListTest {

	//���ڴ�ű�ѡ�γ̵�List
	@SuppressWarnings("rawtypes")
	public List coursesToSelect;
	
	@SuppressWarnings("rawtypes")
	public ListTest() {
		this.coursesToSelect = new ArrayList();
	}
	
	//������coursesToSelect����ӱ�ѡ�γ�
	@SuppressWarnings("unchecked")
	public void testAdd() {
		
		/**
		 * ֱ�����
		 */
		//����һ���γ̶��󣬲�ͨ������add��������ӵ���ѡ�γ�List��
		Course cr1  = new Course("1", "���ݽṹ");
		coursesToSelect.add(cr1);
		Course temp = (Course) coursesToSelect.get(0);
		System.out.println("����˿γ̣�" + temp.id + ":" + temp.name);
		
		/**
		 * ��ӵ�ָ��λ�ã�������Խ��
		 */
		Course cr2 = new Course("2", "C����");
		//���ڶ����γ���ӵ���0��λ�ã���ô�ղ���ӵ��Ǹ��ᱻ�����
		coursesToSelect.add(0, cr2);	
		Course temp2 = (Course)coursesToSelect.get(0);
		System.out.println("����˿γ̣�" + temp2.id + ":" + temp2.name);
		
		/**Խ����ʾ�����׳������±�Խ���쳣
		Course cr3 = new Course("3", "������");
		coursesToSelect.add(4, cr3);	//Խ���쳣����*/
		
		/**
		 * ��һ��addAll������ֱ�����
		 */
		Course[] course = {new Course("3", "��ɢ��ѧ"), new Course("4", "�������")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course) coursesToSelect.get(2);
		Course temp4 = (Course) coursesToSelect.get(3);
		System.out.println("��������ſγ̣�" + temp3.id + ":" + temp3.name + ";"
				+ temp4.id + ":" + temp4.name);
		
		/**
		 * �ڶ���addAll����������ָ��λ����Ӷ������
		 */
		Course[] course2 =  {new Course("5", "�ߵ���ѧ"), new Course("6", "��ѧӢ��")};
		coursesToSelect.addAll(2, Arrays.asList(course2));
		Course temp5 = (Course) coursesToSelect.get(2);
		Course temp6 = (Course) coursesToSelect.get(3);
		System.out.println("��������ſγ̣�" + temp5.id + ":" + temp5.name + ";"
				+ temp6.id + ":" + temp6.name);
		
		/**
		 * List�����ظ������ͬ��Ԫ�أ������������ 
		 */
		coursesToSelect.add(cr1);
		Course temp0 = (Course) coursesToSelect.get(6);
		System.out.println("����˿γ̣�" + temp0.id + ":" + temp0.name);
		
	}
	
	/**
	 * ȡ��List��Ԫ�صķ���
	 */
	public void testGet() {
		int size = coursesToSelect.size();
		System.out.println("�����¿γ̴�ѡ");
		for(int i = 0; i < size; i++) {
			Course cr = (Course)coursesToSelect.get(i);
			System.out.println("�γ̣�" + cr.id + ":" + cr.name);
		}
	}
	
	/**
	 * ͨ��������������List
	 */
	@SuppressWarnings("rawtypes")
	public void testIterator() {
		//ͨ�����ϵ�iterator������ȡ�õ������е�ʵ��
		//���������߱��κδ洢Ԫ�صĹ���
		Iterator it = coursesToSelect.iterator();
		System.out.println("�����¿γ̴�ѡ(ͨ������������)");
		while(it.hasNext()) {
			Course cr = (Course)it.next();
			System.out.println("�γ̣�" + cr.id + ":" + cr.name);
		}
	}
	
	/**
	 * ͨ��foreach�������ʼ���Ԫ��
	 */
	public void testForEach() {
		System.out.println("�����¿γ̴�ѡ(ͨ��foreach����)");
		for(Object obj : coursesToSelect) {
			Course cr = (Course)obj;
			System.out.println("�γ̣�" + cr.id + ":" + cr.name);
			
		}
	}
	
	/**
	 * �޸�List�е�Ԫ��
	 */
	@SuppressWarnings("unchecked")
	public void testModify() {
		coursesToSelect.set(6, new Course("7", "ë��"));
		testForEach();
	}
	
	/**
	 * ɾ��List�е�Ԫ��
	 */
	@SuppressWarnings("unchecked")
	public void testRemove() {
		
		/*��һ��ɾ������*/
/*		Course cr = (Course) coursesToSelect.get(6);
		coursesToSelect.remove(cr);
		System.out.println("�ɹ�ɾ���γ�"+ cr.id + ":" + cr.name + "��");
		
		/*�ڶ���ɾ��������ֱ��ɾ��ָ��λ�õ�Ԫ��*/
/*		coursesToSelect.remove(6);
		System.out.println("�ɹ�ɾ��6λ���ϵĿγ̣�");//ʵ�����ǵ����ſγ�
		
		/*������ɾ��������removeall()*/
		Course[] courses = {(Course)coursesToSelect.get(5), (Course)coursesToSelect.get(6)};
		coursesToSelect.removeAll(Arrays.asList(courses));
		System.out.println("�ɹ�ɾ��5��6λ���ϵĿγ̣�");
		
		testForEach();
		
	}
	
	/**
	 * ���ԣ���List�����һЩΥ����Ԫ��
	 */
	@SuppressWarnings("unchecked")
	public void testType() {
		coursesToSelect.add("This is the something strange.");
	}
	
	public static void main(String[] args) {
		ListTest lt  = new ListTest();
		lt.testAdd();			//��ӿγ�
//		lt.testType();			//���Υ����Ϣ
		lt.testGet();			//�õ����пγ�
		lt.testIterator();		//�õ������õ����пγ�
		lt.testForEach();	//����foreach����Ԫ��
		lt.testModify();		//�޸�List�е�Ԫ��
		lt.testRemove();	//ɾ��List�е�Ԫ��
	}
}
