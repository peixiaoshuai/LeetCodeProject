package Test;

import 解题方法.Solution1;

public class Test1 {
	public static void main(String[] args) {
		Solution1 solution = new Solution1();
		
		String s = "anagram";
		String t = "nagaram";
		
		boolean result = solution.isAnagram(s, t);
		
		System.err.println(result);
		
	}
}
