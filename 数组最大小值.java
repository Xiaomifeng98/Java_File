package com.imooc;
public class �������Сֵ {
    
    public static void main(String[] args) {
        
		// ����һ���������飬������ֵ
		int[] nums = new int[] { 61, 23, 4, 74, 13, 148, 20 };
        
		int max = nums[0]; // �ٶ����ֵΪ�����еĵ�һ��Ԫ��
		int min = nums[0]; // �ٶ���СֵΪ�����еĵ�һ��Ԫ��
		double sum = 0;// �ۼ�ֵ
		double avg = 0;// ƽ��ֵ
        
		for (int i = 0; i < nums.length; i++) { // ѭ�����������е�Ԫ��
        // �����ǰֵ����max�����滻max��ֵ
		if(nums[i]>max){
		    nums[i]=max;
		}
        
        
        // �����ǰֵС��min�����滻min��ֵ
		if(nums[i]<min){
		    nums[i]=min;
		}
        
        
        
        // �ۼ����
        sum+=nums[i];
        
		}
        
        // ��ƽ��ֵ
       avg=sum/(nums.length+1);
        
		System.out.println("�����е����ֵ��" + max);
		System.out.println("�����е���Сֵ��" + min);
		System.out.println("�����е�ƽ��ֵ��" + avg);
	}
}