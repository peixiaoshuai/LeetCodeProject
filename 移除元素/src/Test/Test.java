package Test;

import java.util.Arrays;

import 解题方法.Solution;

public class Test {
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		int[] nums = {0,1,2,2,3,0,4,2};
		
		int val = 2;
		
		int result = solution.removeElement(nums, val);
		System.out.println(result);
		System.out.println(Arrays.toString(nums));

	}
}
