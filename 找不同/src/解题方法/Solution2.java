package 解题方法;

/**
 * 异或法
 * 异或（^）：如果输出位的某一个是1，但不全是1，那么按位“异或”操作生成一个输出位1
 * 0与一个数进行异或操作，输出还是原数，两个相同的数进行异或操作输出为0，
 * 分别循环字符串s，t，进行异或操作，最后结果即为目标结果
 * @author pxs
 *
 */
public class Solution2 {
	public char findTheDifference(String s, String t) {
		char result = 0;
		for (int i = 0; i < s.length(); i++) {
			result ^= s.charAt(i);
		}
		for (int i = 0; i < t.length(); i++) {
			result ^= t.charAt(i);
		}
		return result;
	}
}
