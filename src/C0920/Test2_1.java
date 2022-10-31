package C0920;

import java.util.Scanner;

/*
 * 20221020, 유제승, 09/20, 다중 if문 연습
 */
public class Test2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner(System.in);
		System.out.print("월을 입력하시오(1~12). ");
		int flag=0;
		String season = null;
		int month=scanner.nextInt();
		
		if(month>=3&&month<=5)
		{
			season="봄";
		}
		else if(month>=6&&month<=8)
		{
			season="여름";
		}
		else if(month>=9&&month<=11)
		{
			season="가을";
		}
		else if(month>12||month<1)
		{
			System.out.println("0~12월을 입력해 주세요.");
			flag=1;
		}
		else
		{
			season="겨울";
		}
		if(flag!=1)
		{
			System.out.println("if문: "+month+"월은 "+season+"입니다.");
		}
		
		//switch문
		int flag2=0;
		switch (month)
		{
		case 12:
		case 1:
		case 2:
			season="겨울";
			break;
		case 3:
		case 4:
		case 5:
			season="봄";
			break;
		case 6:
		case 7:
		case 8:
			season="여름";
			break;
		case 9:
		case 10:
		case 11:
			season="가을";
			break;
		default:
			System.out.println("0~12월을 입력해 주세요.");
			flag2=1;
		}
		if(flag2!=1)
		{
			System.out.println("switch문: "+month+"월은 "+season+"입니다.");
		}
		
	}

}
