package �̳�;

public class Animals {
	public int age=10;
	public String sex="��";
	
	public Animals(){
		System.out.println("Animals�ѱ���ʼ����");
		age=20;//������age�ĸ�ֵ��Ƚ��ĸ����ȱ�ִ�У���������ִ�л��ǹ��캯����ִ��
	}
	
	public void print(){
		System.out.println("�����print�������Ա�"+sex+"���䣺"+age);
	}
}

class Dog extends Animals{
	public String color="red";
	
	public Dog(){
		System.out.println("Dog�ѱ���ʼ����");
	}
	
	public void print(){
		System.out.println("�����print�������Ա�"+sex+"���䣺"+age+"��ɫ��"+color);
	}//��������д
	
	public void super1(){
		System.out.println(super.age);//ִ��super����Ķ�����super���Դ��游��Ķ���Ȼ����ʺ����Լ�����
		super.print();//���ʸ����print����
	}
}
