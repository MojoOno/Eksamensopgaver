import java.time.LocalDate;

public class Tree extends Plant{
    private float height;

    // Constructor
    public Tree(String species, LocalDate datePlanted, float height) {
        super(species, datePlanted);
        this.height = height;
    }

    // Getters and setters
    public float getHeight() {
        return height;
    }

    // To string
    @Override
    public String toString() {
        return "Tree: " + getSpecies() + " -- Meters high: " + getHeight() + " -- Planted: " + getDatePlanted();
    }
}
