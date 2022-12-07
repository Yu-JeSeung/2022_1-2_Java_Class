package C1206;
/*
 * 20221020, 유제승, 12/06
 */
public class WrapperEX {
    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        System.out.println(i1);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        Integer i2 = new Integer("100");
        System.out.println(i2);
        System.out.println(Integer.max(100,200));
        System.out.println(Integer.min(100,200));
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));

        char c1='4', c2='F';
        // true 생략 가능
        if (Character.isDefined(c1)==true)
            System.out.println(c1+"는 숫자");
        if(Character.isAlphabetic(c2))
            System.out.println(c2+"는 영문자");
        System.out.println("정수 = "+Integer.parseInt("100"));
        System.out.println("실수 = "+Double.parseDouble("3.14"));
    }
}
