package com.example.myapplication;

import com.example.myapplication.models.FootballResponse;
import com.example.myapplication.models.Team;
import com.example.myapplication.models.TeamList;

import java.util.List;



import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface FootballResponseService {

    @Headers ("X-Auth-Token: dc20b0650be84b998e21b778787e5c33")

    @GET("v2/competitions/PL/standings")
    Call<TeamList> getTeam();




}
