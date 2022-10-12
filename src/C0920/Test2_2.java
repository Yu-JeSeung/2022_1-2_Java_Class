package C0920;

import java.util.Scanner;
public class Test2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("국어점수, 영어점수, 수학점수를 빈칸으로 구분하여 입력하시오...");
		Scanner a = new Scanner(System.in);
		int korea = a.nextInt();
		System.out.println("국어점수 = " + korea);
		int eng=a.nextInt();
		System.out.println("영어점수 = " + eng);
		int math=a.nextInt();
		System.out.println("수학점수 = " + math);
		int sum=korea+math+eng;
		float avg=sum/3;
		System.out.println("합계 = " + sum);
		System.out.println("평균 = " + avg);
	}

}
