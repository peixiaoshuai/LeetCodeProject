package 解题方法;

/**
 * 定义快慢指针，扫描两次数组。
 * 第一次扫描定位复制结束的位置。首先初始化两个指针为 0，然后根据题意更新两个指针，直到快指针越过数组下标范围。
 * 重置快慢指针位置，从后往前扫描，开始复制。
 * @author pxs
 *
 */
public class Solution1 {
	public void duplicateZeros(int[] arr) {
		int n = arr.length;
		int i = 0, j = 0;
		while (j < n) {
			if (arr[i] == 0) {
				++j;
			}
			++i;
			++j;
		}
		--i;    // i 回到最后一次合法的位置
		--j;    // j 同理，但 j 仍可能等于 n（例如输入 [0]）
		while (i >= 0) {
			if (j < n){
				 arr[j] = arr[i];
			}
			if (arr[i] == 0){
				arr[--j] = arr[i];
			}
			--i;
			--j;
		}
	}
}
