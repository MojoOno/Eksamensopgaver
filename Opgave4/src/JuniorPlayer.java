
// Implements the interface, meaning it must have the same methods as Interface
public class JuniorPlayer implements Player {
    private String name;
    private int points;

    // Constructor
    public JuniorPlayer(String name) {
        this.name = name;
        this.points = 0;
    }

    // Getters and setters
    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addPoints(double pointsToAdd) {
        double score = pointsToAdd * 1.5;
        score = customRound(score);
        points += score;
    }

    // Method that rounds either up or down
    private int customRound(double score) {
        if (score - (int) score < 0.6) {
            return (int) score;
        } else {
            return (int) score + 1;
        }
    }

    // To string
    @Override
    public String toString() {
        return "Name: " + getName() + " - Points: " + getPoints();
    }

}
