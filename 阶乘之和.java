public class 阶乘之和{
	public static void main(String args[]){
		int cj=1;
		int sum=0;
		for(int i=1;i<=20;i++){				//外循环，控制阶乘之和的最大项
			for(int j=1;j<=i;j++){				//内循环，控制阶乘的最大数
				cj*=j;
			}
		sum+=cj;
		}
	System.out.println("1!+2!+......+20!="+sum);
	}
}