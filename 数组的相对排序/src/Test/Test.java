package Test;

import java.util.Arrays;

import 解题方法.Solution;

public class Test {
	public static void main(String[] args) {
		int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
		int[] arr2 = {2,1,4,3,9,6};
		Solution solution = new Solution();
		
		int[] reslut = solution.relativeSortArray(arr1, arr2);
		
		System.err.println(Arrays.toString(reslut));
	}
}
