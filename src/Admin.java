public class Admin extends User {
    private static final int MAX_BOOKS = 100;
    private Book[] books = new Book[MAX_BOOKS];
    private int bookCount = 0;

    public Admin(String name) {
        super(name);
        addBook("The Alchemist", "Paulo Coelho");
        addBook("Atomic Habits", "James Clear");
        addBook("My Story", "Kamala Das");
        addBook("From Zero to Hero", "Dan Lok");
        addBook("The Garbage King", "Elizabeth Laird");
    }
  public void addBook(String title, String author) {
        if (bookCount < MAX_BOOKS) {
            books[bookCount] = new Book(title, author);
            bookCount++;
            System.out.println("Book added: " + title + " by " + author);
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }
    public void searchBook(String title) {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("\nBook found:");
                System.out.println("Title: " + books[i].getTitle());
                System.out.println("Author: " + books[i].getAuthor());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found in the library.");
        }
    }
    public void displayAllBooks() {
        if (bookCount == 0) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("\n List of Books ");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("Title: " + books[i].getTitle());
            System.out.println("Author: " + books[i].getAuthor());
            System.out.println("     ");
        }
    }
}
