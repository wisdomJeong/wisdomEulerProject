package q4;
/*
 * �տ��� ���� ���� ���� �ڿ������� ���� ���� ����� ���� ���� ��Ī��(Plaindrome)��� �θ��ϴ�.
 * �� �ڸ� ���� ���� ���� �� �ִ� ��Ī�� �� ���� ū ���� 9009(91*99)�Դϴ�.
 * �� �ڸ� ���� ���� ���� �� �ִ�  ���� ū ��Ī���� ���Դϱ�?
 * */
public class Palindrome {
	
	public static void main(String[] args){
		
		int maxPlaindrome = 0;
		for(int i = 999; i >= 100; i--){
			for(int j = 999; j >= 100; j--){
				int multiply = i * j;
				if(isPlaindrome(multiply)){
					if(isMaximumPlaindrome(multiply, maxPlaindrome)){
						maxPlaindrome = multiply;
					}
				}
			}
		}
		
		System.out.println("���� ū ��Ī���� : " + maxPlaindrome);
	}

	private static boolean isMaximumPlaindrome(int multiply, int maxPlaindrome) {
		return multiply > maxPlaindrome;
	}

	private static boolean isPlaindrome(int multiply) {
		String str = new Integer(multiply).toString();
		int tag = str.length() / 2;
		for(int i = 0; i < tag; i++){
			if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
				return false;
			}
		}
		return true;
	}	
}
