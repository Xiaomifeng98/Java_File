package com.StringBuilder类;

public class Initial {
    public static void main(String[] args) {
    	
    	/**
    	 * StringBuilder append(参数)：追加内容到当前StringBuilder对象的结尾
    	 * StringBuilder Insert(位置,参数)：将内容插入到StringBuilder对象的指定位置
    	 * String toString()：将StringBuilder对象转换为String对象
    	 * int length()：获取字符串长度
    	 */
		// 创建一个空的StringBuilder对象
		StringBuilder str = new StringBuilder();
		// 追加字符串
		str.append("ktt520");
        // 从后往前每隔三位插入逗号
        for(int i = str.length()-3;i>=0;i=i-3){
            str.insert(i,",");
        }
        // 将StringBuilder对象转换为String对象并输出
		System.out.print(str.toString());
	}
	

}
