package test;

import 解题方法.Solution2;

public class Test2 {
	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		
		int n = 20;
		
		boolean isHappy =  solution.isHappy(n);
		
		System.err.println(isHappy);
	}
}
