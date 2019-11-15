package 解题方法;
/**
 * 定义快慢指针，扫描两次数组
 * 循环数组，遇到0的时候，将剩下的数据向后移动一位
 * @author pxs
 *
 */
public class Solution {
	public void duplicateZeros(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] == 0){
				int temp = arr[i+1];
				arr[i+1] = 0;
				for (int j = i+2; j < arr.length; j++) {
					int x = arr[j];
					arr[j] = temp;
					temp = x;
				}
				i++; 
			}
		}
	}
}
