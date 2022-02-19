package com.example.myapplication;

import java.util.LinkedList;

public class TeamMan {
    String name;
    LinkedList<Integer> goalsScored;
    LinkedList<Integer> goalsConceded;


    public TeamMan(String name, LinkedList<Integer> goalsScored, LinkedList<Integer> goalsConceded) {
        this.name = name;
        this.goalsConceded = goalsConceded;
        this.goalsScored = goalsScored;

    }

    public double calculateSD()
    {
        double standardDeviation = 0.0;
        double length = goalsScored.size();



        for(double num: goalsScored) {
            standardDeviation += Math.pow(num - mean(), 2);
        }

        return Math.sqrt(standardDeviation/length);
    }

    public double mean(){
        double sum = 0.0;
        double length = goalsScored.size();

        for(double num : goalsScored) {
            sum += num;
        }

        return sum/length;


    }

    public String getName() {
        return this.name;
    }
}

