import java.time.LocalDate;

public class Plant {
    private String species;
    private LocalDate datePlanted;

    // Constructor
    public Plant(String species, LocalDate datePlanted) {
        this.species = species;
        this.datePlanted = datePlanted;
    }

    // Getters and Setters
    public String getSpecies() {
        return species;
    }

    public LocalDate getDatePlanted() {
        return datePlanted;
    }
}
