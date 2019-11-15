package Test;

import java.util.Arrays;

import 归并排序.Incorporate;

public class IncorporateTest {
	public static void main(String[] args) {
		Incorporate incorporate = new Incorporate();
		
		int[] a = {1,2,3,4,5};
		
		int[] b = {4,5,6,7,8,9};
		
		int[] c = incorporate.sort(a, b);
		
		System.err.println(Arrays.toString(c));
	}
}
