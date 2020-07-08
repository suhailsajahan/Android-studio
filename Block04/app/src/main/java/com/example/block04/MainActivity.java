package com.example.block04;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    MediaPlayer qurathPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        qurathPlay = MediaPlayer.create(this, R.raw.qurath);
        Switch switchLoop = (Switch) findViewById(R.id.switchLoop);
        switchLoop.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                qurathPlay.setLooping(isChecked);
            }
        });
    }

    public void playMusic(View v){
        qurathPlay.start();
    }

    public void pauseMusic(View v){
        if(qurathPlay.isPlaying())
            qurathPlay.pause();
            //qurathPlay.stop();  //can't start again
    }
}
