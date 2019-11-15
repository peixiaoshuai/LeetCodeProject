package 解题方法;

/**
 * 题目要求最好不要将整数转化成字符串处理  所以应该忽略整数转字符串的暴力解法
 * 直观上来看待回文数的话，就感觉像是将数字进行对折后看能否一一对应。所以这个解法的操作就是 取出后半段数字进行翻转。
 * 这里需要注意的一个点就是由于回文数的位数可奇可偶，所以当它的长度是偶数时，它对折过来应该是相等的；当它的长度是奇数时，
 * 那么它对折过来后，有一个的长度需要去掉一位数（除以 10 并取整）。
 * 具体做法如下：
 * 	每次进行取余操作 （ %10），取出最低的数字：y = x % 10
 * 	将最低的数字加到取出数的末尾：revertNum = revertNum * 10 + y
 *	每取一个最低位数字，x 都要自除以 10
 *	判断 x 是不是小于 revertNum ，当它小于的时候，说明数字已经对半或者过半了
 *	最后，判断奇偶数情况：如果是偶数的话，revertNum 和 x 相等；如果是奇数的话，最中间的数字就在revertNum 的最低位上，将它除以 10 以后应该和 x 相等。

 * @author pxs
 *
 */
public class Solution {
	public boolean isPalindrome(int x) {
		if(x < 0 || (x % 10 == 0 && x != 0)){
			return false;
		}
		int reversalNum = 0;
		while(x > reversalNum){
			reversalNum = reversalNum *10 + x % 10;
			x = x /10;
		}
		
		if(reversalNum == x  || x == (reversalNum /10)){
			return true;
		}else{
			return false;
		}
		
	}
}
