package C1025;

public class Grade {
    int math;
    int science;
    int english;

    public Grade(int m,int s,int e) {
        this.math=m;
        this.science=s;
        this.english=e;
    }

    public int average(){
        return (this.math+this.english+this.science)/3;
    }
}
