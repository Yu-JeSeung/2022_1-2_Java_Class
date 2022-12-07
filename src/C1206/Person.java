package C1206;
/*
 * 20221020, 유제승, 12/06
 */
// 설계도
public class Person {
    // 전역변수
    static int count;
    // 1 필드
    private String name;
    private String addr;
    private String phone;

    // 2 생성자
    public Person() {
        count++;
    };
    public Person(String name, String addr, String phone) {
        this.name = name;
        this.addr = addr;
        this.phone = phone;
        count++;
    }

    // 3 메소드

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

class Student extends Person{
    // 1 필드
    private int stuId;
    private String jeongong;

    // 2 생성자
    public Student(){};
    public Student(String name, String addr, String phone, int stuId, String jeongong) {
        super(name, addr, phone);
        this.stuId = stuId;
        this.jeongong = jeongong;
    }

    // 3 메소드
    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getJeongong() {
        return jeongong;
    }

    public void setJeongong(String jeongong) {
        this.jeongong = jeongong;
    }
}
