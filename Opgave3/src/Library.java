import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList;
    private User currentUser;

    // Constructor
    public Library(User user) {
        this.bookList = new ArrayList<>();
        this.currentUser = user;
    }

    // Adds books to the library's selection of books
    public void addBook(Book book) {
        this.bookList.add(book);
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
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}
