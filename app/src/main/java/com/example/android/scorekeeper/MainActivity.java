package com.example.android.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamARuns = 0;
    int teamBRuns = 0;
    int teamAOut = 0;
    int teamBOut = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonAPlusOne(View view) {
        teamARuns += 1;
        displayARuns(teamARuns);

    }

    public void buttonAPlusTwo(View view) {
        teamARuns += 2;
        displayARuns(teamARuns);

    }

    public void buttonAPlusThree(View view) {
        teamARuns += 3;
        displayARuns(teamARuns);

    }

    public void buttonAPlusFour(View view) {
        teamARuns += 4;
        displayARuns(teamARuns);

    }

    public void buttonAPlusSix(View view) {
        teamARuns += 6;
        displayARuns(teamARuns);

    }

    public void buttonAOut(View view) {
        teamAOut += 1;
        displayAOuts(teamAOut);

    }

    public void buttonBPlusOne(View view) {
        teamBRuns += 1;
        displayBRuns(teamBRuns);

    }

    public void buttonBPlusTwo(View view) {
        teamBRuns += 2;
        displayBRuns(teamBRuns);

    }

    public void buttonBPlusThree(View view) {
        teamBRuns += 3;
        displayBRuns(teamBRuns);

    }

    public void buttonBPlusFour(View view) {
        teamBRuns += 4;
        displayBRuns(teamBRuns);

    }

    public void buttonBPlusSix(View view) {
        teamBRuns += 6;
        displayBRuns(teamBRuns);

    }

    public void buttonBOut(View view) {
        teamBOut += 1;
        displayBOuts(teamBOut);

    }

    public void buttonReset(View view) {
        teamARuns = 0;
        teamBRuns = 0;
        teamAOut = 0;
        teamBOut = 0;
        displayARuns(teamARuns);
        displayBRuns(teamBRuns);
        displayAOuts(teamAOut);
        displayBOuts(teamBOut);
    }

    public void displayARuns(int teamARuns) {
        TextView runAView = (TextView) findViewById(R.id.team_a_runs_text_view);
        runAView.setText(String.valueOf(teamARuns));
    }

    public void displayAOuts(int teamAOut) {
        TextView outAView = (TextView) findViewById(R.id.team_a_wickets_text_view);
        outAView.setText(String.valueOf(teamAOut));
    }

    public void displayBRuns(int teamBRuns) {
        TextView runBView = (TextView) findViewById(R.id.team_b_runs_text_view);
        runBView.setText(String.valueOf(teamBRuns));
    }

    public void displayBOuts(int teamBOut) {
        TextView outBView = (TextView) findViewById(R.id.team_b_wickets_text_view);
        outBView.setText(String.valueOf(teamBOut));
    }
}
