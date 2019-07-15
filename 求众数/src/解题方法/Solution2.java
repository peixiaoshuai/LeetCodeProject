package 解题方法;

import java.util.Arrays;

/**
 * 排序法，已知数组的众数存在的个数是大于n/2的，则将数组进行递减或者递增排序后，数组的中间值一定是为众数
 * @author Simon.Hoo
 *
 */
public class Solution2 {
	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}
}
