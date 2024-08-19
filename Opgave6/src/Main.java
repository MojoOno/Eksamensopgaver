public class Main {
    public static void main(String[] args) {

        // Making objects
        Die die = new Die(20);
        Statistics stats = new Statistics(die);


        //Calling methods and prints
        stats.displayResults(1);

        System.out.println("----------");

        stats.displayExpectedProbabilities(1);


    }
}