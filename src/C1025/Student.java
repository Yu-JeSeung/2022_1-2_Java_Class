package C1025;
/*
 * 20221020, 유제승, 10/25
 */
public class Student {
    String name;
    int studId;
    int age;
    String phone;

    public Student(){};
    public Student(String n,int i,int a,String r){
        this.name=n;
        this.studId=i;
        this.age=a;
        this.phone=r;
    }

    public void printStudent(){
        System.out.println("이름: "+this.name+" 학번: "+this.studId+" 나이: "+this.age+" 연락처: "+this.phone);
    }
}
