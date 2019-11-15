package 解题方法;

public class Solution {
	public int bitwiseComplement(int N) {
		String Ns = Integer.toBinaryString(~N);
		int result  = Integer.valueOf(Ns, 2);
		return result;
	}
}
