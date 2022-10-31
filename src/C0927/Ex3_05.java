package C0927;

import java.util.Scanner;

/* 
 * 20221020, 유제승, 09/27, 2중 continue 연습
 */
//양수의 합 구하기
public class Ex3_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 5개를 입력하세요.");
		int sum=0;
		for(int i=0;i<5;i++)
		{
			int n =scanner.nextInt();
			if(n<=0)
			{
				continue;
			}
			else
			{
				sum+=n;
			}
		}
		System.out.println("양수의 합은 "+sum);
		scanner.close();
	}

}
