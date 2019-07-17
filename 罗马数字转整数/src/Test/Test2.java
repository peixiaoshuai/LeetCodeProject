package Test;

import 解题方法.Solution2;

public class Test2 {
	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		//String s = "III";
		//String s = "IV";
		//String s = "IX";
		//String s = "LVIII";
		String s = "MCMXCIV";
		//String s = "III";
		
		int result = solution.romanToInt(s);
		System.err.println(result);
	}
}
