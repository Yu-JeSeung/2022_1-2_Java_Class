package C1018;
/*
 * 20221020, 유제승, 10/18
 */
public class Clac {
    public static void main(String[] args) {
        double sum=0.0;

        for(int i=0;i< args.length;i++)
        {
            sum+=Double.parseDouble(args[i]);
        }
        System.out.println("합계 : "+sum);
    }
}
