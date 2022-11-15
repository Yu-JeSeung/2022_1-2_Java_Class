package C1115;

public class B1 extends A1{
    public B1(){
        System.out.println("생성자B");
    }
    public B1(int x){
        super(x);
        System.out.println("매개변수생성자B"+x);
    }
}
