package Test;

import java.util.Arrays;

import 解题方法.Solution;

public class Test {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] arr = {1,0,2,3,0,4,5,0};
		
		solution.duplicateZeros(arr);
		
		System.err.println(Arrays.toString(arr));
	}
}
