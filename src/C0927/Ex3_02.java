package C0927;

import java.util.Scanner;

/* 
 * 20221020, 유제승, 09/27, while문 연습
 */
//-1이 입력될때까지 입력된 수의 평균구하기
public class Ex3_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		
		int count=0;
		int sum=0;
		int n=scanner.nextInt();
		while(n!=-1)
		{
			sum+=n;
			count++;
			n=scanner.nextInt();
		}
		if(count==0)
		{
			System.out.println("입력된 수가 없습니다.");
		}
		else
		{
			System.out.print("정수의 개수는 " + count + "개 이며 ");
			System.out.println("평균은 "+(double)sum/count+"입니다.");
		}
		scanner.close();
	}

}
