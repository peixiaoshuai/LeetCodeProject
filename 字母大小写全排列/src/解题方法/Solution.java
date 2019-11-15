package 解题方法;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author pxs
 *
 */
public class Solution {
	public List<String> letterCasePermutation(String S) {
		List<String> result = new ArrayList<String>();
		for (Character ch : S.toCharArray()) {
			if(ch>='0' && ch<='9'){
				continue;
			}else if(ch>='A' && ch<='Z'){
				String res = S.replaceFirst(ch.toString(),(ch.toString()).toLowerCase());
				result.add(res);
			}else if(ch>='a' && ch<='z'){
				String res = S.replaceFirst(ch.toString(),(ch.toString()).toUpperCase());
				result.add(res);
			}
		}
		if(!result.contains(S.toLowerCase())){
			result.add(S.toLowerCase());
		}
		if(!result.contains(S.toUpperCase())){
			result.add(S.toUpperCase());
		}
		
		return result;
	}
}
