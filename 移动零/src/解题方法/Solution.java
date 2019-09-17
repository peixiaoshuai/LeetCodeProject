package 解题方法;
/**
 * 双指针
 * 可以先把所有非0的元素移到前面，然后将后面的位置补0。
 * 使用指针i，指向需要插入的下标，使用指针j指向遍历的下标。
 * 遍历一遍，如果j指向的位置为0，则i不变，j++后移；如果j指向的位置不为0，则将j位置的元素值赋值到i位置，然后i++。
 * @author pxs
 *
 */
public class Solution {
	public void moveZeroes(int[] nums) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if(nums[j] != 0){
				nums[i] = nums[j];
				i++;
			}
		}
		for (int j = i; j < nums.length; j++) {
			nums[j] = 0;
		}
	}
	
}
