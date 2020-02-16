package com.String类常用的方法;

public class Initial {

	public static void main(String[] args) {
		String string1 = "1138803648@qq.com";
		String string1_1 = "1138803648@QQ.COM";
		String string2 = "wenqingfeng1998@outlook.com";
		String string3 = "1138803648";
		
		System.out.println("string1  :"+string1);
		System.out.println("string1_1:"+string1_1);
		System.out.println("string2  :"+string2);
		System.out.println("string3  :"+string3);
		System.out.println("");
		
		// public int length()
		// 返回字符串长度
		int length_length = string1.length();
		System.out.println("string1的长度为："+length_length);
		
		// public boolean equals(String s)
		// 比较字符串是否相等，返回布尔类型的值
		boolean equals_buer = string1.equals(string2);
		System.out.println("string1与string2比较之后的值为："+equals_buer);
		
		// public boolean startWith(String s)
		// public boolean endWith(String s)
		// 判断字符串前缀或者后缀是否为指定的字符串，返回布尔类型的值
		boolean startWith_buer = string1.startsWith("113");
		boolean endWith_buer = string2.endsWith("com");
		System.out.println("string1是否以“113”开始："+startWith_buer);
		System.out.println("string2是否以“com”结尾："+endWith_buer);

		// public boolean regionMatches(int firstStart,String other,int otherStart,int length)
		// 将字符串以firstStart开始取length长度与Other的otherStart开始比较是否相同
		boolean regionMatches_buer1 = string1.regionMatches(13, string2, 23, 3);
		System.out.println("string1.regionMatches(13, string2, 23, 3)的值为："+regionMatches_buer1);
		// public boolean regionMatches(boolean b,int firstStart,String other,int otherStart,int length)
		// 通过b可以决定是否忽略大小写
		boolean regionMatches_buer2 = string1.regionMatches(true, 0, string1_1, 0, length_length);
		System.out.println("string1.regionMatches(true, 0, string1_1, 0, length_length)的值为："+regionMatches_buer2);

		// public int compareTo(String s)
		// 比较字符串的大小，相同返回0，大于返回正值，小于返回负值
		// public int compareToIgnoreCase(String s)方法可忽略大小写
		if(string1.compareTo(string2) == 0) {
			System.out.println("string1与string2的大小相等");
		}
		if(string1.compareTo(string2) < 0) {
			System.out.println("string1小于string2");
		}
		if(string1.compareTo(string2) > 0) {
			System.out.println("string1大于string2");
		}
		
		// 判断当前字符串是否含有指定的字符串，并返回布尔类型的值
		// public boolean contains(String s)
		boolean contains_buer = string1.contains(".com");
		System.out.println("string1中是否含有“.com”："+contains_buer);
		
		//检索字符串s第一次出现的位置
		//public int indexOf(String s)
		int indexOf_int = string1.indexOf("@");
		System.out.println("string1字符串中“@”字符串第一次出现的位置是："+indexOf_int);
		//检索字符串在第startpointe位置以后第一次出现的位置
		//public int indexOf(String s,int startpoint)
		int indexOf_int2 = string2.indexOf("ng", 7);
		System.out.println("string2字符串在第7位以后第一次出现“ng”的位置是："+indexOf_int2);
		
		//获取从startpoint位置到最后的字符串
		//public String substring(int startpoint)
		String string_substring1 = string2.substring(16);
		System.out.println("从16位开始后string2获取的字符串为："+string_substring1);
		//获取从start位置到end位置的字符串
		//public String substring(int start,int end)
		String strign_substring2 = string2.substring(16, 23);
		System.out.println("从16位开始到23位string2获取的字符串为："+strign_substring2);
		
		//获取去掉前后空格的字符串
		//public String trim()
		
		//将数字组成的字符串转化成int类型的数据，但需要使用Integer类调用此方法
		//public static int parseInt(String s)
		int parseInt_string = Integer.parseInt(string3);
		System.out.println("string3转换成数字类型之后是："+parseInt_string);
		//类似的还有其他的很多种方法，比如double，float，long，short，byte都用相应的类调用方法

	}

}
