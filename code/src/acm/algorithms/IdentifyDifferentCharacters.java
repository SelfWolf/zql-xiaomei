package acm.algorithms;

/*��Ŀ����

��ʵ��һ���㷨��ȷ��һ���ַ����������ַ��Ƿ�ȫ����ͬ����������Ҫ������ʹ�ö���Ĵ洢�ṹ��

����һ��string iniString���뷵��һ��boolֵ,True���������ַ�ȫ����ͬ��False���������ͬ���ַ�����֤�ַ����е��ַ�ΪASCII�ַ����ַ����ĳ���С�ڵ���3000��
����������

"aeiou"

���أ�True

"BarackObama"

���أ�False*/
/**
 * �������������Ͷ�صĴ��룡������
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
