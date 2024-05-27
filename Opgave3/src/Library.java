import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;
    User currentUser;

    // Constructor
    public Library(User user) {
        this.books = new ArrayList<Book>();
        this.currentUser = user;
    }

    // Adds books to the library's selection of books
    public void addBook(Book book) {
        this.books.add(book);
    }

    // Calls the users borrow book method.
    public void borrowBook(Book book) {
        currentUser.borrowBook(book);;
    }

    // Calls the users return book method
    public void returnBook(Book book) {
        currentUser.returnBook(book);
    }

    // Displays books in the library.
    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
