public class Item {
    public String description;
    public boolean isDone;

    public Item(){

    }

    public Item(String description, boolean isDone){
        this.description = description;
        this.isDone = isDone;
    }

    public void markAsDone(){
        isDone = true;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return description + ", " + (isDone ? "Done" : "Not done");
    }

}
