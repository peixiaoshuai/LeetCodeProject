package 解题方法;


/**
 * 普通解法：对句子进行分割，然后对每个单词进行处理。
 * 正则表达式判断首字母是否为元音。
 * @author pxs
 *
 */
public class Solution {
	public String toGoatLatin(String S) {
		String as = "a";
		StringBuffer result = new StringBuffer();
		for (String s : S.split(" ")) {
			if(String.valueOf(s.charAt(0)).matches("[aAeEuUiIOo]")){//正则表达式判断首字母是否为元音。
				s = s +"ma"+as;
				result.append(s);
			}else{
				s = s.substring(1, s.length()) + s.substring(0, 1)+ "ma"+as;
				result.append(s);
			}
			as = as +"a";
			result.append(" ");
		}
		return result.toString().trim();
	}
}
