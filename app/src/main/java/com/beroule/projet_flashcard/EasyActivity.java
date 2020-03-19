package com.beroule.projet_flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

import javax.security.auth.login.LoginException;

public class EasyActivity extends AppCompatActivity {

    int CurrentlyQuestion;
    int CurrentlyQuestionTotal;

    int tableauSon[] = {R.raw.aatrox_selection, R.raw.nasus_selection, R.raw.rammus_selection};
    public int totalSon = tableauSon.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);

        CurrentlyQuestionTotal = 10;
        CurrentlyQuestion = 1;

        Button playButton = findViewById(R.id.playButton);
        playButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                MediaPlayer mp = MediaPlayer.create(EasyActivity.this, tableauSon[CurrentlyQuestion-1]);

                mp.start();
            }
        });

        Button validButton = findViewById(R.id.valideButton);
        validButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CurrentlyQuestion == CurrentlyQuestionTotal){
                    Intent intent = new Intent(EasyActivity.this, StatisticActivity.class);
                }
                else{
                    CurrentlyQuestion ++;
                    Log.i("EasyActivity", String.valueOf(totalSon));

                    TextView currentlyQuestionTextView = findViewById(R.id.currentlyQuestionTextView);
                    currentlyQuestionTextView.setText("Question nº" + CurrentlyQuestion + " / " + CurrentlyQuestionTotal);
                }
            }
        });

        TextView currentlyQuestionTextView = findViewById(R.id.currentlyQuestionTextView);
        currentlyQuestionTextView.setText("Question nº" + CurrentlyQuestion + " / " + CurrentlyQuestionTotal);
    }
}
