package 解题方法;

import java.util.HashMap;
/**
 * 方法3优化，利用循环代替栈遍历，这样耗时最小，内存使用相差不多
 * @author Simon.Hoo
 *
 */
public class Solution2 {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int[] result=new int[nums1.length];
		for (int i=0;i<nums2.length-1;i++){
			int k=i+1;
			while(k<nums2.length){
				if (nums2[i]<nums2[k]){
					hm.put(nums2[i],nums2[k]);
					k=nums2.length;
				}else{
					k++;
				} 
			}

		}
		for (int j=0;j<nums1.length;j++){
			if(hm.containsKey(nums1[j])){
				result[j] = hm.get(nums1[j]); 
			}else{
				result[j] = -1;
			}
		}
		return result;
	}
}
