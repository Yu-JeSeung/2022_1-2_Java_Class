package C1108;
/*
 * 20221020, 유제승, 11/08
 */
public class Student {
    static int count;

    // 1 필드
    String name;
    String stuid;
    int age;


    // 2 생성자
    public Student(){};
    public Student(String name, String stuid, int age){
        this.name=name;
        this.stuid = stuid;
        this.age = age;
        count++;
    }

    // 3 메소드
    void printStudent(){
        System.out.println("명 = "+count+" 학생수= "+name+" 학생번호 "+stuid+"나이= "+age);
    }
}
