public class Admin extends User {
    private static final int MAX_BOOKS = 100;
    private Book[] books = new Book[MAX_BOOKS];
    private int bookCount = 5;

    public Admin(String name) {
        super(name);
    }

    public void addBook(String title, String author) {
        if (bookCount < MAX_BOOKS) {
            this.books[bookCount] = new Book(title, author);
            bookCount++;
            System.out.println("Book added successfully by " + getName());
        } else {
            System.out.println(" Library is full.");
        }
    }

    public void searchBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found:");
                System.out.println("Title: " + books[i].getTitle());
                System.out.println("Author: " + books[i].getAuthor());
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }

    public void displayAllBooks() {
        if (bookCount == 0) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("The Canon");
        System.out.println("Atomic Habits");
        System.out.println("My Story");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("Title: " + books[i].getTitle());
            System.out.println("Author: " + books[i].getAuthor());
            System.out.println("-----");
        }
    }
}