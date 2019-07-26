package 解题方法;


/**
 * 让我们尝试不断调整 S，即每一步操作之后整个数组的偶数和。
 * 我们操作数组中的某一个元素 A[index] 的时候，数组 A 其他位置的元素都应保持不变。如果 A[index] 是偶数，我们就从 S 中减去它，
 * 然后计算 A[index] + val 对 S 的影响（如果是偶数则在 S 中加上它）。
 * @author pxs
 *
 */
public class Solution2 {
	public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
		int S = 0;
	    for (int x: A)
	        if (x % 2 == 0)
	            S += x;

	    int[] ans = new int[queries.length];

	    for (int i = 0; i < queries.length; ++i) {
	        int val = queries[i][0], index = queries[i][1];
	        if (A[index] % 2 == 0) S -= A[index];
	        A[index] += val;
	        if (A[index] % 2 == 0) S += A[index];
	        ans[i] = S;
	    }

	    return ans;
	}
}
