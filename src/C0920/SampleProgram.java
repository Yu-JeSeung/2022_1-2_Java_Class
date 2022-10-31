package C0920;

import java.util.Scanner;

public class SampleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>>");
		int price=scanner.nextInt();
		float cgPrice=price/1100;
		System.out.println(price+"원은 $"+cgPrice+"입니다.");
	}

}
