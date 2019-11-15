package Test;

import 求一个数的阶乘.GetFactorialRecursion;

public class TestrRecuision {
	public static void main(String[] args) {
		GetFactorialRecursion getFactorialRecursion = new GetFactorialRecursion();
		
		int n = 4;
		
		int result = getFactorialRecursion.getFactorial(n);
		
		System.err.println(result);
	}
}
