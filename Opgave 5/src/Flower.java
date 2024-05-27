import java.time.LocalDate;

public class Flower extends Plant{
    private String colour;

    // Constructor
    public Flower(String species, LocalDate datePlanted, String colour) {
        super(species, datePlanted);
        this.colour = colour;
    }


    // Getters and setters
    public String getColour() {
        return colour;
    }

    // To string
    @Override
    public String toString() {
        return "Flower: " + getSpecies() + " Colour: " + getColour() + " Planted: " + getDatePlanted();
    }
}
