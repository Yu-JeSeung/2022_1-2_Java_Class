package C1025;
/*
 * 20221020, 유제승, 10/25
 */
public class Dog {
    String name;
    int age;
    String breed;
    String color;

    public Dog(){};
    public Dog(String n,int a,String b,String c){
        this.name=n;
        this.age=a;
        this.breed=b;
        this.color=c;
    }
    public String barking()
    {
        return "멍멍 짖는다.";
    }

    public String hungry()
    {
        return "배고파요.";
    }

    public String sleeping()
    {
        return "ZZzz....";
    }
}
