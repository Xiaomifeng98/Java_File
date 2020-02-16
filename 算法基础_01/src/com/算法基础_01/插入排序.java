package com.算法基础_01;

import java.util.Scanner;

public class 插入排序 {
	public static void main(String[] args) {
		
		//输入一个字符串数组
		Scanner Sc = new Scanner(System.in);
		System.out.print("输入一个将要被排序的数组：");
		String s1 = Sc.nextLine();
		
		//将字符串数组转化为整型数组
		String s2[] = s1.split(" ");
		int Size = s2.length;
		int[] a = new int[Size];
		for(int i = 0;i<Size;i++) {
			a[i] = Integer.parseInt(s2[i]);
		}
		
		//拿a[i]和a[0],a[1],..,a[j],...,a[i-1]从右往左比较
		for(int i = 1;i<Size;i++) {
			int key = a[i];
			
			//这种算法的思想好像是你比较一个，就直接把前面的往后移（下标加1）
				//比如a[2]=6比a[3]=2=key，6>2,就直接把a[3]=a[2],
					//那么a[3]中的2怎么办？
						//a[3]中的2已经保存在key中，如果a[1]=1<key,符合从大到小的顺序，那么a[2]就等于key了
			
			//拿出来比较的数字key要一个个的和前面的比较直到遇到了小于key的数字
			//（在这之前一直是大于key，所以程序里是"a[j]>key"，这样才能进入循环进行下面的操作）
				//那么，在这个过程中，每比较一次就把被比较的那个数字的下标加一
				//这样，就留出了下一个元素下标加一的位置
				//如果下一个元素刚好比key小，那么这个位置就直接是key的位置了
			
			//j的界限为[0,i-1]
			int j = i-1;
			while(j>=0 && a[j]>key) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
		
		//显示排序后的数组
		System.out.print("排序后的数组为：");
		for(int i = 0;i<Size;i++) {
			System.out.print(a[i]+" ");
		}
		Sc.close();
	}
}
