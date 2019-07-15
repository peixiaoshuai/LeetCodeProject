package 解题方法;

import java.util.HashMap;
import java.util.Map;
/**
 * 循环数组将其存入到哈希表map中，数组元素为key值，出现次数为value值。
 * 最后循环map，去value值与N/2比较取得结果值
 * @author Simon.Hoo
 *
 */
public class Solution {
	public int majorityElement(int[] nums) {
		int result = 0;
		Map<Integer,Integer> map = new HashMap<Integer, Integer>(); 
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])){
				map.put(nums[i], map.get(nums[i])+1);
			}else{
				map.put(nums[i],1);
			}
		}
		int temp = nums.length / 2;
		for (int i : map.keySet()) {
			if(map.get(i) > temp){
				result = i;
				break;
			}
		}
		return result;
	}
}
