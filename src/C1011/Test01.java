package C1011;
/*
 * 20221020, 유제승, 10/11
 */

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        System.out.print("국어, 영어, 수학, 미술, 체육 점수를 입력하세요.(0~100) >> ");
        Scanner scanner =new Scanner(System.in);
        int subject[]=new int[5];
        for(int i=0;i<subject.length;i++)
        {
            subject[i]= scanner.nextInt();
        }
        int sum=0;
        String q[]={"국어","영어","수학","미술","체육"};
        for(int i=0;i<subject.length;i++)
        {
            sum+=subject[i];
        }
        for(int i=0;i<subject.length;i++)
        {
            System.out.println(q[i]+"= "+subject[i]);
        }
        System.out.println("합계: "+sum+" 평균: "+(double)sum/subject.length);
        scanner.close();


    }
}
