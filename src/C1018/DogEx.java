package C1018;

public class DogEx {
    public static void main(String[] args) {
        Dog bbubbu = new Dog();
        bbubbu.age=2;
        bbubbu.breed="토이푸들";
        bbubbu.name="뿌뿌";
        bbubbu.color="갈색";

        Dog marin = new Dog();
        marin.age=8;
        marin.breed="비숑프리제";
        marin.name="마린이";
        marin.color="흰색";

        System.out.println("1번 강아지의 이름 : "+bbubbu.name+" "+" 나이 : "+bbubbu.age+" "+" 색깔 : "+bbubbu.color+" "+" 견종 : "+bbubbu.breed);
        System.out.println(bbubbu.name+"를 건드리면 "+bbubbu.barking());
        System.out.println(bbubbu.name+"에게 밥을 안주면 "+bbubbu.hungry());
        System.out.println(bbubbu.name+"는 항상 "+bbubbu.sleeping());
        System.out.println("");

        System.out.println("2번 강아지의 이름 : "+marin.name+" "+" 나이 : "+marin.age+" "+" 색깔 : "+marin.color+" "+" 견종 : "+marin.breed);
        System.out.println(marin.name+"를 건드리면 "+marin.barking());
        System.out.println(marin.name+"에게 밥을 안주면 "+marin.hungry());
        System.out.println(marin.name+"는 항상 "+marin.sleeping());
    }
}
