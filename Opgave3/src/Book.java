public class Book {
    public String title;
    public String author;
    public boolean borrowed;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getBorrowed() {
        return borrowed;
    }

    public Book setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
        return this;
    }

    // To string
    @Override
    public String toString() {
        return "Title:      " + getTitle() + "\n" + "Author:     " + getAuthor() + "\n" + "Available:  " + (getBorrowed() ? "No" : "Yes") + "\n";
    }
}
