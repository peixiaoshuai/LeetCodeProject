package Test;

import 解题方法.NumArray2;

public class Test2 {
	public static void main(String[] args) {
		int[] nums = {-2, 0, 3, -5, 2, -1};
		NumArray2 array = new NumArray2(nums);
		
		int sum = array.sumRange(2,5);
		
		System.err.println(sum);
	}
}
