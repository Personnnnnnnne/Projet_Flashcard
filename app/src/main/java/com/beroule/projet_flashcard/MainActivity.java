package com.beroule.projet_flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {

    public Question currentQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Question> ListQuestion = new ArrayList<>();
        ArrayList<String> answer = new ArrayList<>();
        answer.add("Ahri");
        answer.add("Braum");
        answer.add("Taric");
        answer.add("Thresh");

        Button aboutButton = findViewById(R.id.aboutButton);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });

        Button quizLeagueOfLegendsButton = findViewById(R.id.quizLeagueOfLegendsButton);
        quizLeagueOfLegendsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, QuizLeagueOfLegendsActivity.class);
                startActivity(intent);
            }
        });

    }
}
