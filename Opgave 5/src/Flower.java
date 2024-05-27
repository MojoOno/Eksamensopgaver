import java.time.LocalDate;

public class Flower extends Plant{
    private String colour;

    public Flower(String species, LocalDate datePlanted, String colour) {
        super(species, datePlanted);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Flower: " + getSpecies() + " Colour: " + getColour() + " Planted: " + getDatePlanted();
    }
}
