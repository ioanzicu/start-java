package com.ioan;

import java.time.temporal.Temporal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        FootbalPlayer grong = new FootbalPlayer("Grong");
//        BaseballPlayer brad = new BaseballPlayer("Brad");
//        SoccerPlayer jim = new SoccerPlayer("Jim");

//        Team<FootbalPlayer> blueCrowns = new Team<>("Blue Crows");
//        blueCrowns.addPlayer(grong);
//        blueCrowns.addPlayer(brad);
//        blueCrowns.addPlayer(jim);

//        System.out.println(blueCrowns.numPlayers());
//
//        Team<BaseballPlayer> baseballTeam = new Team<>("Red Skins");
//        baseballTeam.addPlayer(brad);
//
//        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
//        brokenTeam.addPlayer(jim);
//
//        Team<FootbalPlayer> melbourne = new Team<>("Melbourne");
//        FootbalPlayer banks = new FootbalPlayer("Gordon");
//        melbourne.addPlayer(banks);
//
//        Team<FootbalPlayer> hawthorn = new Team<>("Hawthorn");
//        Team<FootbalPlayer> fremantle = new Team<>("Fremantle");
//
//        hawthorn.matchResult(fremantle, 1, 0);
//        hawthorn.matchResult(blueCrowns, 3, 5);
//
//        blueCrowns.matchResult(fremantle, 2, 1);
//        blueCrowns.matchResult(hawthorn, 1, 1);
//
//        System.out.println("Ranking");
//        System.out.println(blueCrowns.getName() + ": " + blueCrowns.ranking());
//        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
//        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
//        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());
//
//        System.out.println(melbourne.compareTo(hawthorn));
//        System.out.println(blueCrowns.compareTo(hawthorn));

        League<Team<FootbalPlayer>> footballLeague = new League<>("AFL");
        Team<FootbalPlayer> blueCrowns = new Team<>("Blue Crows");
        Team<FootbalPlayer> melbourne = new Team<>("Melbourne");
        Team<FootbalPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootbalPlayer> fremantle = new Team<>("Fremantle");
        Team<BaseballPlayer> baseballTeam = new Team<>("Red Skins");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(blueCrowns, 3, 5);

        blueCrowns.matchResult(fremantle, 2, 1);
        blueCrowns.matchResult(hawthorn, 1, 1);

        footballLeague.add(blueCrowns);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

//        footballLeague.add(baseballTeam);
        footballLeague.showLeagueTable();
    }
}
