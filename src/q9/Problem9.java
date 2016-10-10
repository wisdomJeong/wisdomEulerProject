package q9;
/* 
 * �� �ڿ��� a, b, c �� ��Ÿ��� ���� a^2 + b^2 = c^2 �� �����ϸ� ��Ÿ��� ����� �θ��ϴ�. (���⼭ a<b<c)
 * ���� ��� 3^2 + 4^2 = 9 + 16 = 25 = 5^2 �̹Ƿ� 3,4,5�� ��Ÿ��� �� �Դϴ�.
 * a + b + c = 1000�� ��Ÿ��� �� a, b, c�� �Ѱ��� ���Դϴ�. �̶��� a * b* c �� ���Դϱ�
*/
public class Problem9 {
	public static void main(String[] args){
		int multiply = 0;
		A : for(int a = 1; a <= 998; a ++){
			for(int b = a + 1; b <= 998; b++){
				int c = 1000 - ( a + b );
				if( a < b && b < c){
					if( Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)){
						multiply = a * b * c;
						break A;
					}
				}
			}
		}
		
		System.out.println("a * b * c = " + multiply);
	}
}