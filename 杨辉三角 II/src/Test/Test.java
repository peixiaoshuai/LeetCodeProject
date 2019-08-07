package Test;

import java.util.List;

import 解题方法.Solution;

public class Test {
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		int rowIndex = 2;
		
		List<Integer> result = solution.getRow(rowIndex);
		
		System.err.println(result.toString());
	}
}
