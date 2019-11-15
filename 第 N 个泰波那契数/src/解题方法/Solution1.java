package 解题方法;

/**
 * 方法1优化，取消利用数组来存储数据，循环计算n位的泰波那契数，并且更新前三位的数值
 * @author Simon.Hoo
 *
 */
public class Solution1 {
	public int tribonacci(int n) {
		if(n == 0){
			return 0;
		}
		if(n == 1 || n == 2){
			return 1;
		}
		int T1 = 0;
		int T2 = 1;
		int T3 = 1;
		for (int i = 4; i <= n+1; i++) {
			int Tn = T1+T2+T3;
			T1 = T2;
			T2 = T3;
			T3 = Tn;
		}
		return T3;
	}
}
