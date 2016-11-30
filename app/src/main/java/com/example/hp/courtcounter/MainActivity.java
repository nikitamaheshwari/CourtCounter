package com.example.hp.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0, scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayForTeamA(int scoreTeamA){
        TextView scoreTeamAView = (TextView)findViewById(R.id.team_a_scoretextview);
        scoreTeamAView.setText(String.valueOf(scoreTeamA));
    }
    public void displayForTeamB(int scoreTeamB){
        TextView scoreTeamBView = (TextView)findViewById(R.id.team_b_scoretextview);
        scoreTeamBView.setText(String.valueOf(scoreTeamB));
    }
    public void scoreTeamACounter3(View view){
        scoreTeamA=scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }
    public void scoreTeamACounter2(View view){
        scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);

    }
    public void scoreTeamACounter1(View view){
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }
    public void scoreTeamBCounter3(View view){
        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }
    public void scoreTeamBCounter2(View view){
        scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);

    }
    public void scoreTeamBCounter1(View view){
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
