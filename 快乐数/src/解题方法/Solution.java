package 解题方法;

import java.util.HashSet;
import java.util.Set;
/**
 * 首先定义一个Set集合，用来存放计算后的平方和m，如果m在Set中已存在，即进入了死循环，则退出；
 * 如果m不存在Set，则将m放入Set；
 * 直至找到平方和为1或者进入死循环就退出。
 * （此题不建议用集合记录每次的计算结果来判断是否进入循环，因为这个集合可能大到无法存储）
 * @author pxs
 *
 */
public class Solution {
	public boolean isHappy(int n) {
		Set<Integer> set = new HashSet<Integer>();
		int squareSum = 0;
		while(true){
			while(n != 0){
				squareSum += (n % 10) * (n % 10); 
				n = n / 10;
			}
			if(squareSum == 1){
				return true;
			}
			if(set.contains(squareSum)){
				return false;
			}else{
				set.add(squareSum);
				n = squareSum;
				squareSum = 0;
			}
			
		}
	}
}
