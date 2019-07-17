package 解题方法;

import java.util.Stack;

/**
 * 利用栈数据结构，每次插入字符的时候要栈头元素比较，若相同，栈不增加当前元素并且移除栈头元素
 * @author pxs
 *
 */
public class Solution {
	public String removeDuplicates(String S) {
		char[] cs = S.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (char c : cs) {
			if(!stack.isEmpty() && stack.peek() == c){
				stack.pop();
			}else{
				stack.push(c);
			}
		}
		StringBuffer result = new StringBuffer();
		for (Character character : stack) {
			result.append(character);
		}
		return result.toString();
	}
}
