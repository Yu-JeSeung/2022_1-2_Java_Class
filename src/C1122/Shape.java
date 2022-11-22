package C1122;
/*
 * 20221020, 유제승, 11/22
 */
public class Shape {
    // 공기처럼 공유하는
    static int count;
    // 1 필드
    private String name;

    // 2 생성자
    public Shape(){
        count++;
    };
    public Shape(String name){
        this.name=name;
        count++;
    }
    public void draw(){
        System.out.println("도형Shape");
    }
    public void printArea(){
        System.out.println("도형 면적 구하기");
    }
    public void getGili(){
        System.out.println("도형 둘레 길이 구하기");
    }
}

class Rect extends Shape{
    private int width;
    private int height;

    public Rect(){};
    public Rect(String name, int width, int height){
        super(name);
        this.width=width;
        this.height=height;
    }

    @Override
    public void draw(){
        System.out.println("사격형Rect 그려요~~");
    }
    @Override
    public void printArea(){
        int area = width*height;
        System.out.println("사격형의 면적 = "+area);
    }
    @Override
    public void getGili(){
        int area = 2*(width+height);
        System.out.println("사격형의 둘레 = "+area);
    }
}