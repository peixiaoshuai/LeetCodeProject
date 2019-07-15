package Test;

import java.util.Arrays;

import 解题方法.Solution2;

public class Test2 {
	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		int[] nums1 = {1,3,5,2,4};
		int[] nums2 = {6,5,4,3,2,1,7};
		int[] result = solution.nextGreaterElement(nums1, nums2);
		System.err.println(Arrays.toString(result));
	}
}
