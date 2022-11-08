package C1108;

public class StudentEx {
    public static void main(String[] args) {
        System.out.println(Student.count);

        Student kim = new Student("김구","2201",20);
        kim.printStudent();

        Student kang = new Student("강감찬","2202",22);
        kang.printStudent();

        Student Iu = new Student("아이유","2203",21);
        Iu.printStudent();

        Student jenny = new Student("제니","2204",21);
        jenny.printStudent();

        System.out.println(Student.count);
    }
}
