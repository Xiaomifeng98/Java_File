package com.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	
	/**
	 * 用来承装学生类型对象
	 */
	public Map<String, Student> students;
	
	/**
	 * 在构造器中初始化students属性
	 */
	public MapTest() {
		this.students = new HashMap<String, Student>();
	}
	
	/**
	 * 测试添加：输入学生ID，判断是否被占用
	 * 若未被占用，则输入学生姓名，创建新学生对象
	 * 并且添加到students中
	 */
	@SuppressWarnings("resource")
	public void testPut() {
		//创建一个Scanner对象，用来获取ID和姓名
		Scanner console = new Scanner(System.in);
		int i = 0;
		while(i < 3) {
			System.out.print("请输入学生ID：");
			String ID = console.next();
			
			//判断ID是否被占用，如果不存在，那么返回NULL；
			Student st = students.get(ID);
			if(st == null) {
				//提示输入学生姓名
				System.out.print("请输入学生姓名：");
				String name = console.next();
				//创建新的学生对象
				Student newStudent = new Student(ID, name);
				//通过调用students的put方法，添加ID-学生映射
				students.put(ID, newStudent);
				System.out.println("成功添加学生：" + students.get(ID).name);
				i++;
			}else {
				System.out.println("该学生ID已被占用！");
				continue;
			}
		}
		//console.close();//Scanner被关了之后是不能重新打开的
	}
	
	/**
	 * 测试Map的keySet方法，返回Map中所有"键"的集合
	 * @param args
	 */
	public void testKeySet() {
		Set<String> keySet = students.keySet();
		//取得students的容量
		System.out.println("总共有：" + students.size() + "个学生！");
		//遍历keySet，取得每一个键，再调用get方法取得每个键对应的value
		for(String stuID : keySet) {
			Student st = students.get(stuID);
			if(st != null) {
				System.out.println("学生：" + st.name);
			}
		}
	}
	
	/**
	 * 删除Map中的映射
	 */
	@SuppressWarnings("resource")
	public void testRemove() {
		//输入ID
		Scanner console = new Scanner(System.in);
		while(true) {
			//提示输入带删除学生的ID
			System.out.println("请输入要删除的学生ID：");
			String ID = console.next();
			//判断该ID是否有对应的学生对象
			Student st = students.get(ID);
			if(st == null) {
				//提示不存在
				System.out.println("该ID不存在！");
				continue;
			}
			students.remove(ID);
			System.out.println("成功删除学生" + st.name);
			break;
		}
		//console.close();
	}

	/**
	 * 通过entrySet来遍历Map
	 * @param args
	 */
	public void testEntrySet() {
		//通过entrySet方法，返回Map中的所有键值对
		Set<Entry<String, Student>> entrySet = students.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			System.out.println("取得键：" + entry.getKey());
			System.out.println("对应的值为：" + entry.getValue().name);
		}
	}
	
	/**
	 * 利用put方法修改Map中的已有映射
	 * @param args
	 */
	@SuppressWarnings("resource")
	public void testModify() {
		//提示输入要修改的学生ID
		System.out.print("请输入要修改的学生ID：");
		Scanner console = new Scanner(System.in);
		while(true) {
			String stuID = console.next();
			Student student = students.get(stuID);
			if(student == null) {
				System.out.println("该ID不存在，请重新输入！");
				continue;
			}
			System.out.println("当前该学生ID对应的学生为：" + student.name);
			System.out.println("请输入学生姓名：");
			String name = console.next();
			Student newStudent = new Student(stuID, name);
			students.put(stuID, newStudent);
			System.out.println("修改成功！");
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
