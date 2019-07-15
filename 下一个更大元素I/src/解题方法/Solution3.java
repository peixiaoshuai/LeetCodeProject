package 解题方法;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
/**
 * 单调栈解决 Next Greater Number 问题：
 * 先找出nums2中当前遍历元素的下个更大元素，存入哈希表中，利用键值对来查询。 利用stack栈来遍历，
 * @author Simon.Hoo
 *
 */
public class Solution3 {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Stack<Integer> stack = new Stack<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums2.length; i++) {
			while(!stack.isEmpty() && stack.peek() < nums2[i]){
				map.put(stack.pop(),nums2[i]);
			}
			stack.push(nums2[i]);
		}
		for (int i = 0; i < nums1.length; i++) {
			if(map.containsKey(nums1[i])){
				nums1[i] = map.get(nums1[i]);
			}else{
				nums1[i] = -1;
			}
		}
		return nums1;
	}
}
