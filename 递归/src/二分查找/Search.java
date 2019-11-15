package 二分查找;
/**
 * 注意：二分查找的数组一定是有序的！！！　　
 * 	在有序数组array[]中，不断将数组的中间值（mid）和被查找的值比较，如果被查找的值等于array[mid],就返回下标mid; 
 * 	否则，就将查找范围缩小一半。如果被查找的值小于array[mid], 就继续在左半边查找;如果被查找的值大于array[mid],
 * 	就继续在右半边查找。 直到查找到该值或者查找范围为空时， 查找结束。
 * 
 * 使用递归实现
 * 边界条件是找到当前值，或者查找范围为空。否则每一次查找都将范围缩小一半。
 * @author pxs
 *
 */
public class Search {
	public int search(int[] array,int key,int start,int last) {
		int mid = (last - start) / 2 + start;
		
		if(array[mid] == key){//查找值等于当前值，返回数组下标
			return mid;
		}else if(start > last){//找不到查找值，返回-1
			return -1;
		}else{
			if(key < array[mid]){
				return search(array,key,start,mid-1);
			}
			if(key > array[mid]){
				return search(array,key,mid+1,last);
			}
		}
		return -1;
	}
}
