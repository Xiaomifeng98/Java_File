package com.Collection;

import java.util.HashSet;
import java.util.Set;


/**
 * 学生类
 */
public class Student {

	public String id;
	public String name;
	

	public Set<Course> courses;	//有一个集，为Course类型，包含id和name
	
	public Student(String id, String name) {
		this.id = id;
		this.name = name;
		this.courses = new HashSet<Course>();
	}
}
