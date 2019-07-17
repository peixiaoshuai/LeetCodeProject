package Test;

import 解题方法.Solution;

public class Test {
	public static void main(String[] args) {
		Solution solution = new Solution();
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
