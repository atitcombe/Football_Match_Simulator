package com.example.myapplication;

public class Match {
    TeamMan home;
    String id;
    TeamMan away;
    int scoreHome;
    int scoreAway;
    boolean isOver = false;

    public Match(TeamMan home, TeamMan away) {
        this.home = home;
        this.away = away;
        id = generateId(home, away);
    }

    public Match(TeamMan home, TeamMan away, int scoreHome, int scoreAway) {
        this.home = home;
        this.away = away;
        this.scoreHome = scoreHome;
        this.scoreAway = scoreAway;
        isOver = true;
        id = generateId(home, away);
    }

    public static String generateId(TeamMan home, TeamMan away) {
        return String.format("%s%s", home.getName(), away.getName());
    }

    public TeamMan getHome() {
        return home;
    }

    public TeamMan getAway() {
        return away;
    }
}