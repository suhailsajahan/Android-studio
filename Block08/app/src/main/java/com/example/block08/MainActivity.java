package com.example.block08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enter(View v){
        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        float rating = ratingBar.getRating();

        Intent goToSecond = new Intent();                       //operation to be performed
        goToSecond.setClass(this, SecondActivity.class);        //set a class to move next
        goToSecond.putExtra("nbStars",rating);                       // send any parameters to next activity
        startActivity(goToSecond);
        finish();   // close the app, when we press back button
    }
}