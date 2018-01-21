package sort.algorithms;

import common.util.Common;

/**
 * ÿ��ѡ����ֵԪ�أ��������ͷ(β)��λ��
 * ����������Ϊ��
 * ���Ӷȣ�n^2
 * @author Administrator
 *
 */
public class SelectionSort {
	
	/**
	 * ÿ��ѡ������Ԫ�أ�������ڶ�β��λ��
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
	 * �Ż���ѡ�������㷨�������˽���ѡ��
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
