package Test;

import 求一个数的乘方.Pow;

public class PowTest {
	public static void main(String[] args) {
		Pow pow = new Pow();
		int x = 2;
		
		int y = 8;
		
		int result = pow.pow(x, y);
		
		System.err.println(result);
		
	}
}
