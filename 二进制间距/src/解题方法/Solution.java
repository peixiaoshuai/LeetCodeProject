package 解题方法;

import java.util.ArrayList;
import java.util.List;

/**
 * 利用java toBinaryString方法获取整数的二进制格式，
 * 转换成char数组，每一位之后一位对比。获取最终结果
 * @author Simon.Hoo
 *
 */
public class Solution {
	public int binaryGap(int N) {
		String ns = Integer.toBinaryString(N);
		
		int index = ns.indexOf("1");
		int result = 0; 
		char[] cns = ns.toCharArray();
		
		for (int i = index+1; i < cns.length; i++) {
			if(cns[i] == '1'){
				int temp = i - index;
				if(temp > result){
					result = temp;
				}
				index = i;
			}
		}
		return result;
	}
}
