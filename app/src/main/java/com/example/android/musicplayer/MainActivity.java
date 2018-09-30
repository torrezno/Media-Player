package com.example.android.musicplayer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(this, R.raw.bensound_onceagain);
        findViewById(R.id.pause).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();
                Toast.makeText(getApplicationContext(), "Pausing ",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                Toast.makeText(getApplicationContext(), "Starting ",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
