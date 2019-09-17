package 解题方法;
/**
 * 缓存
 * 方法二的优化，方法二中利用哈希表存储任意范围的可能性，空间使用率过高。
 * 使用数组存储当前0~0 0~1 0~2 0~3 .... 0~n 的和sum，求取num[i.+.j] == sum[j] - sum[i -1]
 * @author pxs
 *
 */
public class NumArray3 {
	private int[] sums;
	
	public NumArray3(int[] nums) {
		sums = new int[nums.length];
		int sum = 0;
	    for (int i = 0; i < nums.length; i++) {
	    	sum += nums[i];
	    	sums[i] = sum;
		}
	}
	public int sumRange(int i, int j) {
		if(i == 0){
			return sums[j];
		}else{
			return sums[j] - sums[i-1];
		}
	}
}
