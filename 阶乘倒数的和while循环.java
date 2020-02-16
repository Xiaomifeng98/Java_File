public class 阶乘倒数的和while循环{
	public static void main(String args[]){
		double i=1,j=1,jiecheng=1,sum=0,daoshu;
		while(i<=20){
			while(j<=i){
				jiecheng*=j;
				j++;
			}
			daoshu=1/jiecheng;
			sum+=daoshu;
			i++;
		}
		System.out.println("1+1/2！+......+1/20！="+sum);
	}
}