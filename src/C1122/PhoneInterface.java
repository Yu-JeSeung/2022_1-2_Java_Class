package C1122;
/*
 * 20221020, 유제승, 11/22
 */
public interface PhoneInterface {
    public final int TIMEOUT = 100000;
    void sendCall();
    public abstract void receiveCall();
}

class SsPhone implements PhoneInterface{
    // 1 필드
    private String model;
    private String phoneNo;

    // 2 생성자
    public SsPhone(){};
    public SsPhone(String model, String phoneNo){
        this.model=model;
        this.phoneNo=phoneNo;
    }
    // 3 메소드
    @Override
    public void sendCall() {
        System.out.println("삼성폰 띠리리링~~~");
    }

    @Override
    public void receiveCall() {
        System.out.println("삼성폰 전화왔어요~~");
    }
}
class Iphone implements PhoneInterface{

    @Override
    public void sendCall() {
        System.out.println("아이폰 띠리리링~~~");
    }

    @Override
    public void receiveCall() {
        System.out.println("아이폰 전화왔어요....");
    }
}