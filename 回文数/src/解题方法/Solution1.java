package 解题方法;
/**
 * 通过取整和取余操作获取整数中对应的数字进行比较。
 * 举个例子：1221 这个数字。
 * 	通过计算 1221 / 1000， 得首位1
 * 	通过计算 1221 % 10， 可得末位 1
 * 	进行比较
 * 	再将 22 取出来继续比较
 * @author pxs
 *
 */
public class Solution1 {
	public boolean isPalindrome(int x) {
		if(x < 0 || (x % 10 == 0 && x != 0)){
			return false;
		}
		//计算X的位数
		int len = (x+"").length();
		int digit = 1;
		for (int i = 1; i < len; i++) {
			digit *= 10;
		}
		while(x > 0){
			int a = x / digit;
			int b = x % 10;
			
			if(a != b ){
				return false;
			}
			x = (x % digit) / 10 ;
			digit /= 100;
		}
		return true;
	}
}
