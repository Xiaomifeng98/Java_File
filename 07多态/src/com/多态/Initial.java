package com.��̬;

public class Initial {

	public static void main(String[] args) {
		// ���������������̬
		Animal obj1 = new Animal();
		Animal obj2 = new Dog();
		Animal obj3 = new Cat();
		//Dog obj3 = new Animal();����
		
		//���õ��Ǹ����еķ���
		obj1.eat();
		
		//���õ�������ķ���
		obj2.eat();
		//obj2.watchDoor();��������û�������������������������Ҳ����
		
		//���obj3����û��eat�ķ�������ô����ø��������eat����
		obj3.eat();
	}

}
