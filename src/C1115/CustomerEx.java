package C1115;
/*
 * 20221020, 유제승, 11/15
 */
public class CustomerEx {
    public static void main(String[] args) {
        Customer san = new Customer("산리오","달","999-9099",124321,800);
        san.printCuse();

        Customer kurome = new Customer("쿠로미","목성","123-9099",9832743,300000);
        kurome.printCuse();
    }
}
