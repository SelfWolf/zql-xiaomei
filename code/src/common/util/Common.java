package common.util;

import java.text.NumberFormat;

public class Common {
	static NumberFormat ddf1=NumberFormat.getNumberInstance();
	
	/**
	 * exchange the value of two numbers
	 * @param a
	 * @param b
	 */
	public static void Swap(double a,double b){
		double tmp = a;
		a = b;
		b = tmp;
	}
	
	/**
	 * generate a random array within 0-max.
	 * @param num
	 * @param max
	 * @return
	 */
	public static double[] getRandArray(int num,double max){
		double[] array = new double[num];
		ddf1.setMaximumFractionDigits(2);
		if(max<0)
			max = 10;
		for(int i=0;i<num;i++)
			array[i] = (Double.parseDouble(ddf1.format(Math.random()*max)));
		return array;
	}
	
	public static void Out(double[] res){
		int len = res.length;
		System.out.println("**************************************");
		for(int i=0;i<len;i++)
			System.out.print(res[i]+"\t");
		System.out.println();
		System.out.println("--------------------------------------");
	}
}
