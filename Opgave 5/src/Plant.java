import java.time.LocalDate;

public class Plant {
    private String species;
    private LocalDate datePlanted;


    public Plant(String species, LocalDate datePlanted) {
        this.species = species;
        this.datePlanted = datePlanted;
    }

    public String getSpecies() {
        return species;
    }

    public LocalDate getDatePlanted() {
        return datePlanted;
    }
}
