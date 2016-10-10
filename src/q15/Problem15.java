package q15;

public class Problem15 {

	public static void main(String[] args) {
		long[][] square = new long[20][20];
		for(int i = 0; i < 20; i++){
			for(int j = 0; j < 20; j++){
				if(i == 0 || j == 0){
					square[i][j] = 1L;
				}else{
					square[i][j] = square[i-1][j] + square[i][j-1];
				}
			}
		}
		
		System.out.println("경로의 경우의 수 : " + square[19][19]);
	}

}
