package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA;
    int scoreTeamB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add 3 Points for team A.
     */
    public void scoreThreeA(View view){
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add 2 Points for team A.
     */
    public void scoreTwoA(View view){
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add 1 Point for team A.
     */
    public void freeThrowA(View view){
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add 3 Points for team B.
     */
    public void scoreThreeB(View view){
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Add 2 Points for team B.
     */
    public void scoreTwoB(View view){
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Add 1 Point for team B.
     */
    public void freeThrowB(View view){
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Reset points to 0 for both teams.
     */
    public void resetPoints(View view){
        scoreTeamB=0;
        scoreTeamA=0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }

}
