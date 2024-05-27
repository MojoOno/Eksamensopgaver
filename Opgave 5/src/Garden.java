import java.util.ArrayList;
import java.util.List;

public class Garden {
    private List<Plant> plantList = new ArrayList<>();

    public Garden() {
    }

    public void addPlant(Plant plant) {
        plantList.add(plant);
    }

    public float getTotalAverageYield() {
        float sum = 0;
        for (Plant plant : plantList) {
            if (plant instanceof FruitTree) {
                sum += ((FruitTree) plant).getAverageYield();
            }
        }
        return sum;
    }

    public void displayFlowersOfColour(String colour) {
        System.out.println("The flowers of colour " + colour + " are:");
        for (Plant plant : plantList) {
            if (plant instanceof Flower) {
                if (((Flower) plant).getColour().equalsIgnoreCase(colour)) {
                    System.out.println(plant);
                }
            }
        }

    }

    public void displayTreesHigherThan(float meter) {
        boolean found = false;
        System.out.println("Trees higher than " + meter + " meters:");
        for (Plant plant : plantList) {
            if (plant instanceof Tree && ((Tree) plant).getHeight() >= meter) {
                System.out.println(plant);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Trees not higher than " + meter + " meters:");
        }
    }

    public Plant getOldestPlant() {
        return null;
    }

    public void displayPlants(){
        for (Plant plant : plantList) {
            System.out.println(plant);
        }

    }
}



