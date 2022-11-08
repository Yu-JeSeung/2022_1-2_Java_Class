package C1108;
/*
 * 20221020, 유제승, 11/08
 */
public class Book {
    // 1. 필드
    String title;
    String author;
    // 2. 생성자
    public Book(){};

    public Book(String title){
        this(title,"작가미상");
    };

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    // 3, 메소드
    void show(){
        System.out.println(title+" , "+author);
    }
}
