package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given scoreA for Team A.
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreAView = (TextView) findViewById(R.id.team_a_score);
        scoreAView.setText(String.valueOf(scoreA));
    }

    public void Point3(View view) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    public void Point2(View view) {
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    public void PointFree(View view) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }

    public void displayForTeamB(int scoreB) {
        TextView scoreBView = (TextView) findViewById(R.id.team_b_score);
        scoreBView.setText(String.valueOf(scoreB));
    }
    public void Point3B(View view) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    public void Point2B(View view) {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void PointFreeB(View view) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    public void ResetB(View view) {
        scoreB = 0;
        scoreA = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}