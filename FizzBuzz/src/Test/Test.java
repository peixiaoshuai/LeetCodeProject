package Test;

import java.util.List;

import 解题方法.Solution;

public class Test {
	public static void main(String[] args) {
		Solution solution = new Solution();
		List<String> result = solution.fizzBuzz(15);
		System.err.println(result.toString());
	}
}
