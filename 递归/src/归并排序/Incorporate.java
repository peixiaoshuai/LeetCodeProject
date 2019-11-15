package 归并排序;

/**
 * 归并算法的中心是归并两个已经有序的数组。归并两个有序数组A和B，就生成了第三个有序数组C。数组C包含数组A和B的所有数据项。
 * 非递归实现
 * 该方法有三个while循环，第一个while比较数组a和数组b的元素，并将较小的赋值到数组c；
 * 第二个while循环当a数组所有元素都已经赋值到c数组之后，而b数组还有元素，那么直接把b数组剩余的元素赋值到c数组；
 * 第三个while循环则是b数组所有元素都已经赋值到c数组了，而a数组还有剩余元素，那么直接把a数组剩余的元素全部赋值到c数组。
 * @author pxs
 *
 */
public class Incorporate {
	public int[] sort(int[] a,int[] b) {
		int[] c = new int[a.length+b.length];
		int aNum = 0,bNum = 0,cNum=0;
		while(aNum < a.length && bNum < b.length){
			if(a[aNum] >= b[bNum]){//比较a数组和b数组的元素，谁更小将谁赋值到c数组
				c[cNum++] = b[bNum++];
			}else{
				c[cNum++] = a[aNum++];
			}
		}
		//如果a数组全部赋值到c数组了，但是b数组还有元素，则将b数组剩余元素按顺序全部复制到c数
		while(aNum == a.length && bNum < b.length){
			c[cNum++] = b[bNum++];
		}
		//如果b数组全部赋值到c数组了，但是a数组还有元素，则将a数组剩余元素按顺序全部复制到c数组
		while(bNum == b.length && aNum < a.length){
			c[cNum++] = a[aNum++];
		}
		return c;
	}
}
