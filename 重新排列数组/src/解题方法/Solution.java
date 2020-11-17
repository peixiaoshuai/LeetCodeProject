package 解题方法;

public class Solution {
    public int[] shuffle(int[] nums, int n) {
        //将数据nums分成两个数组
        int[] nums1 = new int[n];
        int[] nums2 = new int[n];
        for (int i = 0; i < n; i ++){
            nums1[i] = nums[i];
        }
        for (int i = n; i < nums.length; i ++){
            nums2[i-n] = nums[i];
        }
        //将数据nums1与nums2交叉插入到返回结果中
        int[] result = new int[nums.length];
        int s = 0;
        for(int i = 0; i < n; i ++){
            result[s] = nums1[i];
            result[s+1] = nums2[i];
            s = s+2;
        }
        return  result;
    }
}
