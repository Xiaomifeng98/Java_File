package 继承;

public class Animals {
	public int age=10;
	public String sex="公";
	
	public Animals(){
		System.out.println("Animals已被初始化。");
		age=20;//这两个age的赋值会比较哪个会先被执行，是属性先执行还是构造函数先执行
	}
	
	public void print(){
		System.out.println("父类的print方法：性别："+sex+"年龄："+age);
	}
}

class Dog extends Animals{
	public String color="red";
	
	public Dog(){
		System.out.println("Dog已被初始化。");
	}
	
	public void print(){
		System.out.println("子类的print方法：性别："+sex+"年龄："+age+"颜色："+color);
	}//方法的重写
	
	public void super1(){
		System.out.println(super.age);//执行super里面的东西，super可以代替父类的对象然后访问函数以及属性
		super.print();//访问父类的print方法
	}
}
