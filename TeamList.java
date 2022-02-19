package com.example.myapplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TeamList {

    @SerializedName("position")
    @Expose
    public Integer position;
    @SerializedName("team")
    @Expose
    public Team team;
    @SerializedName("playedGames")
    @Expose
    public Integer playedGames;
    @SerializedName("won")
    @Expose
    public Integer won;
    @SerializedName("draw")
    @Expose
    public Integer draw;
    @SerializedName("lost")
    @Expose
    public Integer lost;
    @SerializedName("points")
    @Expose
    public Integer points;
    @SerializedName("goalsFor")
    @Expose
    public Integer goalsFor;
    @SerializedName("goalsAgainst")
    @Expose
    public Integer goalsAgainst;
    @SerializedName("goalDifference")
    @Expose
    public Integer goalDifference;
}
