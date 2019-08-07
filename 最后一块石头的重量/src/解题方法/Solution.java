package 解题方法;

import java.util.Arrays;


/**
 * java的排序是从小到大的，所以就是取最后两位，而只需要执行 数组长度-1 次，就必定会剩下 0和所求的值
 * @author pxs
 *
 */
public class Solution {
	public int lastStoneWeight(int[] stones) {
		int weight = 0;
		for(int i=0;i<stones.length-1;i++){
			Arrays.sort(stones);
			weight = stones[stones.length-1] - stones[stones.length-2];
			stones[stones.length-2] = 0;
			stones[stones.length-1] = weight;
		}
		return stones[stones.length-1];
	}
}
