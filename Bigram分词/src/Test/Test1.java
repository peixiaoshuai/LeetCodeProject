package Test;

import java.util.Arrays;

import 解题方法.Solution;

/**
 * 测试用例
 * @author Simon.Hoo
 *
 */
public class Test1 {
	/**
	 *1.	 用例：text = "alice is a good girl she is a good student", first = "a", second = "good"
	 * 		output： ["girl","student"]
	 * 2.   用例 ：text = "we will we will rock you", first = "we", second = "will"
	 * 		output：["we","rock"]
	 * @param args
	 */
	public static void main(String[] args) {
		Solution solution = new Solution();
		String[] result = solution.findOcurrences("we will we will rock you","we","will");
		System.err.println(Arrays.toString(result));
	}
	
}
