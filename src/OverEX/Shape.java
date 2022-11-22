package OverEX;
/*
 * 20221020, 유제승, 11/22
 */
abstract public class Shape {
    // 공기처럼 공유하는
    static int count;
    private String name;

    // 2 생성자
    public Shape(){
        count++;
    };
    public Shape(String name){
        this.name=name;
        count++;
    }
    abstract public void draw();
    abstract public void printArea();
    abstract public void getGili();
}

class Rect extends Shape{
    private int width;
    private int height;

    // 1 필드
    private String name;
    public Rect(){};
    public Rect(String name, int width, int height){
        super(name);
        this.width=width;
        this.height=height;
    }


    @Override
    public void draw() {
        System.out.println("사각형을 그려요~~");
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
class Circle extends Shape {
    private int radius;

    public Circle(){};
    public Circle(String name, int radius){
        super(name);
        this.radius=radius;
    }
    @Override
    public void draw(){
        System.out.println("원을 그려요~~~");
    }
    @Override
    public void printArea(){
        double area = 3.14*radius*radius;
        System.out.println("원의 면적 = "+area);
    }
    @Override
    public void getGili(){
        double area=2*3.14*radius;
        System.out.println("원의 둘레 = "+area);
    }

}