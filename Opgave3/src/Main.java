import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user = new User("Franck", 666, new ArrayList<>());
        Library library = new Library(user);

        Book book1 = new Book("How to write an exam question for beginners", "Andy the Dragon", false);
        Book book2 = new Book("Come get it", "Mike Tyson", false);
        Book book3 = new Book("How to steer a boat", "Captain Obvious", false);
        Book book4 = new Book("123", "456", false);
        Book book5 = new Book("Where am I?", "Mette Frederiksen", false);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        user.library.borrowBook(book1.setBorrowed(true));

        System.out.println("----------");
        library.displayBooks();


    }
}