package �̳�;

public class Zhuhanshu {
	public static void main(String args[]){
		Animals animal = new Animals();
		
		//�������20�����Կ�����������ִ��
		System.out.println("��������䣺"+animal.age);
		
		//��ʼ����ʱ����ȳ�ʼ������Ĺ��캯����Ȼ���ڳ�ʼ������Ĺ��캯��
		Dog dog= new Dog();
		/*����Ĺ��캯���������һ����ʽ�ĸ��๹�캯�������Ǳ����ڵ�һ��*/
		
		dog.print();//���Ű����������print����ע�͵����������ֲ�һ������Ϣ
		
		dog.super1();
	}
}
