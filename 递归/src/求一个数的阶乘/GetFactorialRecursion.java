package 求一个数的阶乘;

/**
 * 规定：
 * 	①、0！=1
 * 	②、1！=1
 * 	③、负数没有阶乘
 * 利用递归方法解决问题
 * @author pxs
 *
 */
public class GetFactorialRecursion {
	public int getFactorial(int n) {
		if(n >= 0){
			if(n == 0){
				System.err.println(n+"!=1");
				return 1;
			}else{
				System.err.println(n);
				int temp = n * getFactorial(n-1);
				System.err.println(n+"!="+temp);
				return temp;
			}
		}else{
			return -1;
		}
	}
}
