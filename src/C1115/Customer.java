package C1115;
/*
 * 20221020, 유제승, 11/15
 */
public class Customer extends Person{
    private int cusNo;
    private int mile;

    public Customer(){};

    public Customer(String name, String addr, String phone, int cusNo, int mile){
        super(name,addr,phone);
        this.cusNo=cusNo;
        this.mile=mile;
    }

    void printCuse(){
        printPerson();
        System.out.println(cusNo+", "+mile);
    }
}
