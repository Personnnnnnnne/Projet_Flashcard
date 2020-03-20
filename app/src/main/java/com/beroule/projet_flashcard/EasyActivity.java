package com.beroule.projet_flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class EasyActivity extends AppCompatActivity {

    int CurrentlyQuestion;
    int CurrentlyQuestionTotal;
    private Champion currentChampion;
    int index = 0;

    static int[] tableauSon = {R.raw.aatrox_selection, R.raw.rammus_selection, R.raw.rengar_selection, R.raw.caitlyn_selection, R.raw.garen_selection,
    R.raw.ezreal_selection, R.raw.alistar_selection, R.raw.katarina_selection, R.raw.drmundo_selection, R.raw.mordekaiser_selection};
    public static int totalSon = tableauSon.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);

        QuestionGenerator.load();
        currentChampion = QuestionGenerator.tableauChampion.get(index);

        RadioButton radioButton1 = findViewById(R.id.answer1RadioButton);
        radioButton1.setText(currentChampion.answers.get(0));
        RadioButton radioButton2 = findViewById(R.id.answer2RadioButton);
        radioButton2.setText(currentChampion.answers.get(1));
        RadioButton radioButton3 = findViewById(R.id.answer3RadioButton);
        radioButton3.setText(currentChampion.answers.get(2));

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

                RadioGroup radioGroup = findViewById(R.id.radioGroupCharacter);
                // On récupère l'ID du radiobutton sélectionné
                // renvoie -1 si aucun RadioButton n'a été sélectionné
                int idRadioButton = radioGroup.getCheckedRadioButtonId();

                if (idRadioButton == -1) {
                    Log.i("EasyActivity", "Aucun champion selectionner");
                    return;
                }

                // On récupère le radioButton associé à cet id (idRadioButton)
                // CAD le radiobutton qui a été sélectionné
                RadioButton radioButton = findViewById(idRadioButton);

                if (radioButton.getText().equals(currentChampion.name)) {
                    Log.i("EasyActivity", "Bonne réponse ");

                } else {
                    Log.i("EasyActivity", "Mauvaise réponse");
                }

                if (CurrentlyQuestion == CurrentlyQuestionTotal){
                    Intent intent = new Intent(EasyActivity.this, StatisticActivity.class);
                    startActivity(intent);
                }
                else{
                    CurrentlyQuestion ++;
                    index++;

                    currentChampion = QuestionGenerator.tableauChampion.get(index);
                    RadioButton radioButton1 = findViewById(R.id.answer1RadioButton);
                    radioButton1.setText(currentChampion.answers.get(0));
                    RadioButton radioButton2 = findViewById(R.id.answer2RadioButton);
                    radioButton2.setText(currentChampion.answers.get(1));
                    RadioButton radioButton3 = findViewById(R.id.answer3RadioButton);
                    radioButton3.setText(currentChampion.answers.get(2));

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
