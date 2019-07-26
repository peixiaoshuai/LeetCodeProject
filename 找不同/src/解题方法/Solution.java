package 解题方法;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * 利用哈希表存储字符串s,t的每一个字符，key值为字符本身，value为出现次数。
 * 如果一个字符c满足：sMap.containsKey(c) || sMap.get(c) != tMap.get(c)
 * 则目标字符就是c
 * @author pxs
 *
 */
public class Solution {
	public char findTheDifference(String s, String t) {
		char result = 0;
		Map<Character, Integer> sMap = new HashMap<>();
		Map<Character, Integer> tMap = new HashMap<>();
		for (Character c : s.toCharArray()) {
			if(sMap.containsKey(c)){
				sMap.put(c, sMap.get(c)+1);
			}else{
				sMap.put(c, 1);
			}
		}
		for (Character c : t.toCharArray()) {
			if(tMap.containsKey(c)){
				tMap.put(c, tMap.get(c)+1);
			}else{
				tMap.put(c, 1);
			}
		}
		Set<Character> set = tMap.keySet();
		for (Character c : set) {
			if(!sMap.containsKey(c) || sMap.get(c) != tMap.get(c)){
				result = c;
				break;
			}
		}
		return result;
	}
}
