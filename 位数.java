import java.util.Scanner;
public class 位数{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
System.out.print("请输入数值：");
int num=input.nextInt();
int count = 0;
int i;
for(i=1;i<19;){
	count=(int)(num/(Math.pow(10,i)));
	if(count!=0){
		i++;
	}else{
		System.out.println("它是个"+i+"位的数！" );
        break;
	}
}
}
}