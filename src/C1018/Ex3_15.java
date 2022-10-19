package C1018;

import java.util.Scanner;

/*
 * 20221020, 유제승, 10/18, 예외처리 try-catch문
 */
public class Ex3_15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while(true)
        {
            System.out.print("나뉨수를 입력하시오. >> ");
            int dividend=scanner.nextInt(); //나뉨수 입력
            System.out.print("나눗수를 입력하시오. >> ");
            int divisor=scanner.nextInt(); //나눗수 입력
            try {
                System.out.println(dividend+"를 / = 몫은 "+dividend/divisor);
                break;
            }
            catch (Exception e) //e는 변수
            {
                e.printStackTrace();
                System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
            }
        }
        scanner.close();
    }
}
