package Test;

import 解题方法.Solution3;

public class Test3 {
	public static void main(String[] args) {
		//int[] nums = {2,2,1,1,1,2,2};
		int[] nums = {3,2,3};
		Solution3 solution = new Solution3();
		
		int reslut = solution.majorityElement(nums);
		
		System.err.println(reslut);
	}
}
