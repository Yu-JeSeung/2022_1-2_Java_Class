package C0913;
import java.util.Scanner; //ctrl+shift+0
public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름, 나이를 빈칸으로 분리하여 입력하시오...");
		Scanner i = new Scanner(System.in);
		String name = i.next(); //이름입력
		System.out.println("이름 name = " + name);
		int age=i.nextInt(); //20
		System.out.println("나이 age = " + age);
	}

}
