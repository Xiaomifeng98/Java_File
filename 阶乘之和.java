public class �׳�֮��{
	public static void main(String args[]){
		int cj=1;
		int sum=0;
		for(int i=1;i<=20;i++){				//��ѭ�������ƽ׳�֮�͵������
			for(int j=1;j<=i;j++){				//��ѭ�������ƽ׳˵������
				cj*=j;
			}
		sum+=cj;
		}
	System.out.println("1!+2!+......+20!="+sum);
	}
}