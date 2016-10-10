package q14;

public class Problem14 {
	public static void main(String[] args){
		
		Long maxCount = 0L;
		int longWayNumber = 0;
		for(int i = 1000000; i > 1; i--){
			int num = i;
			Long count = 0L;
			
			while(true){
				if(num % 2 == 0){
					num = num / 2;
					count++;
				}else{
					num = 3 * num + 1;
					count++;
				}
			
				if(num == 1 || num <= 0){
					break;
				}
			}
			
			if( count > maxCount){
				maxCount = count;
				longWayNumber = i;
			}
		}
		
		System.out.println("가장 긴 과정을 거치는 숫자 : " + longWayNumber);
		System.out.println("과정 : " +  maxCount);
	}
}
