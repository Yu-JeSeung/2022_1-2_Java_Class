package C1011;
/*
 * 20221020, 유제승, 10/11, 배열 + max 값 찾기
 */

import java.util.Scanner;

public class Ex3_07 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);


        int intArray[] =new int[5]; //배열 생성

        int max=0;
        System.out.println("양수 5개를 입력하세요.");
        for (int i=0;i<5;i++)
        {
            intArray[i]=scanner.nextInt();
            if(intArray[i]>max)
            {
                max=intArray[i];
            }
        }
        System.out.println("가장 큰 수는 : "+max+" 입니다.");
        scanner.close();
    }
}
