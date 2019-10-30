    package com.example.android.depechemodequiz;

    import android.content.Intent;
    import android.net.Uri;
    import android.os.Bundle;
    import android.support.v7.app.AppCompatActivity;
    import android.view.View;
    import android.widget.CheckBox;
    import android.widget.Checkable;
    import android.widget.EditText;
    import android.widget.RadioButton;
    import android.widget.RadioGroup;
    import android.widget.TextView;
    import android.widget.Toast;

    import com.example.android.depechemodequiz.R;


    public class MainActivity extends AppCompatActivity {

    //It initialize the final score and provide the total number of questions.
    int score = 0;

    //It creates global variable for the views.
    String fillMe;
    EditText fill;
    RadioGroup rap1;
    RadioButton raton1_1;
    RadioButton raton1_2;
    RadioButton raton1_3;
    CheckBox cheox1;
    CheckBox cheox2;
    CheckBox cheox3;
    CheckBox cheox4;
    RadioGroup rap4;
    RadioButton raton4_1;
    RadioButton raton4_2;
    RadioButton raton4_3;
    RadioGroup rap5;
    RadioButton raton5_1;
    RadioButton raton5_2;
    RadioButton raton5_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize views that was created above.
        fill = (EditText) findViewById(R.id.quest_3);
        rap1 = (RadioGroup) findViewById(R.id.quest_1);
        raton1_1 = (RadioButton) findViewById(R.id.ans_1_1);
        raton1_2 = (RadioButton) findViewById(R.id.ans_1_2);
        raton1_3 = (RadioButton) findViewById(R.id.ans_1_3);
        cheox1 = (CheckBox) findViewById(R.id.quest2_ch1);
        cheox2 = (CheckBox) findViewById(R.id.quest2_ch2);
        cheox3 = (CheckBox) findViewById(R.id.quest2_ch3);
        cheox4 = (CheckBox) findViewById(R.id.quest2_ch4);
        rap4 = (RadioGroup) findViewById(R.id.quest_4);
        raton4_1 = (RadioButton) findViewById(R.id.ans_4_1);
        raton4_2 = (RadioButton) findViewById(R.id.ans_4_2);
        raton4_3 = (RadioButton) findViewById(R.id.ans_4_3);
        rap5 = (RadioGroup) findViewById(R.id.quest_5);
        raton5_1 = (RadioButton) findViewById(R.id.ans_5_1);
        raton5_2 = (RadioButton) findViewById(R.id.ans_5_2);
        raton5_3 = (RadioButton) findViewById(R.id.ans_5_3);
    }


    //This method defines the right answers from input and generates the scores.
    private int calculateScore() {

        int score = 0;

        fillMe = fill.getText().toString();
        boolean speakSpell = raton1_1.isChecked();
        boolean martinGore = cheox1.isChecked();
        boolean alanWilder = cheox2.isChecked();
        boolean andyFletcher = cheox3.isChecked();
        boolean vinceClarke = cheox4.isChecked();
        boolean daveGaham = raton4_1.isChecked();
        boolean marGor = raton5_2.isChecked();

        if ("bones".equalsIgnoreCase(fillMe)) {
            score = score + 1;
        }

        if (speakSpell) {
            score += 1;
        }

        if (!martinGore && alanWilder && !andyFletcher && vinceClarke) {
            score += 1;
        }

        if (daveGaham) {
            score += 1;
        }

        if (marGor) {
            score += 1;
        }

        return score;
    }

    //Calculates the score of the quiz.
    public void showScore(View view) {
        score = calculateScore();
        display(score);
    }


    //Creates the toast message with the results
    private void display(int finalResult) {

        if (score >= 3) {
            Toast.makeText(MainActivity.this,
                    getString(R.string.Congrats) + "\n" + getString(R.string.yourscore) + score + "\n" + getString(R.string.answers) + "\n" + getString(R.string.right_answers), Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(MainActivity.this,
                    getString(R.string.nop) + "\n" + getString(R.string.yourscore) + score + "\n" + getString(R.string.answers) + "\n" + getString(R.string.wrong_answers), Toast.LENGTH_LONG).show();
        }

    }


    // reset the quiz
    public void resetScore(View v) {
        (fill).getText().clear();
        rap1.clearCheck();
        rap4.clearCheck();
        rap5.clearCheck();
        cheox1.setChecked(false);
        cheox2.setChecked(false);
        cheox3.setChecked(false);
        cheox4.setChecked(false);
    }
}






