package C1115;

public class TextBookEx {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TextBook t1 = new TextBook("자바프로그래밍", 100, "황기태", "1학년 1학기", "동양미래대학교");
        TextBook t2 = new TextBook("국어", 40, "선생님", "1학년1학기", "서울초등학교");

        t1.printTextBook();
        t2.printTextBook();
    }

}
