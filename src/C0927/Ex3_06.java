package C0927;

import java.util.Scanner;

/* 
 * 20221020, 유제승, 09/27, 2중 break 연습
 */
public class Ex3_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("exit이나 그만을 입력하면 종료합니다.");
		while(true)
		{
			System.out.print(">>");
			String text = scanner.nextLine();
			if(text.equals("그만")||text.equals("exit"))
			{
				break;
			}
		}
		System.out.println("종료합니다...");
		scanner.close();
	}

}
