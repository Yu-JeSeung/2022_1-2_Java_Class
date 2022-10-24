package C1018;

public class MovieEx {
    public static void main(String[] args) {
        Movie aven = new Movie();
        aven.editor = "마크 주커버그";
        aven.score=96;
        aven.name="어벤져스";
        aven.date=2021;

        Movie house = new Movie();
        house.name="괴물";
        house.date=2001;
        house.score=99;
        house.editor="봉준호";

        System.out.println("첫번째 영화");
        aven.print();
        System.out.println("");
        System.out.println("두번째 영화");
        house.print();
    }
}
