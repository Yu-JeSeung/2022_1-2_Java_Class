package C1011;
/*
 * 20221020, 유제승, 10/11, for-each 문
 */

public class Ex3_09 {
    public static void main(String[] args) {
        int [] n={1,2,3,4,5};
        String names[]={"사과","배","banana","cherry","딸기","포도"};
        double weight[]={45.1,50.2,53.3,55.4,72.6,75.8,80.1};
        int sum=0;

        for (int k:n) {
            System.out.print(k+" ");
            sum+=k;
        }
        System.out.println("합은 "+sum);

        for (String str:names) {
            System.out.print(str+" ");
        }
        System.out.println();
        double total=0;
        for(double person:weight){
            System.out.print(person+" ");
            total+=person;
        }
        System.out.println("평균(avg)몸무게= "+total/weight.length);
    }
}
