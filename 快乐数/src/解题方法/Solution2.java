package 解题方法;

/**
 * 使用“快慢指针”思想找出循环：
 * “快指针”每次走两步，“慢指针”每次走一步，当二者相等时，即为一个循环周期。
 * 此时，判断是不是因为1引起的循环，是的话就是快乐数，否则不是快乐数
 * @author pxs
 *
 */
public class Solution2 {
	public boolean isHappy(int n) {
		int slow = n;
		int fast = n;
		do {
			slow = bitSquareSum(slow);
			fast = bitSquareSum(fast);
			fast = bitSquareSum(fast);
		} while (slow != fast);
		
		return slow == 1;
	}
	
	int bitSquareSum(int n){
		int sum = 0;
		while(n != 0){
			sum += (n % 10) * (n % 10);
			n = n /10;
		}
		return sum;
	}
}
