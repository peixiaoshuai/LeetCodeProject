package 解题方法;


import java.util.Arrays;

public class Solution {
	public static int[] numberOfLines(int[] widths, String S) {
		char [] cs = S.toCharArray();
		int index = 0;//行数
		int units = 0;//最后一行输入的单位
		for (int i = 0; i < cs.length; i++) {
			//若当前单位大于100，或者当前行剩余的单位不够书写当前字母，则另起一行
			if(units >= 100 || (100-units < widths[cs[i] - 'a'] )){
				index++;
				units = 0;
				units += widths[cs[i] - 'a'];
			}else{
				units += widths[cs[i] - 'a'];
			}
		}
		int[] reust = new int[2];
		//最后书写的字符，也需要记录一行
		if(units == 0){
			reust[0] = index;
		}else{
			reust[0] = index + 1;
		}
		reust[1] = units;
		return reust;
	}
	public static void main(String[] args) {
		int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		String S = "abcdefghijklmnopqrstuvwxyz";
		int[] result =  numberOfLines(widths,S);
		
		System.err.println(Arrays.toString(result));
		
	}
}
