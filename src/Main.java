import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin("Admin User");

        while (true) {
            System.out.println("\n Library System ");
            System.out.println("1. Login as Admin");
            System.out.println("2. Search for a Book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Admin Menu ---");
                    System.out.println("1. Add a Book");
                    System.out.println("2. View All Books");
                    System.out.println("3. Logout");
                    System.out.print("Enter your choice: ");
                    int adminChoice = scanner.nextInt();
                    scanner.nextLine();

                    switch (adminChoice) {
                        case 1:
                            System.out.print("Enter book title: ");
                            String title = scanner.nextLine();
                            System.out.print("Enter book author: ");
                            String author = scanner.nextLine();
                            admin.addBook(title, author);
                            break;
                        case 2:
                            admin.displayAllBooks();
                            break;
                        case 3:
                            System.out.println("Logged out as Admin.");
                            break;
                        default:
                            System.out.println("Invalid admin choice.");
                    }
                    break;

                case 2:
                    System.out.print("Enter the title of the book to search: ");
                    String searchTitle = scanner.nextLine();
                    admin.searchBook(searchTitle);
                    break;

                case 3:
                    System.out.println("Exiting application. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid main menu choice.");
            }
        }
    }
}
