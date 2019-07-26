package 解题方法;
/**
 * 字符串ASCII差值法
 * @author pxs
 *
 */
public class Solution4 {
	public char findTheDifference(String s, String t) {
		int sCount = 0;
		int tCount = 0;
		for (char c : s.toCharArray()) {
			sCount += c;
		}
		for (char c : t.toCharArray()) {
			tCount += c;
		}
		return (char) (tCount-sCount);
	}
}
