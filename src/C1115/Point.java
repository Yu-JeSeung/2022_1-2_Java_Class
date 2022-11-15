package C1115;
/*
 * 20221020, 유제승, 11/15
 */
public class Point {
    // 1field
    private int x;
    private int y;

    // 2생성자
    public Point(){};
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    // 3메소드
    public void set(int x,int y) {
        this.x=x;
        this.y=y;
    }
    public void showPoint(){
        System.out.println("("+x+","+y+")");
    }
}
