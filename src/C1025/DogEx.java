package C1025;

public class DogEx {
    public static void main(String[] args) {

        Dog ssong=new Dog("숑이",3,"푸들","실버");
        Dog marin = new Dog();
        marin.age = 8;
        marin.breed = "비숑프리제";
        marin.name = "마린이";
        marin.color = "흰색";


        System.out.println("1번 강아지의 이름 : " + ssong.name + " " + " 나이 : " + ssong.age + " " + " 색깔 : " + ssong.color + " " + " 견종 : " + ssong.breed);
        System.out.println(ssong.name + "를 건드리면 " + ssong.barking());
        System.out.println(ssong.name + "에게 밥을 안주면 " + ssong.hungry());
        System.out.println(ssong.name + "는 항상 " + ssong.sleeping());
        System.out.println("");
        System.out.println("2번 강아지의 이름 : " + marin.name + " " + " 나이 : " + marin.age + " " + " 색깔 : " + marin.color + " " + " 견종 : " + marin.breed);
        System.out.println(marin.name + "를 건드리면 " + marin.barking());
        System.out.println(marin.name + "에게 밥을 안주면 " + marin.hungry());
        System.out.println(marin.name + "는 항상 " + marin.sleeping());
    }
}
