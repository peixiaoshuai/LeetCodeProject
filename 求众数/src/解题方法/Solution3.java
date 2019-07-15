package 解题方法;

/**
 * 投票法：我们将众数+1，其他数-1，显然结果是大于0的。从结果本身我们可以看出众数比其他数多。
 * @author Simon.Hoo
 *
 */
public class Solution3 {
	public int majorityElement(int[] nums) {
		int count = 0;
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			if(count == 0){
				temp = nums[i];
			}
			count += (temp == nums[i]) ? 1 : -1; 
		}
		return temp;
	}
}
