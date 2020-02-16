package com._06Math类操作数据;

public class Initial {
	public static void main(String[] args) {
		double a = 6.52;
		int b = (int)a;
		System.out.println("int b = (int)dou\n           强制转换：" + b);
		
		long c = Math.round(a);
		System.out.println("long c = Math.round(a)\n           调用round方法进行四舍五入：" + c);
		
		double d = Math.floor(a);
		System.out.println("double d = Math.floor(a)\n           调用floor方法，返回小于参数的最大整数：" + d);
		
		double e = Math.ceil(a);
		System.out.println("double e Math.ceil(a)\n           调用ceil方法，返回大于参数的最小整数：" + e);
		
		double f = Math.random();
		System.out.println("double f = Math.random()\n           调用random方法，返回[0,1]的随机浮点数：" + f);

		double g = (int)(Math.random() * 101);
		System.out.println("double g = (int)(Math.random() * 101)\n           生成[0,100]的随机整数：" + g);
	
		/**
		 * foreach循环输出数组中的元素示例
		 */
		//循环给数组赋值
		int[] nums = new int[10];
		for(int i = 0; i < 10; i++) {
			int h = (int)(Math.random() * 10);
			nums[i] = h;
		}
		System.out.print("foreach语句循环输出数组：");
		//foreach语句格式
		for(int num : nums) {
			System.out.print(num + " ");
		}
		
	}
}
