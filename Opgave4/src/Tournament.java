import java.util.List;

public class Tournament {
    String name;
    List<Player> players;

    // Constructor
    public Tournament(String name, List<Player> players) {
        this.name = name;
        this.players = players;
    }

    // Getters and setters
    public double getAverage() {
        if (players.isEmpty()) {
            return 0.0;
        }
        int totalPoints = 0;
        for (Player player : players) {
            totalPoints += player.getPoints();
        }
        return (double) totalPoints / players.size();
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    // To string
    @Override
    public String toString() {
        return "Tournament Name: " + "\"" + name + "\"" + " - Average score: " + getAverage();
    }
}
