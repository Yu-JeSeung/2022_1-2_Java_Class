package C1122;
/*
 * 20221020, 유제승, 11/22
 */
public class InterfaceEx {
    public static void main(String[] args) {
        SsPhone s1 = new SsPhone("갤럭시22","010-1111-2222");
        s1.sendCall();
        s1.receiveCall();
        Iphone i1 = new Iphone();
        i1.sendCall();
        i1.receiveCall();
    }
}
