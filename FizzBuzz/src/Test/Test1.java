package Test;

import java.util.List;

import 解题方法.Solution2;

/**
 * 测试实例：
 * 	输入：30；
 * 	输出：[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, FizzBuzz]
 * @author Simon.Hoo
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		List<String> result = solution.fizzBuzz(30);
		System.err.println(result.toString());
	}
}
