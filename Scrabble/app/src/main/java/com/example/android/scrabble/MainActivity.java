package com.example.android.scrabble;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.android.scrabble.R;

public class MainActivity extends AppCompatActivity {
    int scoreVana = 0;
    int scoreGeorge = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Vana by 1 point.
     */
    public void addOneForVana(View v) {
        scoreVana = scoreVana + 1;
        displayForVana(scoreVana);
    }

    /**
     * Increase the score for Vana by 2 points.
     */
    public void addTwoForVana(View v) {
        scoreVana = scoreVana + 2;
        displayForVana(scoreVana);
    }

    /**
     * Increase the score for Vana by 3 points.
     */
    public void addThreeForVana(View v) {
        scoreVana = scoreVana + 3;
        displayForVana(scoreVana);
    }

    /**
     * Increase the score for Vana A by 4 points.
     */
    public void addFourForVana(View v) {
        scoreVana = scoreVana + 4;
        displayForVana(scoreVana);
    }

    /**
     * Increase the score for Vana by 8 points.
     */
    public void addEightForVana(View v) {
        scoreVana = scoreVana + 8;
        displayForVana(scoreVana);
    }

    /**
     * Increase the score for Vana by 10 points.
     */
    public void addTenForVana(View v) {
        scoreVana = scoreVana + 10;
        displayForVana(scoreVana);
    }

    /**
     * Displays the given score for Vana.
     */
    public void displayForVana(int score) {
        TextView scoreView = (TextView) findViewById(R.id.vana_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for George by 1 point.
     */
    public void addOneForGeorge(View v) {
        scoreGeorge = scoreGeorge + 1;
        displayForGeorge(scoreGeorge);
    }

    /**
     * Increase the score for George by 2 point.
     */
    public void addTwoForGeorge(View v) {
        scoreGeorge = scoreGeorge + 2;
        displayForGeorge(scoreGeorge);
    }

    /**
     * Increase the score for George by 3 point.
     */
    public void addThreeForGeorge(View v) {
        scoreGeorge = scoreGeorge + 3;
        displayForGeorge(scoreGeorge);
    }

    /**
     * Increase the score for George by 4 point.
     */
    public void addFourForGeorge(View v) {
        scoreGeorge = scoreGeorge + 4;
        displayForGeorge(scoreGeorge);
    }

    /**
     * Increase the score for George by 8 point.
     */
    public void addEightForGeorge(View v) {
        scoreGeorge = scoreGeorge + 8;
        displayForGeorge(scoreGeorge);
    }

    /**
     * Increase the score for George by 10 point.
     */
    public void addTenForGeorge(View v) {
        scoreGeorge = scoreGeorge + 10;
        displayForGeorge(scoreGeorge);
    }

    /**
     * Displays the given score for George.
     */
    public void displayForGeorge(int score) {
        TextView scoreView = (TextView) findViewById(R.id.george_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View v) {
        scoreVana = 0;
        scoreGeorge = 0;
        displayForVana(scoreVana);
        displayForGeorge(scoreGeorge);
    }
}
