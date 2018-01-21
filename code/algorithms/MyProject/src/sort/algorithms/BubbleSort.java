package sort.algorithms;

import common.util.Common;

/**
 * 冒泡排序，两两比较，交换位置
 * 以升序排序为例
 * 复杂度:n^2
 * @author Administrator
 */
public class BubbleSort {
	
	/**
	 * @param arr
	 */
	public double[] bubblesort(double[] arr){
		int len = arr.length;
		for(int i=0;i<len;i++)
			for(int j=0;j<len;j++)
				if(arr[i]>arr[j])
					Common.Swap(arr[i], arr[j]);
		return arr;
	}
}
