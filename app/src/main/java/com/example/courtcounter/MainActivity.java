package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int add=3;
    int add2=2;
    int add3=1;
    int score_b=0;
    int score=0;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(score);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score_b) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score_b));}

    public void AddthreeA(View view) {
            score=score+add;
        displayForTeamA(score);
    }

    public void AddtwoA(View view) {
        score=score+add2;
        displayForTeamA(score);
    }

    public void AddoneA(View view) {
        score=score+add3;
        displayForTeamA(score);
    }
    public void AddthreeB(View view) {
        score_b=score_b+add;
        displayForTeamB(score_b);
    }

    public void AddtwoB(View view) {
        score_b=score_b+add2;
        displayForTeamB(score_b);
    }

    public void AddoneB(View view) {
        score_b=score_b+add3;
        displayForTeamB(score_b);
    }
    public void resetButton(View view){
        score=0;
        score_b=0;
        displayForTeamA(score);
        displayForTeamB(score_b);
    }
}