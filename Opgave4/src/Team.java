import java.util.List;

public class Team implements Player {
    private String teamName;
    private List<Player> playerList;

    // Constructor
    public Team(String teamName, List<Player> playerList) {
        this.teamName = teamName;
        this.playerList = playerList;
    }

    // Getters and setters
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

    public List<Player> getPlayerList() {
        return playerList;
    }

    @Override
    public void addPoints(double pointsToAdd) {
        int numPlayers = playerList.size();
        double splitPoints = pointsToAdd / numPlayers;
        for (Player player : playerList) {
            player.addPoints(customRound(splitPoints));
        }
    }

    // Method that rounds either up or down
    private int customRound(double score) {
        if (score - (int) score < 0.6) {
            return (int) score;
        } else {
            return (int) score + 1;
        }
    }


    public void displayTeamMembers(){
        System.out.println(teamName);
        for (Player player : playerList) {
            System.out.println(player);
        }
        System.out.println("Total points: " + getPoints());
    }

    // To string
    @Override
    public String toString() {
        return "\n" + "Team Name: " + getName() + " - Points: " + getPoints();
    }
}
