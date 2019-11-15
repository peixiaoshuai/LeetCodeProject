package 解题方法;

/**
 * 为了检查相邻单词 a，b 是否满足 a <= b，只需要检查它们第一个不同的字母就可以了。
 * 例如，对于"applying" 和 "apples"，第一个不同的字母是 y 和 e。之后只需要比较这两个字母在 order 中的下标就可以了。
 * 还需要考虑两个单词长度不等的情况。例如，当比较 "app" 和 "apply" 的时候，前三个字母都是相等的，但 "app" 比 "apply" 更短，所以满足 a <= b。
 * @author pxs
 *
 */
public class Solution {
	public boolean isAlienSorted(String[] words, String order) {
		search : for (int i = 0; i < words.length -1; i++) {
			String a = words[i];
			String b = words[i+1];
			for (int k = 0; k < Math.min(a.length(), b.length()); k++) {
				if(a.charAt(k) != b.charAt(k)){
					if(order.indexOf(a.charAt(k)) > order.indexOf(b.charAt(k))){
						return  false;
					}
					continue search;
				}
			}
			if(a.length() < b.length()){
				return  false;
			}
		}
	return true;
	}
}
