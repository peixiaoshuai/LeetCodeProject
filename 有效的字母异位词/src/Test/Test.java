package Test;

import java.util.HashMap;
import java.util.Map;

import 解题方法.Solution;

public class Test {
	public static void main(String[] args) {
//		Solution solution = new Solution();
//		
//		String s = "";
//		String t = "";
//		
//		boolean result = solution.isAnagram(s, t);
//		
//		System.err.println(result);
		Map map = new HashMap();
		map.put(0, "1");
		map.put(1, "2");
		map.put(map.keySet().size(), "3");
		map.remove(1);
		map.put(map.keySet().size(), "4");
		System.err.println(map);
	}
}
