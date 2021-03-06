package com.自定义异常以及异常链;

public class ChainTest {

	/**
	 * test1():抛出"喝大了"异常
	 * test2():捕获“喝大了”异常，并且包装成运行时异常，继续抛出
	 * mian方法中，调用test2()，尝试捕获test2()方法抛出的异常
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
		throw new DrunkException("开车别喝酒！");
	}
	
	public void test2(){
		try {
			test1();
		} catch (DrunkException e) {
			// TODO Auto-generated catch block
			RuntimeException newExc = new RuntimeException("司机一滴酒，亲人两行泪");
			newExc.initCause(e);
			throw newExc;
		}
	}
}
