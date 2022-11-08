package C1108;
/*
 * 20221020, 유제승, 11/08
 */
class Clac {
    public Clac(){}
    public static int abs(int a){
        return a>0?a:-a;
    }
    public static int max(int a,int b){
        return (a>b)?a:b;
    }
    public static int min(int a,int b){
        return (a>b)?b:a;
    }
}
public class CalcEx {
    public static void main(String[] args) {
        // Clac c1 = new Calc();
        // c1.abs(-5);
        // c1.abs(-5);
        System.out.println(Clac.abs(-5));
        System.out.println(Clac.max(10,8));
        System.out.println(Clac.min(10,8));

        System.out.println(Math.abs(-10));  // 절대값 abs
        System.out.println(Math.pow(2,3));  // 2의 3승

    }
}
