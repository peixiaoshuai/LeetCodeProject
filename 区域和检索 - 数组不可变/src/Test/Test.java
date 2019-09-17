package Test;

import 解题方法.NumArray;

public class Test {
	public static void main(String[] args) {
		int[] nums = {-2, 0, 3, -5, 2, -1};
		NumArray array = new NumArray(nums);
		
		int sum = array.sumRange(2, 5);
		
		System.err.println(sum);
	}
}
