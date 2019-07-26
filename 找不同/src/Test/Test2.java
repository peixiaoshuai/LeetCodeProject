package Test;

import 解题方法.Solution2;

public class Test2 {
	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		
		String s ="a";
		
		String t = "aa";
		
		char result = solution.findTheDifference(s, t);
		
		System.err.println(result);
	}
}
