import java.util.Scanner;

public class 平均分{
	public static void main(String[] args) {
		int classNum;
		int stuNum;
		double sum=0;
		double avg=0;
		System.out.print("班级总数：");
		Scanner input=new Scanner(System.in);
		classNum=input.nextInt();
		for(int i=1;i<=classNum;i++){
			System.out.println("***请输入第"+i+"个班的成绩***");
			System.out.print(""+i+"班学生总数：");
			stuNum=input.nextInt();
			for(int j=1;j<=stuNum;j++){
				System.out.println("请输入第"+j+"个学生的成绩:");
				int score=input.nextInt();
				sum+=score;
			}
		avg=sum/stuNum;
		System.out.println(""+i+"班的平均成绩为"+avg);
		avg=0;sum=0;
		}
		
	}
}
