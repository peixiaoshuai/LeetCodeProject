package Test;

import 解题方法.Solution;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        int[] result = solution.shuffle(nums,n);

        System.out.println(Arrays.toString(result));
    }
}
