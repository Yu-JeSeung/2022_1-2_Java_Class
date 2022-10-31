package C0927;
/* 
 * 20221020, 유제승, 09/27, for문 연습2
 */
public class Test_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~1000까지 홀수합,짝수합 구하기
		int Jak=0;
		int Hol=0;
		for(int i=1;i<=1000;i++)
		{
			if(i%2==0)
			{
				Jak+=i;
			}
			else
			{
				Hol+=i;
			}
		}
		System.out.println("짝수합= "+Jak);
		System.out.println("홀수합= "+Hol);
	}

}
