import java.util.Scanner;

public class ���㹫Լ��������{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in); 
		System.out.print("�������һ������");
		int a=input.nextInt();
		System.out.print("������ڶ�������");
		int b=input.nextInt();
		�������Լ�� ��Լ = new �������Լ��();
		int gys=��Լ.��Լ��(a,b);
		������С������ ���� = new ������С������();
		����.������(a,b,gys);
	}
}

class �������Լ��{
	int ��Լ��(int A,int B){
		int C;	
		while(A!=0&&B!=0){
		if(A<B){C=A;A=B;B=C;}
		if(A%B==0)break;
		B=A%B;
		}
		System.out.println("���Լ��Ϊ��"+B);
		return B;
	}
}

class ������С������{
	void ������(int A,int B,int C){
		int D=A*B/C;
		System.out.println("��󹫱���Ϊ��"+D);
	}
}