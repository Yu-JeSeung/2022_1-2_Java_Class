package C1115;

public class Magazine extends Book{
    public Magazine() {};
    String date;
    public Magazine(String title, String author, int page, String date) {
        super(title, author, page);
        this.date=date;
    }

    public void magaPrint() {
        System.out.println(title + ", " + author + ", " + page + ", "+date);
    }

}
