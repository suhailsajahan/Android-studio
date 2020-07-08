package com.example.block07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {

    NumberPicker possibilities;
    WebView webView;
    Button buttonOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        possibilities = (NumberPicker) findViewById(R.id.numberPicker);
        webView = (WebView) findViewById(R.id.webView);
        buttonOK = (Button) findViewById(R.id.buttonOK);

        String[] possibilitiesStrings = {
                "Android",
                "Checklist text-input field",
                "Coursera",
                "Supelec"
        };
        possibilities.setDisplayedValues(possibilitiesStrings);  //display the array
        possibilities.setMinValue(0);
        possibilities.setMaxValue(possibilitiesStrings.length - 1);
    }

    public void navigate(View v){
        int choice = possibilities.getValue();
        if(choice==0)
            webView.loadUrl("file:///android_asset/android.html");
        else if(choice==1)
            webView.loadUrl("file:///android_asset/checklist.html");
        else if(choice==2){
            webView.setWebViewClient(new WebViewClient()); //help to show the new page in the same app
            webView.loadUrl("http://www.coursera.org");
        }
        else if(choice==3)
            webView.loadUrl("file:///android_asset/supelec.html");
    }
}