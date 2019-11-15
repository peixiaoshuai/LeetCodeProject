package test;

import 解题方法.Solution;

public class Test {
	public static void main(String[] args) {
		
		Solution solution = new Solution();
		
		int n = 20;
		
		boolean isHappy = solution.isHappy(n);
		
		System.err.println(isHappy);
		
	}
}
