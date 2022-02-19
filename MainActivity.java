package com.example.myapplication;
import com.example.myapplication.FootballResponseService;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.myapplication.models.TeamList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    TextView mTextView;
    ProgressDialog progressDialog;
    Button mButton;
    FootballResponseService footballResponseService;


    //the rest of the code
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView=findViewById(R.id.textview1);
        mButton = findViewById(R.id.button1);
        footballResponseService = APIClient.getClient().create(FootballResponseService.class);

        Call<TeamList> call = footballResponseService.getTeam();


        call.enqueue(new Callback<TeamList>() {
            @Override
            public void onResponse(retrofit2.Call<TeamList> call,  Response<TeamList> response) {
                Log.d("TAG",response.code()+"");

                String displayResponse = "";

                TeamList teamList = response.body();








                displayResponse += " Page\n" + teamList ;

                mTextView.setText(displayResponse);



            }

            @Override
            public void onFailure(@NonNull retrofit2.Call<TeamList> call, Throwable t) {
                call.cancel();
                mTextView.setText("It failed yo");

            }
        });




    }





    /*


     */


    // Initially used AsyncTask but the response time for a request was taking far too long
    // Opted for Retrofit after research said it was thrice as fast.
    //
    //Would have done a for loop to create th ee teams with the data
    //


}