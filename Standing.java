package com.example.myapplication.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class Examples {

    @SerializedName("season")
    @Expose
    public Season season;
    @SerializedName("filters")
    @Expose
    public Filters filters;
    @SerializedName("standings")
    @Expose
    public List<Standing> standings = null;

}

class Filters {


}

class Season {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("startDate")
    @Expose
    public String startDate;
    @SerializedName("endDate")
    @Expose
    public String endDate;
    @SerializedName("currentMatchday")
    @Expose
    public Integer currentMatchday;

}

public class Standing {

    @SerializedName("stage")
    @Expose
    public String stage;
    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("group")
    @Expose
    public Object group;
    @SerializedName("table")
    @Expose
    public List<Table> table = null;

}

class Table {

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

