package com.Collection;

import java.util.HashSet;
import java.util.Set;


/**
 * ѧ����
 */
public class Student {

	public String id;
	public String name;
	

	public Set<Course> courses;	//��һ������ΪCourse���ͣ�����id��name
	
	public Student(String id, String name) {
		this.id = id;
		this.name = name;
		this.courses = new HashSet<Course>();
	}
}
