package C1011;

import java.util.Scanner;

/*
 * 20221020, 유제승, 10/11
 */
//4명의 학생의 국어,영어,수학,미술,체육 점수를 입력하세요.
//2차원 배열에 저장
/*
출력--
0번학생, 국어=,영어=,....
합계(정수) 평균(실수)
1번 학생
2번 학생
3번 학생
 */

public class Test02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int student[][]=new int[4][5];
        System.out.println("4명 학생의 점수를 입력하세요.(0~100)");
        String subject[]={"국어","영어","수학","미술","체육"};
        int sum=0;
        for(int i=0;i<student.length;i++)
        {
            for(int j=0;j< student[i].length;j++)
            {
                student[i][j]= scanner.nextInt();
            }
        }
        for(int i=0;i<student.length;i++)
        {
            int qq=0;
            for(int j=0;j< student[i].length;j++)
            {
                sum+=student[i][j];
                System.out.println(i+"번 학생의 "+subject[j]+"점수= "+student[i][j]);
                qq++;
            }
            System.out.println(i+"번 학생의 총점: "+sum+" 평균: "+(double)sum/qq);
            sum=0;
            System.out.println();
        }
    }
}
