package 解题方法;

import java.util.Arrays;
/**
 * 使用双指针，从头部插入arr1存在于arr2中的数据，在尾部插入不存在的数据。最后将尾部插入的数据进行排序
 * @author Simon.Hoo
 *
 */
public class Solution {
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length];
		int m = 0;
		int n = arr1.length-1;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if(arr2[i] == arr1[j]){
					result[m] = arr2[i];
					m++;
					continue;
				}
			}
		}
		Arrays.sort(arr2);
		for (int j = 0; j < arr1.length; j++) {
			if(Arrays.binarySearch(arr2, arr1[j]) < 0){
				result[n] = arr1[j];
				n--;
			}
		}
		Arrays.sort(result, m, arr1.length);
		return result;
	}
}
