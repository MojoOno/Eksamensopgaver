public class JuniorPlayer implements Player {
    String name;
    int points;

    public JuniorPlayer(String name){
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
        double score = pointsToAdd * 1.5;
        score = customRound(score);
        points += score;

    }

    //Metode der runder op eller ned
    private int customRound(double score) {
        if (score - (int) score < 0.6) {
            return (int) score;
        } else {
            return (int) score + 1;
        }
    }

    @Override
    public String toString(){
        return "Name: " + getName() + " - Points: " + getPoints();
    }

}
