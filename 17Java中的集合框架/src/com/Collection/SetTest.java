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
	
	//用于往coursesToSelect中添加备选课程
	public void testAdd() {
		
		Course cr1  = new Course("1", "数据结构");
		coursesToSelect.add(cr1);
		
		Course cr2 = new Course("2", "C语言");
		coursesToSelect.add(0, cr2);	
		
		Course[] course = {new Course("3", "离散数学"), new Course("4", "汇编语言")};
		coursesToSelect.addAll(Arrays.asList(course));
		
		Course[] course2 =  {new Course("5", "高等数学"), new Course("6", "大学英语")};
		coursesToSelect.addAll(2, Arrays.asList(course2));
		
	}
	
	public void testForEach() {
		System.out.println("有如下课程待选(通过foreach访问)");
		for(Object obj : coursesToSelect) {
			Course cr = (Course)obj;
			System.out.println("课程：" + cr.id + ":" + cr.name);
		}
	}
	
	public void testForEachforSet(Student student) {
		//打印输出，学生所选的课程
		System.out.println("一共选择了" + student.courses.size() + "门课程！");
		for(Course cr : student.courses) {
			System.out.println("选择了课程：" + cr.id + ":" + cr.name);
		}
	}
	
	/**
	 * 测试List的contains方法
	 */
	public void testListContains() {
		//取得备选课程序列的第0个元素
		Course course = coursesToSelect.get(0);
		//打印输出coursesToSelect是否包含course对象
		System.out.println("取得课程：" + course.name);
		//如果包含返回true
		System.out.println("备选课程中是否包含课程：" + course.name + "." + 
		coursesToSelect.contains(course));
		
		/**
		 * 查询是否有指定的课程，如果有，则返回true，否则返回false
		 */
		//提示输入课程名称
		System.out.println("请输入课程名称：");
		String name = console.next();
		//创建一个新的课程对象，ID和名称，与course对象完全一样
		Course course2 = new Course();
		course2.name = name;
		//coursesToSelect.add(course2);//可以添加课程
		System.out.println("新创建课程：" + course2.name);
		System.out.println("备选课程中是否包含课程：" + course2.name + "." + 
		coursesToSelect.contains(course2));
		
	}
	
	/**
	 * 测试Set的contains方法
	 */
	public void testSetContains() {
		//提示输入课程名称
		System.out.print("请输入学生已选的课程名称：");
		String name = console.next();
		//创建一个新的课程对象，ID和名称，与course对象完全一样
		Course course2 = new Course();
		course2.name = name;
		System.out.println("新创建课程：" + course2.name);
		System.out.println("备选课程中是否包含课程：" + course2.name + "." + student.courses.contains(course2));
	}
	
	//创建学生对象，并选课
	public void createStudentAndSelectCours() {
		//创建一个学生对象
		Student student = new Student("1", "小明");
		System.out.println("欢迎学生" + student.name + "选课！");
		
		//创建一个Scanner对象， 用来接收从键盘输入的课程ID
		Scanner console = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {	//控制了选课数
			System.out.print("请输入课程ID：");
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
