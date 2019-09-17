package Test;

import java.util.Arrays;

import 解题方法.Solution2;

public class Test2 {
	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		
		int[] nums = {0,0,1};
		
		solution.moveZeroes(nums);
		
		System.err.println(Arrays.toString(nums));
	}
}
