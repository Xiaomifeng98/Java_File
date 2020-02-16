package com.ʵ��4_3;

class Person {
	  private String name;
	  private String location;

	  Person(String name) {
	    this.name = name;
	    location = "beijing";
	  }
	  
	  Person(String name,String location) {
	    this.name = name;
	    this.location = location;
	  }
	  
	  public String info() {
	    return 
	      "name: "+name+
	      " location: "+location;
	  }
}
class Teacher extends Person {
	private String ְ��;
	
	Teacher(String name,String ְ��) {
		super(name);
		this.ְ��=ְ��;
	}
	
	Teacher(String name,String location,String ְ��) {
		super(name,location);
		this.ְ��=ְ��;
	}

	public String info() {
		return super.info()+
				" ְ��: "+ְ��;
	}
}

	class Student extends Person {
	    private String school;
	    Student(String name,
			String school) {
	        this(name,"beijing", school);
	    }
	    Student(String n,String l,String school) {
	        super(n,l);
	        this.school = school;
	    }
	    public String info() {
	        return super.info()+
		  " school: "+school;
	    }
	}

	public class TestTeacher {
	    public static void main(String[] args) {
	        Person p1 = new Person("A");
	        Person p2 = new Person("B","shanghai");
	        Student s1 = new Student("C","S1");
	        Student s2 = 
	            new Student("C","shanhai","S2");
	        System.out.println(p1.info());
	        System.out.println(p2.info());
	        System.out.println(s1.info());
	        System.out.println(s2.info());
	        Teacher t1 =new Teacher("D","wuhan","Worker");  //����new�Ĵ���
	        System.out.println(t1.info());//t1�������Teacher ��д��info()����
	    }
	}
