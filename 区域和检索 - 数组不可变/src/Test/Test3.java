package Test;

import 解题方法.NumArray3;

public class Test3 {
	public static void main(String[] args) {
		int[] nums = {-2, 0, 3, -5, 2, -1};
		NumArray3 array = new NumArray3(nums);
		
		int sum = array.sumRange(2,5);
		
		System.err.println(sum);
	}
}
