package 继承;

public class Zhuhanshu {
	public static void main(String args[]){
		Animals animal = new Animals();
		
		//输出的是20，可以看出是属性先执行
		System.out.println("动物的年龄："+animal.age);
		
		//初始化的时候会先初始化父类的构造函数，然后在初始化子类的构造函数
		Dog dog= new Dog();
		/*子类的构造函数里面会有一个隐式的父类构造函数，但是必须在第一行*/
		
		dog.print();//试着把子类里面的print函数注释掉，程序会出现不一样的信息
		
		dog.super1();
	}
}
