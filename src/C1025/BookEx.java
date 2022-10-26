package C1025;
/*
 * 20221020, 유제승, 10/25
 */
public class BookEx {
    public static void main(String[] args) {
        Book littleP = new Book("어린왕자","생텍쥐베리");
        littleP.printfBook();

        Book lovestory = new Book("춘향전");
        lovestory.printfBook();

        Book homes = new Book();
        homes.author="아서코난도일";
        homes.title="셜록홈즈";
        homes.printfBook();

        // 객체 1개 더 생성
        Book Roma=new Book("그리스로마신화","제우스");
        Roma.printfBook();
    }
}
