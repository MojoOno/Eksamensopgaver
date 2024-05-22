import java.util.List;

public class Team implements Player {
    String teamName;
    List<Player> playerList;

    public Team(String teamName, List<Player> playerList) {
        this.teamName = teamName;
        this.playerList = playerList;
    }

    @Override
    public int getPoints() {
        int totalPoints = 0;
        for (Player player : playerList) {
            totalPoints += player.getPoints();
        }
        return totalPoints;
    }

    public String getName() {
        return teamName;
    }

    @Override
    public void addPoints(double pointsToAdd) {
        int numPlayers = playerList.size();
        double splitPoints = pointsToAdd / numPlayers;
        for (Player player : playerList) {
            player.addPoints(customRound(splitPoints));
        }
    }
    private int customRound(double score) {
        if (score - (int) score < 0.6) {
            return (int) score;
        } else {
            return (int) score + 1;
        }
    }

    @Override
    public String toString() {

        return "\n" + "Team Name: " + getName() + " - Points: " + getPoints();
    }
}
