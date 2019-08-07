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
	public List<Integer> getRow(int rowIndex) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 1; i <= rowIndex+1; i++) {
			List<Integer> temp = new ArrayList<Integer>();
			if(i == 1){
				temp.add(1);
				result = temp;
			}else if(i == 2){
				temp.add(1);
				temp.add(1);
				result = temp;
			}else{
				for (int j = 0; j < i; j++) {
					if(j == i-1){
						temp.add(1);
					}else if(j == 0){
						temp.add(1);
					}else{
						temp.add(result.get(j) + result.get(j-1));
					}
				}
				result = temp;
			}
		}
		return result;
	}
}
