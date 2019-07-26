package 解题方法;


/**
 * 可以用动态规划的方法，先求出answer[0]，然后当i >= 1时，且A[index]已经改变：
 * 1.A[index]为偶数，queries[i][0]为偶数：answer[i] = answer[i-1] + queries[i][0]
 * 2.A[index]为偶数，queries[i][0]为奇数：answer[i] = answer[i-1] + A[index]
 * 3.A[index]为奇数，queries[i][0]为偶数：answer[i] = answer[i-1]
 * 4.A[index]为奇数，queries[i][0]为奇数：answer[i] = answer[i-1] - A[index] + queries[i][0]
 * @author pxs
 *
 */
public class Solution {
	public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
		int s = 0;
		for (int is : A) {
			if(is % 2 == 0){
				s += is;
			}
		}
		int[] result = new int[A.length];
		for (int i = 0; i < queries.length; i++) {
			int val = queries[i][0], index = queries[i][1];
			if(A[index] % 2 != 0 && (A[index]+val) % 2 == 0){
				s += (A[index]+val);
				A[index] = A[index]+val;
			}else if(A[index] % 2 == 0 && (A[index]+val) % 2 != 0){
				s -= A[index];
				A[index] = A[index]+val;
			}else if(A[index] % 2 == 0 && (A[index]+val) % 2 == 0){
				s += val;
				A[index] = A[index]+val;
			}else{
				A[index] = A[index]+val;
			}
			result[i] = s;
		}
		return result;
		
	}
}
