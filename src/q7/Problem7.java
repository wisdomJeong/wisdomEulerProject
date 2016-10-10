package q7;

import java.util.ArrayList;
import java.util.List;

/*
 * 소수를 크기 순으로 나열하면 2, 3, 5, 7, 11, 13, .... 과 같이 됩니다.
 * 이 때 10,001번째의 소수를 구하시오.
 */
public class Problem7 {
	public static void main(String[] args){
		List<Integer> primeList = new ArrayList<>();
		int num = 2;
		do {
			if(isPrime(num)){
				primeList.add(new Integer(num));
			}
			num++;
		} while (primeList.size() < 10001);
		
		System.out.println("10001번째 소수 : " + primeList.get(10000));
	}

	private static boolean isPrime(int num) {
		for(int i = 2; i < num; i++){
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}
}