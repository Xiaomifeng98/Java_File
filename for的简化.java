import java.util.Arrays;
public class for的简化 {
    
    public static void main(String[] args) {
        
		// 定义一个整型数组，保存成绩信息
		int[] scores = { 89, 72, 64, 58, 93 };
        
		// 对Arrays类对数组进行排序
		Arrays.sort(scores);
        
		// 使用foreach遍历输出数组中的元素:for(元素类型  元素变量 : 遍历对象);
		for ( int score : scores ) {
			System.out.println(score);
		}
	}
}
