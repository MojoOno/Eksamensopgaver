public class Book {
    public String title;
    public String author;
    public boolean borrowed;

    public Book(String title, String author, boolean borrowed) {
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

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

    @Override
    public String toString() {
        return "Title:      " + getTitle() + "\n" + "Author:     " + getAuthor() + "\n" + "Available:  " + (getBorrowed() ? "No" : "Yes") + "\n";
    }
}
