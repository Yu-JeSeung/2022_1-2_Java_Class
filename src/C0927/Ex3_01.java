package C0927;
/* 
 * 20221020, 유제승, 09/27, 반복문 연습1
 */
public class Ex3_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
		System.out.println("=======================");
		for(int i=0;i<10;i++)
		{
			System.out.print(i);
		}
		//예제 3-1하기
		System.out.println();
		int sum=0;
		for(int i=0;i<=10;i++)
		{
			sum+=i;
			System.out.print(i);
			if(i<=9) //1~9까지는 '+'출력
			{
				System.out.print('+');
			}
			else //i가 10인 경
			{
				System.out.print('='); //'=' 출력하
				System.out.print(sum); //덧셈 결과 출력
			}
		}
		System.out.println();
		System.out.println("----------------------");
		
		 //while문
		int i=0;
		while(i<10)
		{
			System.out.print(i);
			i++;

		}
	}

}
