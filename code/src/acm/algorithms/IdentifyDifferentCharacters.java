package acm.algorithms;

/*题目描述

请实现一个算法，确定一个字符串的所有字符是否全都不同。这里我们要求不允许使用额外的存储结构。

给定一个string iniString，请返回一个bool值,True代表所有字符全都不同，False代表存在相同的字符。保证字符串中的字符为ASCII字符。字符串的长度小于等于3000。
测试样例：

"aeiou"

返回：True

"BarackObama"

返回：False*/
/**
 * 看到的佩服五体投地的代码！！！！
 * return !iniString.matches(".*(.)(.*\\1).*");
 *
 */

public class IdentifyDifferentCharacters {

	public static void main(String[] args) {
		String iniString = "acbdbesy";
		
		System.out.println(checkDifferent(iniString));
	}
	public static boolean checkDifferent(String iniString) {
		boolean[] c = new boolean[65536];
		for(int i=0;i<iniString.length();i++){
			int v = iniString.charAt(i);
			if(c[v]){
				return false;
			}
			else
				c[v] = true;
		}
		return true;
    }
}
