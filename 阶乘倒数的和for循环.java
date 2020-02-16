public class 阶乘倒数的和for循环{
	public static void main(String args[]){
		double daoshu=1,sum=0,jc=1;
		for(double i=1;i<=20;i++){
			jc=1;
			for(double j=1;j<=i;j++){
				jc*=j;
			}
			daoshu=1/jc;
			sum+=daoshu;
		}
		System.out.println("1+1/2！+......+1/20！="+sum);
	}
}