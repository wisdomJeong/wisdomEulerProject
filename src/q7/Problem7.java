package q7;

import java.util.ArrayList;
import java.util.List;

/*
 * �Ҽ��� ũ�� ������ �����ϸ� 2, 3, 5, 7, 11, 13, .... �� ���� �˴ϴ�.
 * �� �� 10,001��°�� �Ҽ��� ���Ͻÿ�.
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
		
		System.out.println("10001��° �Ҽ� : " + primeList.get(10000));
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