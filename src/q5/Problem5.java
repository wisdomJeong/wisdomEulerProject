package q5;
/*
 * 1 - 10 ������ � ���ε� ������ �������� ���� ���� ���� 2520�Դϴ�
 * �׷��� 1 - 20 ������ � ���ε� ������ �������� ���� ���� ���� ���Դϱ�?
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
          
          System.out.println("���� ���� �� : " + num);
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
