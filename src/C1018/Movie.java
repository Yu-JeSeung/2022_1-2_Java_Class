package C1018;

public class Movie {
    String name;
    int score;
    String editor;
    int date;

    public Movie(){};

    public void print()
    {
        System.out.println("영화 제목 : "+name);
        System.out.println("영화 평점 : "+score);
        System.out.println("영화 감독 : "+editor);
        System.out.println("영화 개봉일 : "+date);
    }

}
