package C1115;
/*
 * 20221020, 유제승, 11/15
 */
public class ColorPointEx {
    public static void main(String[] args) {
        Point p = new Point();
        p.set(1,2);
        p.showPoint();

        ColorPoint cp = new ColorPoint();
        cp.set(3,4);
        cp.setColor("빨강red");
        cp.showColorPoint();

        ColorPoint cp2 = new ColorPoint(5,6,"blue파랑");
    }
}
