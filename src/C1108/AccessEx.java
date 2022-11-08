package C1108;
/*
 * 20221020, 유제승, 11/08
 */
class Sample{
    public int a;
    private int b;
    int c;
    protected int d;
    public Sample(){};
    public Sample(int a,int b,int c,int d)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
}

public class AccessEx {
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a=10;
        // aClass.b=10;
        aClass.c=10;
        aClass.d=10;
    }
}
