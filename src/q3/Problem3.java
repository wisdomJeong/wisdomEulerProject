package q3;

import java.util.TreeSet;
public class Problem3 {
            
      public static void main(String[] args){
            Long testno = 600851475143L;
                        
            TreeSet<Long> primeList = primeFactor(testno);
            
            Long maxPrime = primeList.descendingSet().first();
            System.out.println("maxPrime : " + maxPrime);
      
      }
      
      private static TreeSet<Long> primeFactor(Long number) {
            TreeSet<Long> list = new TreeSet<>();
            Long n = 2L;
            while(number > 1){
                  if(number % n == 0){
                        number = number / n;
                        list.add(n);
                  }else{
                        n++;
                  }
            }
            return list;
      }
}
