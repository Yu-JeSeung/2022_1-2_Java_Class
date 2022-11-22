package C1122;
/*
 * 20221020, 유제승, 11/22
 */
class Circle extends Shape{
    private int radius;

    public Circle(){};
    public Circle(String name, int radius){
        super(name);
        this.radius=radius;
    }
    @Override
    public void draw(){
        System.out.println("원을 구려요~~~");
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
public class MethodEx {
    public static void main(String[] args) {
            Shape shape = new Shape();
            shape.draw();
            shape.printArea();
            Rect rect = new Rect("사각형",2,4);
            rect.draw();
            rect.printArea();
            rect.getGili();
            Rect TV = new Rect("TV",65,40);
            TV.draw();
            TV.printArea();
            TV.getGili();

            Circle circle = new Circle("원",1);
            circle.draw();
            circle.printArea();
            circle.getGili();
            Circle pizza = new Circle("pizza",10);
            pizza.draw();
            pizza.printArea();
            pizza.getGili();
            System.out.println("만들어진 도형의 수 = "+Shape.count);
    }
}
