package Test;



import 解题方法.Solution;

public class Test {
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		String S = "The quick brown fox jumped over the lazy dog";
		
		
		String result = solution.toGoatLatin(S);
		
		System.err.println(result);
	}
}
