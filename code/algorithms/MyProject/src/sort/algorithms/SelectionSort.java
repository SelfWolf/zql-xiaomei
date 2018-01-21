package sort.algorithms;

import common.util.Common;

/**
 * 每次选择最值元素，将其放在头(尾)的位置
 * 以升序排序为例
 * 复杂度：n^2
 * @author Administrator
 *
 */
public class SelectionSort {
	
	/**
	 * 每次选择最大的元素，将其放在队尾的位置
	 * @param arr
	 */
	public double[] selectsort(double[] arr){
		int len = arr.length;
		for(int i=0;i<len-1;i++){
			int k = i;
			for(int j=i+1;j<len;j++)
				if(arr[i]<arr[k])
					k = j;
			if(i!=k)
				Common.Swap(arr[i], arr[k]);
		}
		return arr;
	}
	
	/**
	 * 优化的选择排序算法，从两端进行选择
	 * 
	 * @param r
	 * @return
	 */
	public double[] OptimizeSelectSort(double[]r){
		int i,j,n=r.length,min = 0, max = 0;
		double  tmp;
		for(i=0;i<n/2;i++){
			min = i;
			max = i;
			for(j=i+1;j<n-1;j++){
				if(r[j]>r[max]){
					max = j;continue;
				}
				if(r[j]<r[min])
					min = j;
			}
		}
		tmp = r[i-1];r[i-1] = r[min];r[min] = tmp;
		tmp = r[n-i]; r[n-i] = r[max]; r[max] = tmp; 
		return r;
	}
}
