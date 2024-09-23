
package LibraryManagementSystem ;

class Book {

    String title ;
    String author ;
    String isbn ;
    boolean isAvailable ;

    public Book(String title,String author,String isbn) {
        this.title = title ;
        this.author = author ;
        this.isbn = isbn ;
        isAvailable = true ;
    }

    public void borrowBook() {
        if(isAvailable) {
            isAvailable = false ;
            System.out.println("Book borrowed successfully .");
        }
        else {
            System.out.println("Book is currently unavailable !");
        }
    }

    public void returnBook() {
        isAvailable = true ;
        System.out.println("Book returned successfully .");
    }

}