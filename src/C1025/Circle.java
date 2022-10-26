package C1025;
// 클래스 설계
/*
 * 20221020, 유제승, 10/25
 */
public class Circle {
    int radius;
    String name;

    public Circle() {};
    public Circle(int r,String n){
        radius=r;
        name=n;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
}
