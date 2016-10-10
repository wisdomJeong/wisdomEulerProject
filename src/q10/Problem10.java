package q10;

import java.util.ArrayList;
import java.util.List;

public class Problem10 {
	public static void main(String[] args){
		
		List<Long> primeList = new ArrayList<>();
		
		Long sumOfPrime = 0L;
		
		for(Long num = 2L; num <= 2000000L; num++){
			if(isPrime(num, primeList)){
				sumOfPrime += num;
				primeList.add(num);
			}
		}
		
		System.out.println("이백만 이하 소수의 합 : " + sumOfPrime);
	}

	private static boolean isPrime(Long num, List<Long> primeList) {
		for(Long i : primeList){
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}
}