package C1018;
/*
 * 20221020, 유제승, 10/18
 */
public class CircleEx {
    public static void main(String[] args) {
        Circle pizza;
        pizza = new Circle();
        pizza.name = "불고기피자";
        pizza.radius = 10;
        double area = pizza.getArea();
        System.out.println(pizza.name+" 의 area = "+area);

        Circle gong = new Circle();
        gong.name =  "Soccer ball";
        gong.radius = 4;
        area = gong.getArea();
        System.out.println(gong.name+" 의 area = "+area);

        Circle moon = new Circle();
        moon.name="Earth";
        moon.radius=278;
        area = moon.getArea();
        System.out.println(moon.name+" 의 area = "+area);
    }
}
