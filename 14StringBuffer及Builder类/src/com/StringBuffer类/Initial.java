package com.StringBuffer类;

public class Initial {
	public static void main(String[] args) {
		StringBuffer strBuffer1 = new StringBuffer("ketingting");
		String str = "520";
		
		/**append方法会将append后的参数转化为字符串后追加到StringBuffer的对象后，并且更新StringBuffer的对象*/
		strBuffer1.append(str);
		System.out.println(strBuffer1);	//这里输出的并不是ktt
		
		/**
		 * public char charAt(int n)得到参数n指定位置的单个字符（第一个位置为0）
		 * public void setcharAt(int n,char ch)将当前StringBuffer对象实体中的字符串位置n处的字符用参数ch指定的字符替换
		 */
		if(strBuffer1.charAt(0)=='k'&&strBuffer1.charAt(2)=='t'&&strBuffer1.charAt(6)=='t') {
			System.out.println("名字简称为ktt");
		}
		strBuffer1.setCharAt(0, 'K');		//首字母大写
		System.out.println(strBuffer1);
		
		/**
		 * StringBuffer insert(int index,String str)将参数str指定的字符串插入到参数index指定的位置，并返回当前对象
		 */
		System.out.println(strBuffer1.insert(10, ','));
		
		/**
		 * public StringBuffer reverse()将该对象实体中的字符翻转，并返回到当前对象的引用
		 */
		System.out.println(strBuffer1.reverse());
		System.out.println(strBuffer1.reverse());	//恢复一下，免得后面乱了
		
		/**
		 * StringBuffer delete(int startIndex,int end Index)从当前StringBuffer对象实体的字符中删除一个子字符串，并返回到当前对象的引用
		 * 也就是删除从startIndex到endIndex-1的字符串
		 */
		System.out.println(strBuffer1.delete(10 , 11));
		
		/**
		 * StringBuffer replace(int startIndex,int end Index,String str)将当前StringBuffer对象实体中的子字符串用参数str指定的字符串替换
		 */
		System.out.println(strBuffer1.replace(10 , 13,"520,"));
	}

}
