package 解题方法;

/**
 * 建立数组空间 长度为n+1，存储0-n位每一位的泰波那契数 Tn 的值。
 * 数组的最后一位就是结果值（空间利用率比较低）
 * @author pxs
 *
 */
public class Solution {
	public int tribonacci(int n) {
		if(n == 0){
			return 0;
		}
		if(n == 1 || n == 2){
			return 1;
		}
		int[] ns = new int[n+1];
		ns[0] = 0;
		ns[1] = 1;
		ns[2] = 1;
		for (int i = 3; i < ns.length; i++) {
			ns[i] = ns[i-1]+ ns[i-2] + ns[i-3];
		}
		
		return ns[n];
	}
}
