package C0920;

import java.util.Scanner;
public class Test2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//가로width, 세로height 을 빈칸으로 구분하여 입력하시오.
		//가로width, 세로height 직사각형의 면적을 구하고 출력하시오.
		System.out.println("가로width, 세로height 을 빈칸으로 구분하여 입력하시오...");
		Scanner a = new Scanner(System.in);
		int width = a.nextInt();
		System.out.println("가로 width = " + width);
		int height=a.nextInt();
		System.out.println("세로 height = " + height);
		int rec=width*height;
		System.out.println("직사각형의 넓이 = " + rec);
		
	}

}
