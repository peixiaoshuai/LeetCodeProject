package Test;

import 解题方法.Solution;

public class Test {
	public static void main(String[] args) {
		//int[] nums = {2,2,1,1,1,2,2};
		int[] nums = {3,2,3};
		Solution solution = new Solution();
		
		int reslut = solution.majorityElement(nums);
		
		System.err.println(reslut);
	}
}
