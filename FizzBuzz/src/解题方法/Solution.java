package 解题方法;

import java.util.ArrayList;
import java.util.List;
/**
 * 解法一：
 * 	初始化一个空的答案列表。
	遍历 1 ... N1...N。
	对于每个数，判断它能不能同时被 3 和 5 整除，如果可以就把 FizzBuzz 加入答案列表。
	如果不行，判断它能不能被 3 整除，如果可以，把 Fizz 加入答案列表。
	如果还是不行，判断它能不能被 5 整除，如果可以，把 Buzz 加入答案列表。
	如果以上都不行，把这个数加入答案列表。
 * @author Simon.Hoo
 *
 */
public class Solution {
	public List<String> fizzBuzz(int n) {
		List<String> result = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			if(i % 3 != 0 && i % 5 != 0 ){
				result.add(i+"");
			}else if(i % 3 == 0 && i % 5 != 0){
				result.add("Fizz");
			}else if(i % 3 != 0 && i % 5 == 0){
				result.add("Buzz");
			}else{
				result.add("FizzBuzz");
			}
		}
		return result;
	}
}
