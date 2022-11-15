package C1115;
/*
 * 20221020, 유제승, 11/15
 */
public class StudentEx {
    public static void main(String[] args) {
        Student yjs = new Student("유제승","김포","010-9014-4310",20221020,"컴소");
        yjs.printStudent();

        Student hong = new Student("홍길동","조선","123-4567-8910",20221022,"암행어사");
        hong.printStudent();
    }
}
