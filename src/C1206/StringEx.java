package C1206;
/*
 * 20221020, 유제승, 12/06
 */
import com.sun.javaws.IconUtil;

public class StringEx {
    public static void main(String[] args) {
        String stra = "DongyangMirae Univ";
        String strb = new String("Computer");
        System.out.println(stra+"길이 = "+stra.length());
        System.out.println(stra.charAt(2));
        for(int i=0;i<stra.length();i++)
        {
            System.out.print(stra.charAt(i));
        }
        System.out.println();

        // strb를 거꾸로 출력
        for(int i=strb.length()-1;i>=0;i--)
        {
            System.out.print(strb.charAt(i));
        }
        System.out.println();
        // stra를 읽어 대문자는 소문자로 소문자는 대문자로 바꿔서 출력
        for(int i=0;i<stra.length();i++)
        {
            if(Character.isUpperCase(stra.charAt(i)))
            {
                System.out.print(Character.toLowerCase(stra.charAt(i)));
            }
            else
                System.out.print(Character.toUpperCase(stra.charAt(i)));
        }



        // 예제 6-7
        String a = new String("C#");
        String b = new String(",C++");
        System.out.println(a+"의 길이는 "+a.length());
        System.out.println(a.contains("#")); // 문자열 포함 여부

        a = a.concat(b); // 문자열 연결
        System.out.println(a);

        a = a.trim(); // 문자열 앞 뒤 공백제거
        System.out.println(a);

        a = a.replace("C#","Java"); // 문자열 대치
        System.out.println(a);

        String s[] = a.split(","); // 문자열 분리
        for(int i=0;i<s.length;i++)
        {
            System.out.println("분리된 문자열 "+ i + ":"+s[i]);
        }

        a = a.substring(5); // 인덱스 5부터 끝까지 서브 스트링 리턴
        System.out.println(a);

        char c = a.charAt(2); // 인덱스 2의 문자 리턴
        System.out.println(c);
    }
}
