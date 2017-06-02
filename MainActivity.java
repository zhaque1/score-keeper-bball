package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0 , scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

    public void displayForTeamA(int score){

        TextView scoreView = (TextView) findViewById(R.id.teamAScore);
        scoreView.setText(String.valueOf(score));

    }

    public void displayForTeamB(int score){

        TextView scoreView = (TextView) findViewById(R.id.teamBScore);
        scoreView.setText(String.valueOf(score));

    }

    public void addThree(View view) {

        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    public void addTwo(View view){
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    public void addFreeThrow(View view){
        ++ scoreA;
        displayForTeamA(scoreA);
    }

    public void addThreeB(View view) {

        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    public void addTwoB(View view){
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void addFreeThrowB(View view){
        ++ scoreB;
        displayForTeamB(scoreB);
    }

    public void resetScore(View view){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);

    };

}
