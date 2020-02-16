package com.�׳��쳣;

public class TryCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchTest tct = new TryCatchTest();
//		int result = tct.test();
//		System.out.println("test()����ִ����Ϸ���ֵΪ��"+result);
//		int result2 = tct.test2();
//		System.out.println("test2()ִ����ϣ�����");
		int result3 = tct.test3();
		System.out.println("�����������test3()ִ����ϣ���������ֵΪ��"+result3);
	}
	
	/**
	 * divider(����)
	 * result(���)
	 * try-catch����whileѭ��
	 * ÿ��ѭ����divider��һ��result=result+100/divider
	 * ����������쳣���ʹ�ӡ������׳��쳣�ˣ�������������-1
	 * ���򣺷���result
	 */
	public int test(){
		int divider = 10;
		int result = 100;
		try{
			while(divider > -1){
				divider--;
				result = result + 100/divider;
			}
			return result;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("ѭ���׳��쳣�ˣ�����");
			return -1;
		}
	}

	/**
	 * divider(����)
	 * result(���)
	 * try-catch����whileѭ��
	 * ÿ��ѭ����divider��һ��result=result+100/divider
	 * ����������쳣���ʹ�ӡ������׳��쳣�ˣ�������������result=999
	 * ���򣺷���result
	 * finally:��ӡ���������finally����������ͬʱ��ӡ���result��ֵ
	 */
	public int test2(){
		int divider = 10;
		int result = 100;
		try{
			while(divider > -1){
				divider--;
				result = result + 100/divider;
			}
			return result;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("ѭ���׳��쳣�ˣ�����");
			return result = 999;
			//�ڷ�������mian����֮ǰ������finally
		}finally{
			System.out.println("����finally������");
			System.out.println("result��ֵ��"+result);
		}
	}
	

	/**
	 * divider(����)
	 * result(���)
	 * try-catch����whileѭ��
	 * ÿ��ѭ����divider��һ��result=result+100/divider
	 * ����������쳣���ʹ�ӡ������׳��쳣�ˣ�������
	 * finally:��ӡ���������finally����������ͬʱ��ӡ���result��ֵ
	 * ��󷵻�1111��Ϊ���
	 */
	public int test3(){
		int divider = 10;
		int result = 100;
		try{
			while(divider > -1){
				divider--;
				result = result + 100/divider;
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("ѭ���׳��쳣�ˣ�����");
		}finally{
			System.out.println("����finally������");
			System.out.println("result��ֵ��"+result);
		}
		System.out.println("Test3�������");
		return 1111;
	}
	
}
