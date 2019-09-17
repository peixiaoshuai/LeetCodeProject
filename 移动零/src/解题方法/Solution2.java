package 解题方法;
/**
 * 所谓要把0移动到数组后面，其实就是把非0数给移动到数组前面，而每个非0数需要移动的步数其实就是这个非0数前面0的个数。
 * @author pxs
 *
 */
public class Solution2 {
	public void moveZeroes(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 0){
				count++;
			}else{
				int temp = nums[i];
				nums[i] = nums[i-count];
				nums[i-count] = temp;
			}
		}
	}
}
