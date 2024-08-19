public class Item {
    private String description;
    private boolean isDone;


    // Constructor
    public Item(String description, boolean isDone){
        this.description = description;
        this.isDone = isDone;
    }

    // Getters and Setters
    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    // To string
    @Override
    public String toString() {
        return description + ", " + (isDone ? "Done" : "Not done");
    }

}
