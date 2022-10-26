package C1025;

public class MovieEx {
    public static void main(String[] args) {
        Movie aven = new Movie("어벤져서",96,"존테리",2021);
        Movie spider = new Movie();
        spider.year=2019;
        spider.name="어메이징스파이더맨";
        spider.score=89;
        spider.actor="마블";

        aven.MivePrint();
        spider.MivePrint();
    }
}
