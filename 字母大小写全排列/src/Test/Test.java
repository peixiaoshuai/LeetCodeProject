package Test;

import java.util.List;

import 解题方法.Solution;

public class Test {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String S = "jw";
		
		List<String> result = solution.letterCasePermutation(S);
		
		System.err.println(result.toString());
	}
}
