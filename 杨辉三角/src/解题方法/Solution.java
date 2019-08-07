package 解题方法;

import java.util.ArrayList;
import java.util.List;

/**
 * 暴力解法
 * 了解杨辉三角的规则，则可简单算出每一行的数据
 * @author pxs
 *
 */
public class Solution {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		//校验
		if(numRows == 0){
			return result;
		}
		List<Integer> one = new ArrayList<Integer>();
		one.add(1);
		result.add(one);
		for (int i = 2; i <= numRows; i++) {
			List<Integer> temp = new ArrayList<Integer>();
			if(i == 2){
				temp.add(1);
				temp.add(1);
				result.add(temp);
				one = temp;
			}else{
				for (int j = 0; j < i; j++) {
					if(j == i-1){
						temp.add(1);
					}else if(j == 0){
						temp.add(1);
					}else{
						temp.add(one.get(j) + one.get(j-1));
					}
				}
				result.add(temp);
				one = temp;
			}

		}
		return result;
	}
}
