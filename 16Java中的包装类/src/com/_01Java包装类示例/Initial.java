package com._01Java包装类示例;

public class Initial {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//定义int类型变量，值位86
		int score1 = 86;
		
		//创建Integer包装类对象，表示变量score1的值
		Integer score2 = new Integer(score1);
		
		//将Integer包装类转换为double类型
		double score3 = score2.doubleValue();
		
		//将Integer包装类转换为float类型
		float score4  = score2.floatValue();
		
		//将Integer包装类转换为int类型
		int score5 = score2.intValue();
		
		System.out.println("最初的int类型： " + score2);
		System.out.println("Integer包装类：" + score2);
		System.out.println("double类型：" + score3);
		System.out.println("float类型：" + score4);
		System.out.println("int类型：" + score5);
		
	}

}
