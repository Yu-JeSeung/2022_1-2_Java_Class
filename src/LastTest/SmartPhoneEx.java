package LastTest;

import java.util.ArrayList;
import java.util.Scanner;

//1. ArrayList<SmartPhone> 에 객체를 넣습니다.
// 2. 삼성전자 제품만 출력하시오.
// 3. 애플 제품만 출력하시오.
// 4. 가격이 100만원 이상인 제품의 제품명과 가격을 출력하시오.
// 5. 만들어진 객체수를 출력하시오.
// 갤럭시 s20, 삼성전자(100), 300000, 안드로이드(1), 256
// 샤오미레드미, 샤오미(300), 260000, 안드로이드(1), 128
// 갤럭시 s22, 삼성전자(100), 700000, 안드로이드(1), 256
// 갤럭시 s21+, 삼성전자(100), 550000, 안드로이드(1), 256
// 아이폰14, 애플, 1600000, ios, 128
// 아이폰13, 애플, 1000000, ios, 128

class define{
    public static final int SAMSUNG = 100;
    public static final int APPLE = 200;
    public static final int XIAOMI = 300;
    public static final int ANDROID = 1;
    public static final int IOS = 2;
}

class Phone{
    static int count;

    private String name;
    private int maker;
    private int price;

    public Phone() {
        count++;
    }
    public Phone(String name, int maker, int price) {
        super();
        this.name = name;
        this.maker = maker;
        this.price = price;
        count++;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMaker() {
        return maker;
    }
    public void setMaker(int maker) {
        this.maker = maker;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    };
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "name: "+name+" maker: "+maker+" price: "+price;
    }

}

interface PhoneInterface{
    void sendCall();
    void reciveCall();
}

class SmartPhone extends Phone implements PhoneInterface{

    private int osType;
    private int memSize;

    public SmartPhone() {};
    public SmartPhone(String name,int maker, int price, int osType, int memSize) {
        super(name,maker,price);
        this.osType = osType;
        this.memSize = memSize;
    }

    @Override
    public void sendCall() {
        // TODO Auto-generated method stub
        System.out.println("전화를 겁니다...");
    }

    @Override
    public void reciveCall() {
        // TODO Auto-generated method stub
        System.out.println("전화를 받습니다...");
    }
    public int getOsType() {
        return osType;
    }
    public void setOsType(int osType) {
        this.osType = osType;
    }
    public int getMemSize() {
        return memSize;
    }
    public void setMemSize(int memSize) {
        this.memSize = memSize;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+" osType: "+osType+" memSize: "+memSize;
    }

}

public class SmartPhoneEx {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        ArrayList<SmartPhone> smList = new ArrayList<>();
        boolean stop = true;
        while(stop) {
            String name = scanner.next();
            int maker = scanner.nextInt();
            int price = scanner.nextInt();
            int osType = scanner.nextInt();
            int memSize = scanner.nextInt();

            SmartPhone s1 = new SmartPhone(name,maker,price,osType,memSize);
            smList.add(s1);

            System.out.println("종료?? [true/false]");
            stop=scanner.nextBoolean();
        }

        System.out.println("====================20221020 유제승========================");
        for(int i=0;i<smList.size();i++) {
            SmartPhone s2 = smList.get(i);
            System.out.println(s2);
        }
        System.out.println("총 만들어진 폰의 갯수: "+Phone.count);
    }

}

