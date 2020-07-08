package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;
import java.text.Format;

public class FigRectSqr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fig_rect_sqr);

        Button clickHere = (Button) findViewById(R.id.button);
        clickHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ET_a = (EditText) findViewById(R.id.editText_a);
                EditText ET_b = (EditText) findViewById(R.id.editText_b);
                EditText ET_area = (EditText) findViewById(R.id.editText_Area);
                EditText ET_perimeter = (EditText) findViewById(R.id.editText_Perimeter);

                double a = Double.valueOf(ET_a.getText().toString());
                double b = Double.valueOf(ET_b.getText().toString());
                double area = a*b ;
                double perimeter = (a+b)*2 ;

                DecimalFormat formatVal = new DecimalFormat("##.###");
                ET_area.setText(formatVal.format(area));
                ET_perimeter.setText(formatVal.format(perimeter));
            }
        });

    }
}