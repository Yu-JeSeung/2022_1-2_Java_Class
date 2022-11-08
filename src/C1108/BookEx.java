package C1108;
/*
 * 20221020, 유제승, 11/08
 */
public class BookEx {
    public static void main(String[] args) {
        Book littlePrince = new Book("LittlePrince","생텍쥐페리");
        littlePrince.show();

        Book lovestory = new Book("춘향전");
        lovestory.show();

        Book empthbook = new Book();
        empthbook.show();
    }
}
