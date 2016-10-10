package q16;

import java.math.BigInteger;

public class Problem16 {

	public static void main(String[] args) {
		
		BigInteger multiply = new BigInteger("1");
		for(int i = 0; i<1000; i++){
			multiply = multiply.multiply(new BigInteger("2"));
		}
		
		String num = multiply.toString();
		BigInteger mult = new BigInteger("1");
		for(int i = 0; i<num.length()-1; i++){
			mult = mult.add(new BigInteger( num.substring(i, i+2)));
		}
		
		System.out.println(mult.toString());
	}
}
