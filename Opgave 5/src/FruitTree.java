import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FruitTree extends Tree{
    private List<Float> yieldList;

    // Constructor
    public FruitTree(String species, LocalDate datePlanted, float height) {
        super(species, datePlanted, height);
        this.yieldList = new ArrayList<>();
    }

    // Adds yield to my yieldList
    public void registerYield(float yield){
        this.yieldList.add(yield);
    }

    // Runs through all the data in yieldList and gives me the average
    public float getAverageYield(){
        float averageYield = 0;
        for(float yield : this.yieldList){
            averageYield += yield;
        }
        return averageYield/this.yieldList.size();
    }

    // To String
    @Override
    public String toString() {
        return "Fruit Tree: " + getSpecies() + " -- Meters high: " + getHeight() + " -- Average yield: " + getAverageYield() + " -- Planted: " + getDatePlanted();
    }
}
