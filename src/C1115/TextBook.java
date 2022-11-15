package C1115;

public class TextBook extends Book{
    String hakgi;
    String grade;

    public TextBook() {}
    public TextBook(String title, int page, String author, String hakgi, String grade) {
        super(title, author, page);
        this.hakgi = hakgi;
        this.grade = grade;
    }

    public void printTextBook() {
        System.out.println(title + ", " + page + ", " + author + ", " + hakgi + ", " + grade);
    }
}
