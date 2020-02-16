import java.util.Arrays;

public class 导入数组排序包 {
    public static void main(String[] args) {
        
		// 定义一个字符串数组
		String[] hobbies = { "sports", "game", "movie" };
        
		// 使用Arrays类的sort()方法对数组进行排序
		Arrays.sort(hobbies);
        
		// 使用Arrays类的toString()方法将数组转换为字符串并输出
		System.out.println(  ""+Arrays.toString(hobbies)          );
	}
}