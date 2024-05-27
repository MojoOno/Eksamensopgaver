
// Implements the interface, meaning it must have the same methods as Interface
public class StandardPlayer implements Player {
    String name;
    int points;

    // Constructor
    public StandardPlayer(String name) {
        this.name = name;
        this.points = 0;
    }


    // Getters and Setters
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
        points += (int) pointsToAdd;
    }


    // To string
    @Override
    public String toString() {
        return "Name: " + getName() + " - Points: " + getPoints();
    }
}



