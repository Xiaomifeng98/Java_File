package com.Demo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**这种情况下就不是多态，只是子类调用重写的方法
		 * Chinese p = new Chinese();
		 * American p2 = new American();
		 */
		
		/**必须两个类有继承关系才能使用多态*/
		Person p = new Chinese();
		Person p2 = new American();
		p.say();
		p2.say();
	}

}
