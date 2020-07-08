package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class FigCircle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fig_circle);

        Button clickHere = (Button) findViewById(R.id.button);
        clickHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText text_r = (EditText) findViewById(R.id.editText_r);
                EditText ET_area = (EditText) findViewById(R.id.editText_Area);
                EditText ET_perimeter = (EditText) findViewById(R.id.editText_Perimeter);

                double r = Double.valueOf(text_r.getText().toString());
                double area = (22*r*r)/7;
                double perimeter = (2*r*22)/7;
                DecimalFormat formatVal = new DecimalFormat("##.###");
                ET_area.setText(formatVal.format(area));
                ET_perimeter.setText(formatVal.format(perimeter));
            }
        });
    }
}