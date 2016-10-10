package q6;
/*
 * 1부터 10까지 자연수를 각각 제곱해 더하면 다음과 같다(제곱의 합)
 *  1^2 + 2^2 + 3^2 + ..... + 10^2 = 385
 * 1부터 10을 먼저 더한 다음에 그 결과를 제곱하면 다음과 같습니다(합의 제곱)
 *  (1 + 2 + 3 + ... + 10)^2 = 3025
 *  따라서 1부터 10까지 자연수에 대해 "합의 제곱"과 "제곱의 합"의 차이는  3025-385 = 2640 이 됩니다.
 *  그러면 1부터 100까지 자연수에 대해 "합의 제곱"과 "제곱의 합"의 차이는 얼마입니까? 
 * */
public class Problem6 {
	public static void main(String[] args){
		
		int squareOfSum = 0; //합의 제곱	
		int sumOfSquare = 0; //제곱의 합
		
		for(int i = 1; i <= 100; i++){
			squareOfSum+=i;
			sumOfSquare+=(i*i);
		}
		
		squareOfSum *= squareOfSum;
		
		int abs = Math.abs(squareOfSum-sumOfSquare);
		
		System.out.println("'합의 제곱' : " + squareOfSum);
		System.out.println("'제곱의 합' : " + sumOfSquare);
		System.out.println("'합의 제곱'과 '제곱의 합'의 차이 : " + abs);
	}
}
