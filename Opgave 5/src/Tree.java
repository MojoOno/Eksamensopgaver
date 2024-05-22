import java.time.LocalDate;

public class Tree extends Plant{
    private float height;


    public Tree(String species, LocalDate datePlanted, float height) {
        super(species, datePlanted);
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "";
    }
}
