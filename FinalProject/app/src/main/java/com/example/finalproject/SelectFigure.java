package com.example.finalproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectFigure extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_figure);
    }
    public  void selectCircle(View v){
        Button circle = (Button) findViewById(R.id.button_C);
        Intent goToCircle = new Intent();
        goToCircle.setClass(this,FigCircle.class);
        startActivity(goToCircle);
    }
    public  void selectTriangle(View v){
        Button triangle = (Button) findViewById(R.id.button_T);
        Intent goToTriangle = new Intent();
        goToTriangle.setClass(this,FigTriangle.class);
        startActivity(goToTriangle);
    }
    public  void selectRS(View v){
        Button Rect = (Button) findViewById(R.id.button_R);
        Button Sqr = (Button) findViewById(R.id.button_S);
        Intent goToRS = new Intent();
        goToRS.setClass(this,FigRectSqr.class);
        startActivity(goToRS);
    }

}