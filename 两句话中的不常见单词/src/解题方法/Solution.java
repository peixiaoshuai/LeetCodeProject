package 解题方法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * 使用hash表计数法
 * 每个不常见的单词总共只出现一次。我们可以统计每个单词的出现次数，然后返回恰好出现一次的单词。
 * @author pxs
 *
 */
public class Solution {
	public String[] uncommonFromSentences(String A, String B) {
		Map<String, Integer> map = new HashMap<>();
		for (String a : A.split(" ")) {
			if(map.get(a) != null){
				map.put(a, map.get(a)+1);
			}else{
				map.put(a, 1);
			}
		}
		for (String b : B.split(" ")) {
			if(map.get(b) != null){
				map.put(b, map.get(b)+1);
			}else{
				map.put(b, 1);
			}
		}
		List<String> list = new ArrayList<String>();
		for (String string : map.keySet()) {
			if(map.get(string) == 1){
				list.add(string);
			}
		}
		return list.toArray(new String[list.size()]);
		
	}
}
