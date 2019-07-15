package 解题方法;

import java.util.ArrayList;
import java.util.List;

/**
 * 解法2：
 * 	这种解法是第一种解法的延伸解法，如果该题的条件不止这三个，则使用解法1，需要重复判断的条件会随着增加，
 * 	利用字符串拼接方法，可以有效降低判断条件
 * @author Simon.Hoo
 *
 */
public class Solution2 {
	public List<String> fizzBuzz(int n) {
		List<String> result = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			String temp = "";
			boolean divisibleBy3 = (i % 3 == 0);
			boolean divisibleBy5 = (i % 5 == 0);
			if(divisibleBy3){
				temp += "Fizz";
			}
			if(divisibleBy5){
				temp += "Buzz";
			}
			if(temp.equals("")){
				temp += i+"";
			}
			result.add(temp);
		}
		return result;
	}
}
