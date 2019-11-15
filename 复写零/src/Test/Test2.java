package Test;

import java.util.Arrays;

import 解题方法.Solution;
import 解题方法.Solution1;

public class Test2 {
	public static void main(String[] args) {
		Solution1 solution = new Solution1();
		int[] arr = {1,0,2,3,0,4,5,0};
		
		solution.duplicateZeros(arr);
		
		System.err.println(Arrays.toString(arr));
	}
}
