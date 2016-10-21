package q19;

import java.awt.Frame;

/**
 * ������ �޷¿� ���� �� ���� �Ϲ����� �����Դϴ� (�ʿ��� ��� �� �� ������ �� ���ŵ� �����ϴ�).
	* 1900�� 1�� 1���� �������̴�.
	* 4��, 6��, 9��, 11���� 30�ϱ��� �ְ�, 1��, 3��, 5��, 7��, 8��, 10��, 12���� 31�ϱ��� �ִ�.
	* 2���� 28��������, ���⿡�� 29�ϱ��� �ִ�.
	* ������ ������ 4�� ������ �������� �ظ� ���Ѵ�. ������ 400���� ������ �������� �ʴ� �� 100��°�� ������ �ƴϸ�, 400���� ������ �������� �����̴�
	20���� (1901�� 1�� 1�� ~ 2000�� 12�� 31��) ����, �ſ� 1���� �Ͽ����� ���� �� �� ���Դϱ�?
 * @author wisdomJ
 *
 */
public class Problem19 {

	public static void main(String[] args) {
		
		String[] dayOfWeek = {"��", "��", "ȭ", "��", "��", "��", "��"};
		
		int startYear = 1900;
		
		String firstDayName = "";
		int dayOfWeekCount = 1;
		
		int result = 0;
		
		do{
			
			Integer[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			
			if(startYear % 4 == 0){
				if( startYear % 100 == 0 ){
					if(startYear % 400 == 0){
						dayOfMonth[1] = 29;
					}
				}else{
					dayOfMonth[1] = 29;
				}
			}
			
			for(int j = 0; j < dayOfMonth.length; j++){
				dayOfWeekCount = dayOfMonth[j] % 7 + dayOfWeekCount;
				
				if(dayOfWeekCount >= 7){
					dayOfWeekCount -= 7;
				}
				
				firstDayName = dayOfWeek[dayOfWeekCount];
				
				if( j + 2 == 13){
					startYear++;
				}
			
				if(startYear > 1900 && startYear <= 2000){
					if(firstDayName.equals("��")){
						System.out.println(startYear + "�� " + j +"�� " + "1���� " + firstDayName + "����");
						result++;
					}
				}
			}
			
		}while(startYear <= 2000);
		
		System.out.println("20���� (1901�� 1�� 1�� ~ 2000�� 12�� 31��)����, �ſ� 1���� �Ͽ����� ���� �� " + result + "��");
	}
}