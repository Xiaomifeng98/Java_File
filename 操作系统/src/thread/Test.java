package thread;

	public class Test  
	{  
	    public static void main(String[] args)  
	    {  
	        // �ֿ����  
	        Storage storage = new Storage();  
	  
	        // �����߶���  
	        Producer p1 = new Producer(storage);  
	        Producer p2 = new Producer(storage);  
	        Producer p3 = new Producer(storage);  
	       
	  
	        // �����߶���  
	        Consumer c1 = new Consumer(storage);  
	        Consumer c2 = new Consumer(storage);  
	        Consumer c3 = new Consumer(storage);  
	  
	        // ���������߲�Ʒ��������  
	        p1.setNum(10);  
	        p2.setNum(30);  
	        p3.setNum(40); 
	  
	        // ���������߲�Ʒ��������  
	        c1.setNum(40);  
	        c2.setNum(10);  
	        c3.setNum(30);  
	  
	        // �߳̿�ʼִ��  
	        c1.start();  
	        c2.start();  
	        c3.start();  
	        p1.start();  
	        p2.start();  
	        p3.start(); 
	    }  
	} 
