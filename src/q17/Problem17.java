package q17;

public class Problem17 {

	public static void main(String[] args) {
		
		
		int[] number = {0, 3, 3, 5, 4, 4, 3, 5, 5, 4, 3, 3, 6, 6, 8, 8, 7, 7, 8, 8};
		int[] tenName = {0,3, 6, 6, 5, 5, 5, 7, 6, 6};
				
		int hundred = 7;
		int and = 3;
	
		long charCount = 0;
		for(int i = 1; i <= 1000; i++){
			int num = i;
			if(num >= 100){
				charCount += number[ num / 100];
				charCount += hundred;
				if(num % 100 != 0){
					charCount += and;
					num %= 100;
				}				
			}
			
			if( num < 20 ){
				charCount += number[num];
			}else if( num >= 20 && num < 100 ){
				charCount += tenName[ num / 10 ];
				charCount += number[ num % 10 ];
			}
		}
		
		System.out.println("1~1000±îÁö ¼öÀÇ ¾ËÆÄºª °¹¼ö : " + charCount);
	}

}
