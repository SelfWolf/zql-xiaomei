package acm.algorithms;
/*��Ŀ����

��ʵ��һ���㷨���ڲ�ʹ�ö������ݽṹ�ʹ���ռ������£���תһ���������ַ���(����ʹ�õ������̱���)��

����һ��string iniString���뷵��һ��string��Ϊ��ת����ַ�������֤�ַ����ĳ���С�ڵ���5000��
����������

"This is nowcoder"

���أ�"redocwon si sihT"*/
/**
 * ��ֱ�ӵ��뷨���������м������Ȼ����β�ַ���һ����
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
