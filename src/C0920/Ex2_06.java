package C0920;
/*
 * 20221020, 유제승, 09/20, 대입연산자 연습
 */
public class Ex2_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3,b=3,c=3;
		
		//대입 연산자 사례
		a+=3;
		b*=3;
		c%=2;
		System.out.println("a="+a + ", b="+b + ", c="+c);
		int d=3;
		
		//증감 연산자 사례
		a = d++;
		System.out.println("a="+a+", d="+d);
		a=++d;
		
		//삼항연산자
		int q=3,w=5;
		System.out.println("두 수의 차는 "+((q>w)?q-w:w-q));

	}

}
