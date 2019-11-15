package 二分查找;

/**
 * 注意：二分查找的数组一定是有序的！！！　　
 * 	在有序数组array[]中，不断将数组的中间值（mid）和被查找的值比较，如果被查找的值等于array[mid],就返回下标mid; 
 * 	否则，就将查找范围缩小一半。如果被查找的值小于array[mid], 就继续在左半边查找;如果被查找的值大于array[mid],
 * 	就继续在右半边查找。 直到查找到该值或者查找范围为空时， 查找结束。
 * 
 * 不使用递归实现
 * @author pxs
 *
 */
public class FindTwoPoint {
	public int findTwoPoint(int[] array, int key) {
		int start = 0;
		int last  = array.length -1;
		
		while(start <= last){
			int mid = (last - start) / 2 + start; //防止直接相加造成int范围溢出
			
			if(array[mid] == key){ //查找值等于当前值，返回数组下标
				return mid;
			}
			if(array[mid] < key){//查找值比当前值大
				start = mid +1;
			}
			if(array[mid] > key){//查找值比当前值小
				last = mid -1;
			}
		}
		return -1;
	}
}
