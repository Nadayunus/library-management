public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Book {
    private String title;
    private String author;
   public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
   public String getAuthor() {
        return author;
    }
}
