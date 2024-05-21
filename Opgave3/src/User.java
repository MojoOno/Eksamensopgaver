import java.util.ArrayList;
import java.util.List;

public class User {
    public String name;
    public int userNumber;
    List<Book> borrowedBooks;
    Library library = new Library(this);

    public User() {

    }

    public User(String name, int userNumber, ArrayList<Book> borrowedBooks) {
        this.name = name;
        this.userNumber = userNumber;
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        book.setBorrowed(true);
        System.out.println(book + " has been added to the borrowed list");
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.setBorrowed(false);
        System.out.println(book + " has been removed from the borrowed list");
    }

    public String getName() {
        return name;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void getBorrowedBooks() {
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }
}
