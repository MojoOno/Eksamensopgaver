import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Making new objects
        Team team = new Team("Slubberterne", new ArrayList<>());
        Team team2 = new Team("Taberne", new ArrayList<>());

        Tournament tournament = new Tournament("Den store dyre look a-like turnering", new ArrayList<>());

        Player juniorPlayer = new JuniorPlayer("Høgen");
        Player juniorPlayer2 = new JuniorPlayer("Oksen");
        Player standardPlayer = new StandardPlayer("Ørnen");
        Player standardPlayer2 = new StandardPlayer("Hunden");

        // Adding players to
        team.getPlayerList().add(juniorPlayer);
        team2.getPlayerList().add(juniorPlayer2);
        team.getPlayerList().add(standardPlayer);
        team2.getPlayerList().add(standardPlayer2);

        // Adding points to junior players
        juniorPlayer.addPoints(10);
        juniorPlayer.addPoints(15);
        juniorPlayer2.addPoints(7);

        // Adding points to standard players
        standardPlayer.addPoints(10);
        standardPlayer.addPoints(15);
        standardPlayer2.addPoints(7);

        // Adding points to team
        team.addPoints(8);

        //Adding players to tournament
        tournament.addPlayer(standardPlayer);
        tournament.addPlayer(standardPlayer2);
        //tournament.addPlayer(juniorPlayer);

        //Sout testing
        System.out.println(juniorPlayer);
        System.out.println(juniorPlayer2);
        System.out.println(standardPlayer);
        System.out.println(standardPlayer2);

        System.out.println("----------");
        team.displayTeamMembers();
        team2.displayTeamMembers();
        System.out.println("----------");

        System.out.println(tournament);
        System.out.println("----------");


    }
}