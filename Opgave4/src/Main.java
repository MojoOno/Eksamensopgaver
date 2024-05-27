import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("Slubberterne", new ArrayList<>());
        Tournament tournament = new Tournament("Den store dyre look a-like turnering", new ArrayList<>());
        Player juniorPlayer = new JuniorPlayer("Høgen");
        Player juniorPlayer2 = new JuniorPlayer("Oksen");
        Player standardPlayer = new StandardPlayer("Ørnen");
        Player standardPlayer2 = new StandardPlayer("Hunden");

        team.playerList.add(juniorPlayer);
        team.playerList.add(juniorPlayer2);
        team.playerList.add(standardPlayer);
        team.playerList.add(standardPlayer2);

        juniorPlayer.addPoints(10);
        juniorPlayer.addPoints(15);
        juniorPlayer.addPoints(7);

        standardPlayer.addPoints(10);
        standardPlayer.addPoints(15);
        standardPlayer.addPoints(7);

        team.addPoints(8);

        tournament.addPlayer(standardPlayer);
        tournament.addPlayer(standardPlayer2);
        //tournament.addPlayer(juniorPlayer);

        System.out.println(juniorPlayer);
        System.out.println(juniorPlayer2);
        System.out.println(standardPlayer);
        System.out.println(standardPlayer2);
        System.out.println(team);
        System.out.println(tournament);

    }
}