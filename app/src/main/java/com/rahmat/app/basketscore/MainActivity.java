package com.rahmat.app.basketscore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvScoreA;
    TextView tvScoreB;

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvScoreA = findViewById(R.id.team_a_score);
        tvScoreB = findViewById(R.id.team_b_score);
    }

    public int addThreePoints(int score){
       return score+3;
    }
    public int addTwoPoints(int score){
        return score+2;
    }
    public int addFreeThrow(int score){
        return score+1;
    }

    public void displayScoreA(String scoreA){
        tvScoreA.setText(scoreA);
    }

    public void displayScoreB(String scoreB){
        tvScoreB.setText(scoreB);
    }

    public void resetAllScore(){
        scoreTeamA = 0;
        scoreTeamB = 0;
        tvScoreA.setText(""+scoreTeamA);
        tvScoreB.setText(String.valueOf(scoreTeamB));
    }

    public void threePointsA(View view) {
        scoreTeamA = addThreePoints(scoreTeamA);
        String angka = String.valueOf(scoreTeamA);
        displayScoreA(angka);
    }


    public void twoPointsA(View view) {
        scoreTeamA = addTwoPoints(scoreTeamA);
        String angka = String.valueOf(scoreTeamA);
        displayScoreA(angka);
    }

    public void freeThrowA(View view) {
        scoreTeamA = addFreeThrow(scoreTeamA);
        String angka = String.valueOf(scoreTeamA);
        displayScoreA(angka);
    }

    public void threePointsB(View view) {
        scoreTeamB = addThreePoints(scoreTeamB);
        String angka = String.valueOf(scoreTeamB);
        displayScoreB(angka);
    }

    public void twoPointsB(View view) {
        scoreTeamB = addTwoPoints(scoreTeamB);
        String angka = String.valueOf(scoreTeamB);
        displayScoreB(angka);
    }

    public void freeThrowB(View view) {
        scoreTeamB = addFreeThrow(scoreTeamB);
        String angka = String.valueOf(scoreTeamB);
        displayScoreB(angka);
    }

    public void resetScore(View view) {
        resetAllScore();
    }

    public void kirimBang(View view) {
        //membuat objek intent
        Intent intentKirim = new Intent(this, DetailActivity.class);
        //memberikan nilai untuk dikirim ke activity yang dituju
        intentKirim.putExtra("SCOREA", scoreTeamA );
        intentKirim.putExtra("SCOREB", scoreTeamB );
        //mengeksekusi intent
        startActivity(intentKirim);
    }
}
