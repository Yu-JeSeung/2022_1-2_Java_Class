package C1025;
/*
 * 20221020, 유제승, 10/25
 */
public class Book {
    String title;
    String author;

    public Book(String t) {
        title=t;
        author="작가 미상";
    }

    public Book(String t, String a){ // String title  // String author
        title=t; // this.title = title
        author=a; // this.author = author
    }

    //기본 생성자
    public Book(){};

    public void printfBook(){
        System.out.println(title+", "+author); // this.title  //this.author
    }
}
