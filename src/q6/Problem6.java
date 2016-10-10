package q6;
/*
 * 1���� 10���� �ڿ����� ���� ������ ���ϸ� ������ ����(������ ��)
 *  1^2 + 2^2 + 3^2 + ..... + 10^2 = 385
 * 1���� 10�� ���� ���� ������ �� ����� �����ϸ� ������ �����ϴ�(���� ����)
 *  (1 + 2 + 3 + ... + 10)^2 = 3025
 *  ���� 1���� 10���� �ڿ����� ���� "���� ����"�� "������ ��"�� ���̴�  3025-385 = 2640 �� �˴ϴ�.
 *  �׷��� 1���� 100���� �ڿ����� ���� "���� ����"�� "������ ��"�� ���̴� ���Դϱ�? 
 * */
public class Problem6 {
	public static void main(String[] args){
		
		int squareOfSum = 0; //���� ����	
		int sumOfSquare = 0; //������ ��
		
		for(int i = 1; i <= 100; i++){
			squareOfSum+=i;
			sumOfSquare+=(i*i);
		}
		
		squareOfSum *= squareOfSum;
		
		int abs = Math.abs(squareOfSum-sumOfSquare);
		
		System.out.println("'���� ����' : " + squareOfSum);
		System.out.println("'������ ��' : " + sumOfSquare);
		System.out.println("'���� ����'�� '������ ��'�� ���� : " + abs);
	}
}
