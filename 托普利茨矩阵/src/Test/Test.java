package Test;

import 解题方法.Solution;

public class Test {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[][] matrix = {{1,2,},{2,2}};
		
		boolean result = solution.isToeplitzMatrix(matrix);
		
		System.err.println(result);
	}
}
