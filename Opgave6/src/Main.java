public class Main {
    public static void main(String[] args) {
        Die die = new Die(6);
        Statistics stats = new Statistics(die);

        stats.displayResults();



    }
}