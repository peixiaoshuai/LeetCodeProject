package 解题方法;

/**
 * 双指针
 * 直接用一个变量来记录需要保留的元素下标，然后再用一个变量来遍历原数组
 * @author pxs
 *
 */
public class Solution {
	public int removeElement(int[] nums, int val) {
		int len = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != val){
				nums[len] = nums[i];
				len++;
			}
		}
		return len;
	}
}
