package C1108;
/*
 * 20221020, 유제승, 11/08
 */
public class Circle {
    // 1 필드
    int radius;
    // 2 생성자
    public Circle(){};

    public Circle(int radius){
        this.radius = radius;
    }

    // 3 메소드
    public double getArea(){
        return 3.14 * radius * radius;
    }

    public int add(int i, int j){
        return i+j;
    }
    public int add(int i,int j,int k){
        return i+j+k;
    }
    public double add(double i,double j){
        return i+j;
    }
}
