package com.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 备选课程类
 */
public class ListTest {

	//用于存放备选课程的List
	@SuppressWarnings("rawtypes")
	public List coursesToSelect;
	
	@SuppressWarnings("rawtypes")
	public ListTest() {
		this.coursesToSelect = new ArrayList();
	}
	
	//用于往coursesToSelect中添加备选课程
	@SuppressWarnings("unchecked")
	public void testAdd() {
		
		/**
		 * 直接添加
		 */
		//创建一个课程对象，并通过调用add方法，添加到备选课程List中
		Course cr1  = new Course("1", "数据结构");
		coursesToSelect.add(cr1);
		Course temp = (Course) coursesToSelect.get(0);
		System.out.println("添加了课程：" + temp.id + ":" + temp.name);
		
		/**
		 * 添加到指定位置，但不能越界
		 */
		Course cr2 = new Course("2", "C语言");
		//将第二个课程添加到第0个位置，那么刚才添加的那个会被向后移
		coursesToSelect.add(0, cr2);	
		Course temp2 = (Course)coursesToSelect.get(0);
		System.out.println("添加了课程：" + temp2.id + ":" + temp2.name);
		
		/**越界演示，会抛出数组下标越界异常
		Course cr3 = new Course("3", "传感器");
		coursesToSelect.add(4, cr3);	//越界异常错误*/
		
		/**
		 * 第一种addAll方法，直接添加
		 */
		Course[] course = {new Course("3", "离散数学"), new Course("4", "汇编语言")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course) coursesToSelect.get(2);
		Course temp4 = (Course) coursesToSelect.get(3);
		System.out.println("添加了两门课程：" + temp3.id + ":" + temp3.name + ";"
				+ temp4.id + ":" + temp4.name);
		
		/**
		 * 第二种addAll方法，可以指定位置添加多个内容
		 */
		Course[] course2 =  {new Course("5", "高等数学"), new Course("6", "大学英语")};
		coursesToSelect.addAll(2, Arrays.asList(course2));
		Course temp5 = (Course) coursesToSelect.get(2);
		Course temp6 = (Course) coursesToSelect.get(3);
		System.out.println("添加了两门课程：" + temp5.id + ":" + temp5.name + ";"
				+ temp6.id + ":" + temp6.name);
		
		/**
		 * List可以重复添加相同的元素，并且是有序的 
		 */
		coursesToSelect.add(cr1);
		Course temp0 = (Course) coursesToSelect.get(6);
		System.out.println("添加了课程：" + temp0.id + ":" + temp0.name);
		
	}
	
	/**
	 * 取得List中元素的方法
	 */
	public void testGet() {
		int size = coursesToSelect.size();
		System.out.println("有如下课程待选");
		for(int i = 0; i < size; i++) {
			Course cr = (Course)coursesToSelect.get(i);
			System.out.println("课程：" + cr.id + ":" + cr.name);
		}
	}
	
	/**
	 * 通过迭代器来遍历List
	 */
	@SuppressWarnings("rawtypes")
	public void testIterator() {
		//通过集合的iterator方法，取得迭代器中的实例
		//迭代器不具备任何存储元素的功能
		Iterator it = coursesToSelect.iterator();
		System.out.println("有如下课程待选(通过迭代器访问)");
		while(it.hasNext()) {
			Course cr = (Course)it.next();
			System.out.println("课程：" + cr.id + ":" + cr.name);
		}
	}
	
	/**
	 * 通过foreach方法访问集合元素
	 */
	public void testForEach() {
		System.out.println("有如下课程待选(通过foreach访问)");
		for(Object obj : coursesToSelect) {
			Course cr = (Course)obj;
			System.out.println("课程：" + cr.id + ":" + cr.name);
			
		}
	}
	
	/**
	 * 修改List中的元素
	 */
	@SuppressWarnings("unchecked")
	public void testModify() {
		coursesToSelect.set(6, new Course("7", "毛概"));
		testForEach();
	}
	
	/**
	 * 删除List中的元素
	 */
	@SuppressWarnings("unchecked")
	public void testRemove() {
		
		/*第一种删除方法*/
/*		Course cr = (Course) coursesToSelect.get(6);
		coursesToSelect.remove(cr);
		System.out.println("成功删除课程"+ cr.id + ":" + cr.name + "！");
		
		/*第二种删除方法，直接删除指定位置的元素*/
/*		coursesToSelect.remove(6);
		System.out.println("成功删除6位置上的课程！");//实际上是第七门课程
		
		/*第三种删除方法，removeall()*/
		Course[] courses = {(Course)coursesToSelect.get(5), (Course)coursesToSelect.get(6)};
		coursesToSelect.removeAll(Arrays.asList(courses));
		System.out.println("成功删除5、6位置上的课程！");
		
		testForEach();
		
	}
	
	/**
	 * 测试，往List中添加一些违法的元素
	 */
	@SuppressWarnings("unchecked")
	public void testType() {
		coursesToSelect.add("This is the something strange.");
	}
	
	public static void main(String[] args) {
		ListTest lt  = new ListTest();
		lt.testAdd();			//添加课程
//		lt.testType();			//添加违法信息
		lt.testGet();			//得到所有课程
		lt.testIterator();		//用迭代器得到所有课程
		lt.testForEach();	//利用foreach遍历元素
		lt.testModify();		//修改List中的元素
		lt.testRemove();	//删除List中的元素
	}
}
