package 解题方法;

/**
 * 暴力解法，注意判断接下来的字符与之前的字符组成是否为代表特殊数字的组合
 * @author pxs
 *
 */
public class Solution {
	public int romanToInt(String s) {
		char[] cs = s.toCharArray();
		int result = 0;
		for (int i = 0; i < cs.length; i++) {
			if(i == 0){
				result += getNumber(cs[i]);
			}else{
				if(cs[i-1] == 'I' && cs[i] == 'V'){
					result -= getNumber(cs[i-1]);
					result += 4;
				}else if(cs[i-1] == 'I' && cs[i] == 'X'){
					result -= getNumber(cs[i-1]);
					result += 9;
				}else if(cs[i-1] == 'X' && cs[i] == 'L'){
					result -= getNumber(cs[i-1]);
					result += 40;
				}else if(cs[i-1] == 'X' && cs[i] == 'C'){
					result -= getNumber(cs[i-1]);
					result += 90;
				}else if(cs[i-1] == 'C' && cs[i] == 'D'){
					result -= getNumber(cs[i-1]);
					result += 400;
				}else if(cs[i-1] == 'C' && cs[i] == 'M'){
					result -= getNumber(cs[i-1]);
					result += 900;
				}else {
					result += getNumber(cs[i]);
				}
			}
		}
		return result;
	}
	public int getNumber(char c) {
		int result = 0;
		switch (c) {
		case 'I':
			result = 1;
			break;
		case 'V':
			result = 5;
			break;
		case 'X':
			result = 10;
			break;
		case 'L':
			result = 50;
			break;
		case 'C':
			result = 100;
			break;
		case 'D':
			result = 500;
			break;
		case 'M':
			result = 1000;
			break;
		default:
			break;
		}
		return result;
	}
}
