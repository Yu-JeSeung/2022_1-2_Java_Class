package C1115;
/*
 * 20221020, 유제승, 11/15
 */
public class ColorPoint extends Point{
    // 1feild
    private String color;

    // 2생성자
    public ColorPoint(){};
    public ColorPoint(int x,int y,String color){
        super(x,y); // 첫번째 줄에 적지 않으면 오류난다.
        this.color=color;
    }

    // 3메소드
    public void setColor(String color){
        this.color=color;
    }
    public void showColorPoint(){
        System.out.print(color);
        showPoint();
    }
}
