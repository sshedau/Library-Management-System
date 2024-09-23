
package LibraryManagementSystem ;
import java.util.ArrayList ;

class Library {

    ArrayList<Book> books = new ArrayList<>() ;

    public void addBook(Book book) {
        books.add(book) ;
        System.out.println("Book : " + book + " added successfully .");
    }

    public void searchBook(String title) {
        for(Book book : books) {
            if(title.equalsIgnoreCase(book.title)) {
                System.out.println("Book : " + book.title + " found , by " + book.author);
                return ;
            }
        }
        System.out.println("Book : " + title + " not found ");
    }

    public void borrowBook(String isbn) {
        for(Book book : books) {
            if(isbn.equals((book.isbn))) {
                book.borrowBook() ;
                return ;
            }
        }
        System.out.println("Book cannot be borrowed !");
    }

    public void returnBook(String isbn) {
        for(Book book : books) {
            if(isbn.equals((book.isbn))) {
                book.returnBook() ;
                return ;
            }
        }
        System.out.println("Book cannot bs returned !");
    }

}
