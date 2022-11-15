package C1115;
/*
 * 20221020, 유제승, 11/15
 */
public class MagaEx {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Magazine m1 = new Magazine("채식주의자", "한강", 220, "2022-11-30");
        Magazine m2 = new Magazine("1984", "조지오웰", 422, "1980-03-11");

        m1.magaPrint();
        m2.magaPrint();
    }

}
