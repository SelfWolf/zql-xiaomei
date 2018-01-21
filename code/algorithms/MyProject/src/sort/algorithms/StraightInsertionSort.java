package sort.algorithms;
/**
 * ֱ�Ӳ������򣺽�һ���µ�Ԫ�ز��뵽һ������������еĺ���λ�ã��Ӷ��õ��Ļ���һ����������У�
 * �����ݵ�һ��Ԫ�ؿ���������ģ�Ȼ�󽫵ڶ���Ԫ�����һ��Ԫ�رȽϣ��������������������λ�ã�
 * �ظ��Ƚ�ֱ����Ԫ���ҵ����ʵ�λ�ã����ں�����Ԫ�أ��ظ�������̣��Ӷ���������Ԫ��
 * �����n��������Ҫ������ô�������n-1��������Ҫִ�в��붯������Ե�k(K>1)��Ԫ�أ���Ҫִ��
 * �ıȽϴ�������Ϊ0�Σ����Ϊk-1�Ρ����Ը��Ӷ�Ϊn^2��
 */
import common.util.*;

/**
 * Insert Sort algorithm
 * ���µ����ݲ��뵽�Ѿ�����õ������У��Ӷ��õ�һ���µ�
 * ���������
 * ���Ӷȣ�n^2
 * Ĭ�ϣ�����
 * �ȶ��ԣ��ȶ����㷨
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
	 * java�Դ���Arrays.sort()�������Ǿ���������Ŀ��������㷨���ٴ˲����бȽ�
	 */
}
