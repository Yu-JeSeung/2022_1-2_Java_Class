package C0920;

import java.util.Scanner;
public class Ex2_05 {
	// 원하는 시간을 입력받고 시 분 초 로 계산해서 알려줌.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("정수를 입력하세요.");
		int time=scanner.nextInt(); //정수 입력 
		int second =time%60;
		int minute = (time/60)%60;
		int hour = (time/60)/60;
		
		System.out.print(time + "초는 ");
		System.out.print(hour + "시간, ");
		System.out.print(minute + "분, ");
		System.out.print(second + "초입니다.");
		
		
		System.out.println();
		scanner.close(); //스캔 종료.
	}

}
