package OverEX;
/*
 * 20221020, 유제승, 11/22
 */
public abstract class MethodEx extends Shape{
    public static void main(String[] args) {
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
        System.out.println("만들어진 도형의 수 = "+ Shape.count);
    }
}
