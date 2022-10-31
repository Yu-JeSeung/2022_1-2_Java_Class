package C0920;
/*
 * 20221020, 유제승, 09/20, if문 연습
 */
import java.util.Scanner;

public class Ex2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("수를 입력하세요. ");
		int number=in.nextInt();
		
		if(number%3==0)
		{
			System.out.println("3의 배수입니다.");
		}
		else
		{
			System.out.println("3의 배수가 아닙니다.");
		}
		
		in.close();

	}

}
