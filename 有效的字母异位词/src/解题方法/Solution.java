package 解题方法;

import java.util.Arrays;

/**
 * 排序
 * 通过将 ss 的字母重新排列成 tt 来生成变位词。
 * 因此，如果 TT 是 SS 的变位词，对两个字符串进行排序将产生两个相同的字符串。此外，如果 ss 和 tt 的长度不同，tt 不能是 ss 的变位词，我们可以提前返回。
 * @author pxs
 *
 */
public class Solution {
	public boolean isAnagram(String s, String t) {
		if(s.equals("") && t.equals("")){
			return true;
		}
		if(s.length() != t.length() || (s.equals(t) && s.equals(t))){
			return false;
		}
		char[] sc = s.toCharArray();
		Arrays.sort(sc);
		char[] tc = t.toCharArray();
		Arrays.sort(tc);
		return Arrays.equals(sc, tc);
	}
}
