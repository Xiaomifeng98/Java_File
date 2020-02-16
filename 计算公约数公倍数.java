import java.util.Scanner;

public class 计算公约数公倍数{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in); 
		System.out.print("请输入第一个数：");
		int a=input.nextInt();
		System.out.print("请输入第二个数：");
		int b=input.nextInt();
		计算最大公约数 公约 = new 计算最大公约数();
		int gys=公约.公约数(a,b);
		计算最小公倍数 公倍 = new 计算最小公倍数();
		公倍.公倍数(a,b,gys);
	}
}

class 计算最大公约数{
	int 公约数(int A,int B){
		int C;	
		while(A!=0&&B!=0){
		if(A<B){C=A;A=B;B=C;}
		if(A%B==0)break;
		B=A%B;
		}
		System.out.println("最大公约数为："+B);
		return B;
	}
}

class 计算最小公倍数{
	void 公倍数(int A,int B,int C){
		int D=A*B/C;
		System.out.println("最大公倍数为："+D);
	}
}