package Midterm;

import java.util.Scanner;

public class Ex2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름, 도시, 나이, 체중, 결혼여부 입력하세요.");

        String name = scanner.next();
        System.out.print("이름은 "+name+", ");

        String city = scanner.next();
        System.out.print("도시는 "+city+", ");

        int age= scanner.nextInt();
        System.out.print("나이는 "+age+", ");

        double weight = scanner.nextDouble();
        System.out.print("체중은 "+weight+", ");

        boolean single = scanner.nextBoolean();
        System.out.print("독신 여부는 "+single+", ");

        scanner.close();
    }
}
