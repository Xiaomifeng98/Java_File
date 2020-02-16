public class 一百以内的素数{
	public static void main(String args[]){
		int i,j;
		System.out.println("100以内的素数为：");	
		for(i=2;i<=100;i++){
			for(j=2;j<=i;j++){
				if(i%j==0)break;
			}
			if(j==i){
				System.out.print("  "+i);		
			}
		}		
	}
}