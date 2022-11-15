package C1115;
/*
 * 20221020, 유제승, 11/15
 */
public class Person {
    // 1field
    private String name;
    private String addr;
    private String phone;

    // 2생성자
    public Person(){};
    public Person(String name, String addr, String phone){
        this.name = name;
        this.addr=addr;
        this.phone=phone;
    }

    // 3메소드
    void printPerson(){
        System.out.print(name+", "+addr+", "+phone);
    }

}
