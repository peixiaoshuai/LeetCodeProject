package test;

import 解题方法.Solution1;

public class Test1 {
	public static void main(String[] args) {
		Solution1 solution = new Solution1();
		
		int n = 289;
		
		boolean isHappy = solution.isHappy(n);
		
		System.err.println(isHappy);
	}
}
