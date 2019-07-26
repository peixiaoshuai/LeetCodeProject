package 解题方法;


/**
 * 暴力解法，但是会超过LeetCode时间限制，不可取
 * @author pxs
 *
 */
public class Solution3 {
	public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
		int[] result = new int[A.length];
		for (int i = 0; i < queries.length; i++) {
			A[queries[i][1]] = A[queries[i][1]] + queries[i][0];
			int sum = getSum(A);
			result[i] = sum;
		}
		return result;
	}
	public int getSum(int[] A) {
		int result = 0;
		for (int i = 0; i < A.length; i++) {
			if(A[i] % 2 == 0){
				result += A[i];
			}
		}
		return result;
	}
}
