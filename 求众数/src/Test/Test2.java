package Test;

import 解题方法.Solution2;

public class Test2 {
	public static void main(String[] args) {
		int[] nums = {2,4,1,1,1,1};
		//int[] nums = {3,2,3};
		Solution2 solution = new Solution2();
		
		int reslut = solution.majorityElement(nums);
		
		System.err.println(reslut);
	}
}
