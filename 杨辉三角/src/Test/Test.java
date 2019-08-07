package Test;

import java.util.List;

import 解题方法.Solution;

public class Test {
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		int numRows = 5;
		
		List<List<Integer>> result = solution.generate(numRows);
		
		System.err.println(result.toString());
	}
}
