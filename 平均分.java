import java.util.Scanner;

public class ƽ����{
	public static void main(String[] args) {
		int classNum;
		int stuNum;
		double sum=0;
		double avg=0;
		System.out.print("�༶������");
		Scanner input=new Scanner(System.in);
		classNum=input.nextInt();
		for(int i=1;i<=classNum;i++){
			System.out.println("***�������"+i+"����ĳɼ�***");
			System.out.print(""+i+"��ѧ��������");
			stuNum=input.nextInt();
			for(int j=1;j<=stuNum;j++){
				System.out.println("�������"+j+"��ѧ���ĳɼ�:");
				int score=input.nextInt();
				sum+=score;
			}
		avg=sum/stuNum;
		System.out.println(""+i+"���ƽ���ɼ�Ϊ"+avg);
		avg=0;sum=0;
		}
		
	}
}
