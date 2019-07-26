package 解题方法;
/**
 * 字符串替代法
 * 注意:在循环中，使用t.replaceFirst(c.toString(), "");最后返回的t还是原来的值，类似：
 * 	代码一：
		String str = new String("AND AAE112");
		str.replaceFirst("AND","");
		System.out.println(str);
	输出：
		AND AAE112
	代码二：
		String str = new String("AND AAE112");
		String out = str.replaceFirst("AND","");
		System.out.println(out);
	输出：
	 	AAE112
	可以看出，代码二的结果是正确的，可见replaceFirst并不会改变原有的str，这和PB和PL/SQL是不同的。原因应该是str指向的是一个地址。
 * @author pxs
 *
 */
public class Solution3 {
	public char findTheDifference(String s, String t) {
		for (Character c : s.toCharArray()) {
			t = t.replaceFirst(c.toString(), "");
		}
		return t.toCharArray()[0];
	}
}
