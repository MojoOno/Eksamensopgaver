import java.util.ArrayList;
import java.util.List;

public class User {
    public String name;
    public int userNumber;
    List<Book> borrowedBooks;


    // Constructor
    public User(String name, int userNumber, ArrayList<Book> borrowedBooks) {
        this.name = name;
        this.userNumber = userNumber;
        this.borrowedBooks = borrowedBooks;
    }

    // Adds a book to our list of books, changes it's borrowed status and then prints it.
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        book.setBorrowed(true);
        System.out.println("\"" + book.getTitle() + "\"" + " has been added to the borrowed list");
    }

    // Removes the book from our list, changes its borrowed status and the prints it.
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.setBorrowed(false);
        System.out.println("\"" + book.getTitle() + "\"" + " has been removed from the borrowed list");
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void getBorrowedBooks() {
        System.out.println(getName() + "'s borrowed books:");
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }
}
