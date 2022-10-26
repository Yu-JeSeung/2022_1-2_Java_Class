package C1025;

public class Movie {
    String name;
    int score;
    String actor;
    int year;

    public Movie(){};
    public Movie(String n,int s,String a,int y){
        this.name=n;
        this.score=s;
        this.actor=a;
        this.year=y;
    }

    public void MivePrint(){
        System.out.println("제목: "+this.name+" 평점: "+this.score+" 감독: "+this.actor+" 연도: "+this.year);
    }

}
