public class Statistics {
    private Die die;    // declaring a die object

    // Constructor
    public Statistics(Die die) {
        this.die = die;
    }

    // Results method that throws a die, adds it to an Array, and counts amount of times a die has been rolled.
    public int[] results (int numberOfThrows){
        int sides = die.getSides();                 // Making a sides variable in order to make the code more generic
        int[] counts = new int[sides];              // Instantiating an array of ints, that contains dice eyes. Sides is used to determine the size of the array.

        // A for loop that loops "number of throws" amount of times.
        for(int i = 0; i < numberOfThrows; i++){
            int roll = die.throwDie();              // Rolls the die, and stores it in an array of Integers
            counts[roll - 1]++;                     // Here I tell my array of integers, that the roll I just rolled must be increased by 1.
                                                    // The reason for the "-1" is to add it to the right place in the array.
                                                    // Example: when we roll the die, the dice rolls a 5 fx. This I want to add to the fifth place in the array which is index 4.
                                                    // In order to place the roll 5 correctly, i minus by 1.
        }
        return counts;
    }

    // A method that uses my results method. Runs it through a loop in order to show how many times a fx 1 has been hit.
    public void displayResults(int numberOfThrows){
        int[] results = results(numberOfThrows);
        for (int i = 0; i < results.length; i++){
            System.out.println("Antal " + (i + 1) + "'ere: " + results[i]);
        }
    }

    // A method that gives us the expected amount of times we will roll one of the sides on the die.
    public void displayExpectedProbabilities(int numberOfThrows){
        double expectedAmount = numberOfThrows * ((double) 1 / die.getSides());
        double expectedProbability = expectedAmount / ((double) numberOfThrows) * 100;
        System.out.println("Expected probability of getting any given number on a " + die.getSides() + " sided die when throwing the die " + numberOfThrows + " times is: " + expectedAmount + " or " + expectedProbability + "%");
    }

}
