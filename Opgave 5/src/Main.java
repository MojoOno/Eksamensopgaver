import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();


        //Making new plant objects
        Plant tree1 = new Tree("Oak", LocalDate.of(1964,6,4), 20f);
        Plant tree2 = new Tree("Sakura", LocalDate.of(1977,6,4), 7f);
        Plant tree3 = new Tree("Bonzai", LocalDate.of(1977,6,4), 1f);


        FruitTree fruitTree1 = new FruitTree("Apple Tree", LocalDate.of(1945, 3, 15), 5f);
        Plant fruitTree2 = new FruitTree("Plum Tree", LocalDate.of(1945, 3, 15), 4.5f);

        Plant flower1 = new Flower("My favourite red Rose", LocalDate.of(2023, 7, 20), "Red");
        Plant flower2 = new Flower("My second favourite red Rose", LocalDate.of(2023, 7, 20), "Red");
        Plant flower3 = new Flower("Mr. White Rose", LocalDate.of(2023, 7, 20), "White");
        Plant flower4 = new Flower("I used to be a red Rose", LocalDate.of(2023, 7, 20), "White");
        Plant flower5 = new Flower("I'm just here for the water Rose", LocalDate.of(2023, 7, 20), "Violet");
        Plant flower6 = new Flower("Rose Room", LocalDate.of(2023, 7, 20), "Violet");

        // Adding plants to my garden
        garden.addPlant(tree1);
        garden.addPlant(tree2);
        garden.addPlant(tree3);
        garden.addPlant(fruitTree1);
        garden.addPlant(fruitTree2);
        garden.addPlant(flower1);
        garden.addPlant(flower2);
        garden.addPlant(flower3);
        garden.addPlant(flower4);
        garden.addPlant(flower5);
        garden.addPlant(flower6);

        //Registering yield of my fruit trees
        fruitTree1.registerYield(10f);
        fruitTree1.registerYield(15f);
        fruitTree1.registerYield(7f);

        ((FruitTree) fruitTree2).registerYield(4f);
        ((FruitTree) fruitTree2).registerYield(6f);
        ((FruitTree) fruitTree2).registerYield(7f);

        // Total average yield print
        System.out.println("Total yield of fruit on average is: " + garden.getTotalAverageYield() + "kg");

        // Display flowers of colour
        System.out.println("----------");
        garden.displayFlowersOfColour("Red");
        System.out.println("----------");
        garden.displayFlowersOfColour("White");
        System.out.println("----------");
        garden.displayFlowersOfColour("Violet");
        System.out.println("----------");

        // Display trees higher than input
        garden.displayTreesHigherThan(4);
        System.out.println("----------");

        //garden.displayPlants();






    }
}