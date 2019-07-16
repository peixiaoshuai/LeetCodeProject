package 解题方法;

/**
 * 利用java toBinaryString方法获取整数的二进制格式，
 * 转换成char数组，每一位之后一位对比。获取最终结果
 * @author Simon.Hoo
 *
 */
public class Solution {
	public boolean hasAlternatingBits(int n) {
		char[] cn = Integer.toBinaryString(n).toCharArray();
		for (int i = 0; i < cn.length-1; i++) {
			if(cn[i] == cn[i+1]){
				return false;
			}
		}
		return true;
	}
}
