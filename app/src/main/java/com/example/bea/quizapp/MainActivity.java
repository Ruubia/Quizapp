package com.example.bea.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button clear;
    private TextView scoreShow;
    private Button calculate;
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculate = (Button) findViewById(R.id.scoreButton);
        clear = (Button)findViewById(R.id.clearScore);
        scoreShow = (TextView) findViewById(R.id.scoreText);

        calculate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                friendsSisters();
                friendsMonkey();
                friendsPhoebe();
                friendsChandler();

                scoreShow.setText("Your score is: " + score + "/4");
            }
        });

        clear.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){testClear();}});
    }

    public void friendsSisters(){
        RadioButton rbSeven = (RadioButton)findViewById(R.id.seven);

        if(rbSeven.isChecked()){score += 1;}
        else{score -= 1;}
    }

    public void friendsMonkey(){
        RadioButton rbMarcel = (RadioButton)findViewById(R.id.marcel);

        if(rbMarcel.isChecked()){score += 1;}
        else{score -= 1;}
    }

    public void friendsPhoebe(){
        RadioButton rbUrsula = (RadioButton)findViewById(R.id.ursula);

        if(rbUrsula.isChecked()){score += 1;}
        else{score -= 1;}
    }

    public void friendsChandler(){
        RadioButton rbMuriel = (RadioButton)findViewById(R.id.muriel);

        if(rbMuriel.isChecked()){score += 1;}
        else{score -= 1;}
    }

    public void testClear(){
        RadioButton rbFour = (RadioButton)findViewById(R.id.four);
        RadioButton rbNine = (RadioButton)findViewById(R.id.nine);
        RadioButton rbSeven = (RadioButton)findViewById(R.id.seven);

        RadioButton rbMarcel = (RadioButton)findViewById(R.id.marcel);
        RadioButton rbMichel = (RadioButton)findViewById(R.id.michel);
        RadioButton rbMichael = (RadioButton)findViewById(R.id.michel);

        RadioButton rbJulie = (RadioButton)findViewById(R.id.julie);
        RadioButton rbUrsula = (RadioButton)findViewById(R.id.ursula);
        RadioButton rbJanice = (RadioButton)findViewById(R.id.janice);

        RadioButton rbBing = (RadioButton)findViewById(R.id.bing);
        RadioButton rbMuriel = (RadioButton)findViewById(R.id.muriel);
        RadioButton rbRoss = (RadioButton)findViewById(R.id.ross);

        scoreShow = (TextView) findViewById(R.id.scoreText);
        scoreShow.setText("");
        score = 0;

        rbFour.setChecked(false);
        rbNine.setChecked(false);
        rbSeven.setChecked(false);
        rbMarcel.setChecked(false);
        rbMichel.setChecked(false);
        rbMichael.setChecked(false);
        rbJulie.setChecked(false);
        rbUrsula.setChecked(false);
        rbJanice.setChecked(false);
        rbBing.setChecked(false);
        rbMuriel.setChecked(false);
        rbRoss.setChecked(false);

    }
}