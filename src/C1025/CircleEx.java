package C1025;
/*
 * 20221020, 유제승, 10/25
 */
public class CircleEx {
    public static void main(String[] args) {
        Circle pizza = new Circle(10,"불고기피자");
        double area = pizza.getArea();
        System.out.println(pizza.name + " 의 면적 = " + area);

        Circle donut = new Circle();
        donut.name="글레이즈 도넛";
        donut.radius=4;
        area = donut.getArea();
        System.out.println(donut.name + " 의 면적 = " + area);

        // 객체 1개더 만들기. 생성자에 초기값을 넣어서
        Circle earth = new Circle(9876,"Earth");
        double aRea = earth.getArea();
        System.out.println(earth.name+"의 면적 = "+aRea);
    }
}
