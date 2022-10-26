package C1025;
/*
 * 20221020, 유제승, 10/25
 */
public class StudentEx {
    public static void main(String[] args) {
        Student yjs = new Student("유제승",20221020,26,"010-9014-4310");
        Student lhm = new Student();
        lhm.name="이현민";
        lhm.studId=20221099;
        lhm.age=20;
        lhm.phone="010-1234-5678";

        yjs.printStudent();
        lhm.printStudent();
    }
}
