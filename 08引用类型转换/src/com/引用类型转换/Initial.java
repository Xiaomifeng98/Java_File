package com.��������ת��;

public class Initial {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Animal animal = new Dog();		//�Զ��������� ��������ת��
		Dog dog = (Dog)animal;			//ǿ������ת�� ��������ת��
		animal.eat();
		
		//�Ƿ�����Ϊwatchdoor�����������ķ���
		/**animal.watchDoor();*/
		dog.watchDoor();
		
		//1.����ʱ Cat���� 
		//2.����ʱ Dog����
		//�������Ͳ�ƥ�䣬�޷�����ת�������Ա������ᱨ��
		/**Cat cat = (Cat)animal;*/
		
		//Ϊ��ֹ��������������instanceof������ֵ���ǲ������ͣ���������ת����ȫ������
		if(animal instanceof Cat){
			Cat cat = (Cat)animal;
		}else{
			System.out.println("�޷�����ǿ��ת��");
		}
	}

}
