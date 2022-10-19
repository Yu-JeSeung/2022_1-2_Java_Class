package C1018;

public class StudentEx {
    public static void main(String[] args) {
        Student me = new Student();
        me.age=26;
        me.name="유제승";
        me.phone="010-9014-4310";
        me.stuld=20221020;

        Student fd = new Student();
        fd.stuld=20221021;
        fd.phone="010-1234-5678";
        fd.age=25;
        fd.name="박소현";

        System.out.println("1번 학생의 이름 : "+me.name+" "+" 나이 : "+me.age+" "+" 전화번호 : "+me.phone+" "+" 학번 : "+me.stuld);
        System.out.println("2번 학생의 이름 : "+fd.name+" "+" 나이 : "+fd.age+" "+" 전화번호 : "+fd.phone+" "+" 학번 : "+fd.stuld);
    }
}
