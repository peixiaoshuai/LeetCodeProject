package Test;

import java.util.Arrays;

import 解题方法.Solution;

public class Test {
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		int[] nums = {0,1,0,3,12};
		
		solution.moveZeroes(nums);
		
		System.err.println(Arrays.toString(nums));
		
		
	}
}
