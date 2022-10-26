package C1025;

public class TvEx {
    public static void main(String[] args) {
        Tv samsung=new Tv("삼성","SBS",200);
        Tv LG=new Tv();
        LG.model="LG";
        LG.channel="MBC";
        LG.volume=150;

        samsung.turnOn();
        samsung.turnOff();
        samsung.channelChange();
        samsung.volumeUp();
        System.out.println("");
        LG.turnOn();
        LG.turnOff();
        LG.channelChange();
        LG.volumeUp();
    }
}
