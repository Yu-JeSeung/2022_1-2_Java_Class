package C0927;

import java.util.Scanner;

/* 
 * 20221020, 유제승, 09/27, 2중 break 연습
 */
//정수의 갯수를 입력하시오.
//갯수만큼 정수를 입력하고 그 합계와 평균 갯수를 출력하시오.
public class Test_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수의 갯수를 입력하세요.");
		int count = scanner.nextInt();
		int Tcount=0;
		int sum=0;
		for(int x=0;x<count;x++)
		{
			int n=scanner.nextInt();
			sum+=n;
			Tcount++;
		}
		System.out.println("합= "+sum+",평균= "+(double)sum/Tcount+",갯수= "+Tcount);
		scanner.close();
	}

}
