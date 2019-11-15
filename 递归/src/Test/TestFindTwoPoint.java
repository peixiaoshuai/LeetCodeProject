package Test;

import 二分查找.FindTwoPoint;
/**
 * 非递归实现二分查找
 * @author pxs
 *
 */
public class TestFindTwoPoint {
	public static void main(String[] args) {
		FindTwoPoint findTwoPoint = new FindTwoPoint();
		
		int[] array = {1,2,3,4,5,6};
		
		int key = 3;
		
		int result = findTwoPoint.findTwoPoint(array, key);
		
		System.err.println(result);
	}
}
