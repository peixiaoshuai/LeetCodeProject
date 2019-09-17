package 解题方法;

import java.util.HashMap;
import java.util.Map;
/**
 * 暴力解法数组足够大的时候，效率会明显变慢
 * 使用哈希表存储所有可能范围的和，利用空间换取效率
 * @author pxs
 *
 */
public class NumArray2 {

	private Map<String, Integer> map = new HashMap<String, Integer>();
	public NumArray2(int[] nums) {
	    for (int i = 0; i < nums.length; i++) {
	    	int sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum += nums[j];
				map.put(i+""+j, sum);
			}
		}
	}
	public int sumRange(int i, int j) {
		return map.get(i+""+j);
	}
}
