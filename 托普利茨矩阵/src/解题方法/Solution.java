package 解题方法;

/**
 * 两行两行的对比，每行的第i个数跟下一行的第i+1个数比较
 * @author Simon.Hoo
 *
 */
public class Solution {
	public boolean isToeplitzMatrix(int[][] matrix) {
		boolean result = true;
		for (int i = 0; i < matrix.length-1; i++) {
			for (int j = 0; j < matrix[0].length-1; j++) {
				if(matrix[i][j] != matrix[i+1][j+1]){
					result = false;
					break;
				}
			}
			if(!result){
				break;
			}
		}
		return result;
	}
}
