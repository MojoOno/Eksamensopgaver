import java.util.ArrayList;
import java.util.List;

public class Garden {
    private List<Plant> plantList = new ArrayList<>();

    public Garden(){
    }

    public void addPlant(Plant plant){
        plantList.add(plant);
    }

    public float getTotalYield(){
        float sum = 0;
        for(Plant plant: plantList){
            if (plant instanceof FruitTree){
                sum += ((FruitTree) plant).getAverageYield();

            }
        }
        System.out.println("Total yield of fruit is: " + sum + "kg");
        return sum;
    }

    public void displayFlowersOfColour(String colour){
        System.out.println("The flowers of colour " + colour + " are:");
        for(Plant plant : plantList){
            if (plant instanceof Flower){
                if(((Flower) plant).getColour().equalsIgnoreCase(colour)){
                    System.out.println("Flower: " + plant.getSpecies() + " planted on " + plant.getDatePlanted());
                }
            }
        }

    }

    public int getTreesHigherThan(float meter){
        return 0;
    }

    public Plant getOldestPlant(){
        return null;
    }
}
