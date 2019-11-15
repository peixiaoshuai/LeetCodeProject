package 求一个数的阶乘;

/**
 * 规定：
 * 	①、0！=1
 * 	②、1！=1
 * 	③、负数没有阶乘
 * 利用for循环解决该问题
 * @author pxs
 *
 */
public class GetFactorial {
	public int getFactorialFor(int n) {
		int temp = 1;
		if(n >= 0){
			for (int i = 1; i <= n; i++) {
				temp = temp * i;
			}
			return temp;
		}else{
			return -1;
		}
	}
}
