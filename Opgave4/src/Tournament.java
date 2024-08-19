import java.util.List;

public class Tournament {
    private String name;
    private List<Player> playerList;

    // Constructor
    public Tournament(String name, List<Player> playerList) {
        this.name = name;
        this.playerList = playerList;
    }

    // Getters and setters
    public double getAverage() {
        if (playerList.isEmpty()) {
            return 0.0;
        }
        int totalPoints = 0;
        for (Player player : playerList) {
            totalPoints += player.getPoints();
        }
        return (double) totalPoints / playerList.size();
    }

    public void addPlayer(Player player){
        playerList.add(player);
    }

    // To string
    @Override
    public String toString() {
        return "Tournament Name: " + "\"" + name + "\"" + " - Average score: " + getAverage();
    }
}
