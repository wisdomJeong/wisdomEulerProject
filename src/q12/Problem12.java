package q12;

public class Problem12 {
	public static void main(String[] args){
		
		int divisorCount = 0;
		int sum = 0;
		int num = 1;
		
		do {
			divisorCount = 0;
			sum += num;
			
			for(int i = 1; i <= Math.sqrt(num); i++){
				divisorCount++;
			}
			
			divisorCount *= 2;
			
			num++;		
			
		} while (divisorCount < 500);
		
		System.out.println("»ï°¢¼ö : " + sum);
	}
}