import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FruitTree extends Tree{
    private List<Float> yieldList;

    public FruitTree(String species, LocalDate datePlanted, float height) {
        super(species, datePlanted, height);
        this.yieldList = new ArrayList<>();
    }
    public void registerYield(float yield){
        this.yieldList.add(yield);


    }
    public float getAverageYield(){
        float averageYield = 0;
        for(float yield : this.yieldList){
            averageYield += yield;
        }
        return averageYield/this.yieldList.size();
    }

    @Override
    public String toString() {
        return "";
    }
}
