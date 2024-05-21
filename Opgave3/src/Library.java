import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;

    public Library(User user) {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void borrowBook(Book book) {
        this.books.remove(book);
    }

    public void returnBook(Book book) {
        this.books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
