package acm.algorithms;
/*题目描述

请实现一个算法，在不使用额外数据结构和储存空间的情况下，翻转一个给定的字符串(可以使用单个过程变量)。

给定一个string iniString，请返回一个string，为翻转后的字符串。保证字符串的长度小于等于5000。
测试样例：

"This is nowcoder"

返回："redocwon si sihT"*/
/**
 * 最直接的想法就是设置中间变量，然后将首尾字符逐一交换
 * @author Administrator
 *
 */

public class StringInversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is nowcoder";
		System.out.println(reverseString(s));
	}

	public static String reverseString(String iniString) {
		StringBuilder sb = new StringBuilder(iniString);
		return sb.reverse().toString();
    }
}
