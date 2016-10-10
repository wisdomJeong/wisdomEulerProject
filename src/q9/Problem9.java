package q9;
/* 
 * 세 자연수 a, b, c 가 피타고라스 정리 a^2 + b^2 = c^2 를 만족하면 피타고라스 수라고 부릅니다. (여기서 a<b<c)
 * 예를 들면 3^2 + 4^2 = 9 + 16 = 25 = 5^2 이므로 3,4,5는 피타고라스 수 입니다.
 * a + b + c = 1000인 피타고라스 수 a, b, c는 한가지 뿐입니다. 이때의 a * b* c 는 얼마입니까
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