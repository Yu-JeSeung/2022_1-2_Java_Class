package C0913;

public class CircleArea { //원의 면적 구하기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.141592;
		double radius = 10.0; //변수 선언 초기화
		double circleArea =radius*radius*PI;
		System.out.println("원의 면적= " + circleArea);
		
		//가로 세로 직사각형의 면적구하기
		int width = 10;
		int height = 12;
		int rectArea=width*height;
		System.out.print("가로= "+ width);
		System.out.print(" 세로= "+ height);
		System.out.println(" 직사각형의 면적= "+ rectArea);
	}

}
