package C1011;
/*
 * 20221020, 유제승, 10/11, 배열 연습
 */

public class Ex3_0 {
    public static void main(String[] args) {
        int intArray []={4,55,32,28,35,2,99,13,43,65};
        int sum=0;
        for (int i=0;i<intArray.length;i++)
        {
            System.out.println(intArray[i]+" ");
            sum+=intArray[i];
        }
        System.out.println();
        System.out.println("합계= "+sum+" 평균= "+(double)sum/ intArray.length);
    }
}
