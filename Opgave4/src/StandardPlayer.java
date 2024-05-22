public class StandardPlayer implements Player {
    String name;
    int points;

    public StandardPlayer(String name) {
        this.name = name;
        this.points = 0;
    }


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


    @Override
    public String toString() {
        return "Name: " + getName() + " - Points: " + getPoints();
    }
}



