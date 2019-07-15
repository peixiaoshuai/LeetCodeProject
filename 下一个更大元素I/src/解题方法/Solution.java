package 解题方法;

/**
 * 暴力解法
 * @author Simon.Hoo
 *
 */
public class Solution {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] result = new int[nums1.length];
		for (int i = 0; i < nums1.length; i++) {
			int index = 0;
			for (int j = 0; j < nums2.length; j++) {
				if(nums1[i] == nums2[j]){
					index = j;
					break;
				}
			}
			int temp = -1;
			for (int j = index; j < nums2.length; j++) {
				if(nums2[j] > nums1[i]){
					temp = nums2[j];
					break;
				}
			}
			result[i] = temp;
		}
		return result;
	}
}
