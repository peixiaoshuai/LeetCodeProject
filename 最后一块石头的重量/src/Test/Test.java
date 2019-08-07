package Test;

import java.util.List;

import 解题方法.Solution;

public class Test {
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		int[] stones = {1,3,2,4,5};
		
		int  result = solution.lastStoneWeight(stones);
		
		System.err.println(result);
	}
}
