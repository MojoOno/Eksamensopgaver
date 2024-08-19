import java.util.ArrayList;
import java.util.List;

public class Garden {
    private List<Plant> plantList = new ArrayList<>();

    // Constructor
    public Garden() {
    }

    public void addPlant(Plant plant) {
        plantList.add(plant);
    }

    // Calculates average yield of every fruit tree
    public float getTotalAverageYield() {
        float sum = 0;
        for (Plant plant : plantList) {
            if (plant instanceof FruitTree) {
                sum += ((FruitTree) plant).getAverageYield();
            }
        }
        return sum;
    }

    // Displays the flowers of the specified colour taken as input
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

    // Displays trees that are higher than the input meter
    public void displayTreesHigherThan(float meter) {
        boolean found = false;                  // before we go through our loop no trees has been found as a default.
        System.out.println("Trees higher than " + meter + " meters:");
        for (Plant plant : plantList) {
            if (plant instanceof Tree && ((Tree) plant).getHeight() >= meter) {
                System.out.println(plant);
                found = true;                   // If a tree was found, we're setting found to true.
            }
        }
        if (!found) {                           // if a tree was not found, we print a message stating no trees are above input
            System.out.println("There are no trees higher than " + meter + " meters:");
        }
    }
}



