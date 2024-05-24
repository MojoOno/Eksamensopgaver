import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;
    User currentUser;

    public Library(User user) {
        this.books = new ArrayList<Book>();
        this.currentUser = user;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void borrowBook(Book book) {
        currentUser.borrowBook(book);;
    }

    public void returnBook(Book book) {
        currentUser.returnBook(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
