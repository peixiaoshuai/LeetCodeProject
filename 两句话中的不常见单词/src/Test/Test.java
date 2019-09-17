package Test;

import java.util.Arrays;
import java.util.List;

import 解题方法.Solution;

public class Test {
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		String A = "apple apple";
		
		String B = "banana";
		
		String[] result = solution.uncommonFromSentences(A, B);
		
		System.err.println(Arrays.toString(result));
	}
}
