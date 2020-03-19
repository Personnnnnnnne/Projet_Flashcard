package com.beroule.projet_flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EasyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);

        Button one = findViewById(R.id.playButton);
        one.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                MediaPlayer mp = MediaPlayer.create(EasyActivity.this, R.raw.aatrox_selection);

                mp.start();
            }
        });
    }
}
