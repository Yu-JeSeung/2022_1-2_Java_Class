package C0927;
/* 
 * 20221020, 유제승, 09/27, 2중 for문 연습
 */
//2~16 구구단
public class Ex3_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<17;i++)
		{
			for(int j=1;j<10;j++)
			{
				System.out.print(i+"*"+j+"="+i*j);
				System.out.print("\t"); //탭만큼 띄우기
			}
			System.out.println();
		}
	}

}
