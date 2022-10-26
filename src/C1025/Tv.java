package C1025;

public class Tv {
    String model;
    String channel;
    int volume;

    public Tv(){};
    public Tv(String m,String c,int v){
        this.model=m;
        this.channel=c;
        this.volume=v;
    }

    public void turnOn(){
        System.out.println(this.model+"의 전원을 킨다.");
    }
    public void turnOff(){
        System.out.println(this.model+"의 전원을 끈다.");
    }
    public void channelChange(){
        System.out.println(this.channel+"채널을 돌린다.");
    }
    public void volumeUp(){
        System.out.println(this.volume+"소리를 키운다.");
    }
}
