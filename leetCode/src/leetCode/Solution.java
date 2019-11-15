package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	/**
	 * 将文本text转成数组，循环数组，判断当前元素是否与指定second元素相同并且判断前一位元素是否与指定first元素相同，
	 * 如果同时满足，则下一位元素就是目标元素
	 * @param text
	 * @param first
	 * @param second
	 * @return
	 */
	public static String[] findOcurrences(String text, String first, String second) {
		String[] texts = text.split(" ");
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < texts.length -1; i++) {
			if(texts[i].equals(second) && i != 0){
				if(texts[i-1].equals(first)){
					list.add(texts[i+1]);
				}
			}
		}
		return list.toArray(new String[list.size()]);
	}
	//测试用例
	public static void main(String[] args) {
		String[] result = findOcurrences("we will we will rock you","we","will");
		System.err.println(Arrays.toString(result));
	} 
}
