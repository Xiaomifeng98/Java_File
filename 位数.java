import java.util.Scanner;
public class λ��{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
System.out.print("��������ֵ��");
int num=input.nextInt();
int count = 0;
int i;
for(i=1;i<19;){
	count=(int)(num/(Math.pow(10,i)));
	if(count!=0){
		i++;
	}else{
		System.out.println("���Ǹ�"+i+"λ������" );
        break;
	}
}
}
}