import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Making a user and library object
        User user = new User("Franck", 666, new ArrayList<>());
        Library library = new Library(user);


        // Making book objects
        Book book1 = new Book("Hitchhikers guide to passing the exam", "Andy the Dragon");
        Book book2 = new Book("Come get it", "Mike Tyson");
        Book book3 = new Book("How to steer a boat", "Captain Obvious");
        Book book4 = new Book("124", "Number Blind Bojack");
        Book book5 = new Book("I didn't do it", "Mette Frederiksen");

        // Adding and testing in main
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        System.out.println("----------");
        library.displayBooks();
        System.out.println("----------");

        library.borrowBook(book1);

        System.out.println("----------");

        user.getBorrowedBooks();

        System.out.println("----------");

        library.returnBook(book1);

        user.getBorrowedBooks();


    }
}