package C1115;
/*
 * 20221020, 유제승, 11/15
 */
public class Student extends Person{
    // 1 필드
    private int stuId;
    private String jeongong;

    // 2 생성자
    public Student() {};
    public Student(String name, String addr, String phone, int stuId, String jeongong){
        super(name,addr,phone);
        this.stuId=stuId;
        this.jeongong=jeongong;
    }

    // 3 메소드
    void printStudent(){
        printPerson();
        System.out.println(stuId+", "+jeongong);
    }
}
