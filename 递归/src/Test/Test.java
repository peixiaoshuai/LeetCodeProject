package Test;

import 求一个数的阶乘.GetFactorial;
/**
 * 使用for循环求一个数的阶乘
 * @author Simon.Hoo
 *
 */
public class Test {
	public static void main(String[] args) {
		GetFactorial getFactorial = new GetFactorial();
		int n = 5;
		
		int result = getFactorial.getFactorialFor(n);
		
		System.err.println(result);
	}
}
