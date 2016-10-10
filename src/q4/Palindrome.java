package q4;
/*
 * 앞에서 부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(Plaindrome)라고 부릅니다.
 * 두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009(91*99)입니다.
 * 세 자리 수를 곱해 만들 수 있는  가장 큰 대칭수는 얼마입니까?
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
		
		System.out.println("가장 큰 대칭수는 : " + maxPlaindrome);
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
