package com.example.myapplication.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class FootballResponse {

    @SerializedName("standings")

    List<Standing> standings;

    public FootballResponse(){
        standings = new ArrayList<>();
    }

    public static FootballResponse parseJSON(String response) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(response, FootballResponse.class);
    }
}
