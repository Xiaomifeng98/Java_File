package com.奥数;
//组合667788这六个数，然后能被168整除
public class Initial {
	public static void main(String[] args) {
		int i;
		String s;
		for(i=667788;i<=887766;i++) {
			if(i%168 == 0) {
				int b=0,q=0,l=0;
				s=Integer.toString(i);
				for(int a = 0;a<s.length();a++) {
					if(s.charAt(a) == '8')
						b++;
				}
				for(int a = 0;a<s.length();a++) {
					if(s.charAt(a) == '7')
						q++;
				}
				for(int a = 0;a<s.length();a++) {
					if(s.charAt(a) == '6')
						l++;
				}
				if(b == 2 && q == 2 && l == 2)
					System.out.println(i);
			}
		}
	}

}
