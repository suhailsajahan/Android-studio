package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class FigTriangle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fig_triangle);

        Button clickHere = (Button) findViewById(R.id.button);

        clickHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ET_h = (EditText) findViewById(R.id.editText_h);
                EditText ET_b = (EditText) findViewById(R.id.editText_b);
                EditText ET_Area = (EditText) findViewById(R.id.editText_Area);

                double a = Double.valueOf(ET_h.getText().toString());
                double b = Double.valueOf(ET_b.getText().toString());
                double area = (a*b)/2;

                DecimalFormat formatVal = new DecimalFormat("##.###");

                ET_Area.setText(formatVal.format(area));

            }
        });


    }
}