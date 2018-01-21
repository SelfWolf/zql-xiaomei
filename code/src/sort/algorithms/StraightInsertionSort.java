package sort.algorithms;
/**
 * 直接插入排序：将一个新的元素插入到一个有序的数列中的合适位置，从而得到的还是一个有序的数列，
 * 将数据第一个元素看作是有序的，然后将第二个元素与第一个元素比较，如果不满足条件，调换位置，
 * 重复比较直到该元素找到合适的位置，对于后续的元素，重复这个过程，从而遍历所有元素
 * 如果有n个数据需要排序，那么最外层有n-1个数据需要执行插入动作，针对第k(K>1)个元素，需要执行
 * 的比较次数最少为0次，最多为k-1次。所以复杂度为n^2。
 */
import common.util.*;

/**
 * Insert Sort algorithm
 * 将新的数据插入到已经排序好的序列中，从而得到一个新的
 * 有序的数组
 * 复杂度：n^2
 * 默认：升序
 * 稳定性：稳定的算法
 * @author Administrator
 *
 */
public class StraightInsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array1 = Common.getRandArray(10, 100);
		//the original data array
		Common.Out(array1);
		//using the first sort algorithm and compute the used time
		long begintime1 = System.nanoTime();
		Common.Out(InsertSort1(array1));
		long endtime1 = System.nanoTime();
		System.out.println((endtime1 - begintime1)/1000);
		//using the second sort algorithm and compute the used time
		long begintime2 = System.nanoTime();
		Common.Out(InsterSort2(array1));
		long endtime2 = System.nanoTime();
		System.out.println((endtime2 - begintime2) / 1000);
	}

	public static double[] InsertSort1(double[] num){
		int len = num.length;
		for(int i=1;i<len;i++){
			if(num[i]<num[i-1]){
				int j = i-1;
				double x = num[i];
				num[i] = num[i-1];
				while(x<num[j]&&j>=0){
					num[j+1] = num[j];
					j--;
					if(j<0)
						break;
				}
				num[j+1] = x;
			}
		}
		return num;
	}
	/**
	 * 
	 * @param num
	 * @return
	 */
	public static double[] InsterSort2(double[] num){
		int len = num.length;
		for(int i=1;i<len;i++){
			for(int j=i-1;j>=0&&num[j]>num[j+1];j--)
				Common.Swap(num[j],num[j+1]);
		}
		return num;
	}
	
	/**
	 * java自带的Arrays.sort()方法，是经过调整后的快速排序算法，再此不进行比较
	 */
}
