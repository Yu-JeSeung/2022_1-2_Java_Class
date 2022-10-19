package C1018;
/*
 * 20221020, 유제승, 10/18
 */
import java.util.Scanner;

public class RectEx {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.print("사각형의 가로와 세로 입력 >>> ");
        rect.width=sc.nextInt();
        rect.height=sc.nextInt();
        System.out.println("사각형의 면적은 : "+rect.getArea());
    }
}
