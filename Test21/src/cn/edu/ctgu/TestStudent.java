package cn.edu.ctgu;

public class TestStudent {
	public static void main(String[] args) {
        Student a=new Student();
		a.SetNo(2015);
		a.SetName("张三");
		a.SetSex("男");
		Student b=new Student(2016,"李四","男");
		System.out.println("a学生的学号为："+a.GetNo());
		        System.out.println("a学生的姓名为："+a.GetName());
		System.out.println("a学生的性别为："+a.GetSex());
		System.out.println("b学生的学号为："+b.GetNo());
		        System.out.println("b学生的姓名为："+b.GetName());
		System.out.println("b学生的性别为："+b.GetSex());
}
}
