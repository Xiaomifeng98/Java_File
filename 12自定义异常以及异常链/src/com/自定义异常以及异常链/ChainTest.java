package com.�Զ����쳣�Լ��쳣��;

public class ChainTest {

	/**
	 * test1():�׳�"�ȴ���"�쳣
	 * test2():���񡰺ȴ��ˡ��쳣�����Ұ�װ������ʱ�쳣�������׳�
	 * mian�����У�����test2()�����Բ���test2()�����׳����쳣
	 */
	public static void main(String[] args) {
		ChainTest ct = new ChainTest();
		try{
			ct.test2();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

	public void test1() throws DrunkException{
		throw new DrunkException("������Ⱦƣ�");
	}
	
	public void test2(){
		try {
			test1();
		} catch (DrunkException e) {
			// TODO Auto-generated catch block
			RuntimeException newExc = new RuntimeException("˾��һ�ξƣ�����������");
			newExc.initCause(e);
			throw newExc;
		}
	}
}
