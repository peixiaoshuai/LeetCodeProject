package test;

import 解题方法.Solution;

public class Test {
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		String[] words = {"hello","leetcode"};
		
		String order = "hlabcdefgijkmnopqrstuvwxyz";
		
		boolean res = solution.isAlienSorted(words, order);
		
		System.out.println(res);
	}
}
