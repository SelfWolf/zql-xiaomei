package acm.algorithms;


/*���дһ���������ҳ����������������Ǹ��������ǲ���ʹ��if-else�ȱȽϺ��ж��������

��������int a��b���뷵�ؽϴ��һ��������������ͬ�򷵻�����һ����
����������

1��2

���أ�2*/


public class NoMax {
	public int getMax(int a, int b) {
        return (a+b+Math.abs(a-b))/2;
        // write code here
    }
}
