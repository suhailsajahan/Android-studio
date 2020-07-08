package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickAbout(View v){
        Button about = (Button) findViewById(R.id.button_about);
        Intent goToAbout = new Intent();
        goToAbout.setClass(this,About.class);
        startActivity(goToAbout);
    }
    public  void clickSelect(View v){
        Button select = (Button) findViewById(R.id.button_select);
        Intent goToSelect = new Intent();
        goToSelect.setClass(this,SelectFigure.class);
        startActivity(goToSelect);
    }

}