package Test;

import java.util.Arrays;

import 解题方法.Solution;

public class Test2 {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] A = {1,2,3,4};
		int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
		int[] result = solution.sumEvenAfterQueries(A, queries);
		
		System.err.println(Arrays.toString(result));
	}
}
