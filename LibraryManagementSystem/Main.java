package LibraryManagementSystem;
import java.util.Scanner ;

class Main {
    public static void main(String[] args) {
        
        Library library = new Library() ;
        Scanner sc = new Scanner(System.in) ;

        library.addBook(new Book("Atomic Habits", "James Clear", "12345")) ;
        library.addBook(new Book("The Power of your subconscious mind", " Joseph Murphy", "67890")) ;

        while (true) {

            System.out.println("\n Library Menu :");
            System.out.println("1. Search Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Add a Book");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.print("Enter title to search : ");
                    String searchTitle = sc.nextLine();
                    library.searchBook(searchTitle);
                    break;

                case 2:
                    System.out.print("Enter ISBN to borrow : ");
                    String borrowISBN = sc.nextLine();
                    library.borrowBook(borrowISBN);
                    break;

                case 3:
                    System.out.print("Enter ISBN to return : ");
                    String returnISBN = sc.nextLine();
                    library.returnBook(returnISBN);
                    break;

                case 4:
                    System.out.print("Enter book title : ");
                    String title = sc.nextLine();
                    System.out.print("Enter book author : ");
                    String author = sc.nextLine();
                    System.out.print("Enter book ISBN : ");
                    String isbn = sc.nextLine();
                    library.addBook(new Book(title, author, isbn));
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return ;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

    }

}

