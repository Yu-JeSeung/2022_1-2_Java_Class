package C1206;

import java.util.ArrayList;

public class ArrayListEx2 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(100);
        intList.add(200);
        intList.add(300);
        for(int i=0;i<intList.size();i++)
        {
            System.out.print(intList.get(i)+"\t");
        }
        System.out.println();

        ArrayList<Double> douList = new ArrayList<Double>();
        douList.add(1.2);
        douList.add(2.4);
        for(int i=0;i<douList.size();i++)
        {
            System.out.print(douList.get(i)+"\t");
        }
        System.out.println();

        ArrayList<Student> stuList = new ArrayList<Student>();
        Student hong = new Student("홍길동","서울","010-1111-1111",2201,"컴소");
        stuList.add(hong);
        Student son = new Student("손흥민","유럽","010-2222-2222",2002,"체육");
        stuList.add(son);
        Student lee = new Student("이순신","서울","010-3333-3333",1601,"체육");
        stuList.add(lee);
        // Student 클래스에 있는 모든 정보를 출력
        for(int i=0;i<stuList.size();i++)
        {
            Student st = stuList.get(i);
            System.out.println(stuList.get(i).getName()+", "+stuList.get(i).getAddr()+", "+stuList.get(i).getPhone()+", "+stuList.get(i).getStuId()+", "+stuList.get(i).getJeongong());
            // System.out.println(st.getName()+", "+st.getAddr()+", "+st.getPhone()+", "+st.getStuId()+", "+st.getJeongong());
        }
        System.out.println();

        // student 중 서울사는 학생의 이름과 전화번호를 출력
        for(int i=0;i<stuList.size();i++)
        {
            if(stuList.get(i).getAddr() == "서울")
            {
                System.out.print(stuList.get(i).getName()+", "+stuList.get(i).getPhone());
                System.out.println();
            }
        }
        System.out.println();
        // student 중 전공이 체육인 학생의 이름과 전화번호를 출력
        for(int i=0;i<stuList.size();i++)
        {
            if(stuList.get(i).getJeongong().equals("체육"))
            {
                System.out.print(stuList.get(i).getName()+", "+stuList.get(i).getPhone());
                System.out.println();
            }
        }
    }
}
