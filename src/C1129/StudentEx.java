package C1129;
/*
 * 20221020, 유제승, 11/29
 */
import java.util.Scanner;

public class StudentEx {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동","서울","010-1111-1111");
        System.out.println(p1);
        p1.setAddr("경기도");
        p1.setPhone("010-2222-2222");
        System.out.println(p1.getName()+", "+p1.getAddr()+", "+p1.getPhone());

        // p1.addr="경기도";
        // p1.phone="010-2222-2222";

        Student s1 = new Student("송중기","서울","010-3333-3333",2201,"컴소");
        System.out.println(s1);
        s1.setJeongong("경영학과");
        System.out.println(s1.getName()+", "+s1.getJeongong());
        Scanner sc = new Scanner(System.in);

        Student s2 = new Student("손흥민","유럽","010-4444-4444",2202,"체육학과");
        Student s3 = new Student("손흥민","유럽","010-4444-4444",2202,"체육학과");
        if(s2==s3){
            System.out.println("둘다 손흥민 객체가 맞습니다.");
        }
        else{
            System.out.println("손흥민 객체가 틀립니다.");
        }
        if(s2.getName().equals(s3.getName())){
            System.out.println("손흥민이 맞습니다.");
        }
        if(s2.getName().equals("손흥민")){
            System.out.println("손흥민이 맞습니다.");
        }
    }
}
