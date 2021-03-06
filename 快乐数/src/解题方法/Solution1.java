package 解题方法;
/**
 * 递归方式
 * 1-9中只有1和7是“快乐数”，其他均不是“快乐数”，
 * 故若当前的n等于1或7，则直接返回true;否则，若n < 10，且不等于1或7，则直接返回false。
 * 若程序仍未结束，则计算其每个位置上的数字的平方和sum，并对其递归执行上述过程。
 * (本题要求的参数为正整数，如果递归层次较深，会直接导致调用栈崩溃。所以不建议使用递归)
 * @author pxs
 *
 */
public class Solution1 {
	public boolean isHappy(int n ) {
		if(n == 1 || n == 7){
			return true;
		}
		if(n < 10){
			return false;
		}
		int sum = 0;
		while( n != 0){
			sum += (n % 10) * (n % 10); 
			n = n / 10;
		}
		
		return isHappy(sum);
	}
}
