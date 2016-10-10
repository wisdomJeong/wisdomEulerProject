package q5;
/*
 * 1 - 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다
 * 그러면 1 - 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?
*/
public class Problem5 {
    public static void main(String[] args) {
          int num = 1;
          
          A : while(true){
                if(checkNum(num)){
                      break A;
                }
                num++;
          }
          
          System.out.println("가장 작은 수 : " + num);
    }
    private static boolean checkNum(int num) {
          for(int i = 1; i <= 20; i++){
                if(num % i != 0){
                      return false;
                }
          }
          return true;
    }
}
