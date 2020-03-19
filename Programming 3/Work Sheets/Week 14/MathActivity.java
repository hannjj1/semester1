package bit.dale.mathquizlab3;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Ten question Math Quiz
 * @author dale
 */
public class MainActivity extends ActionBarActivity implements View.OnClickListener{
    int questionNumber=0;
    Question[] questions;
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnNext = (Button) findViewById(R.id.button);
        btnNext.setOnClickListener(this);
        setUpQuestions();
        showQuestion();
    }


    public void setUpQuestions()
    {
        Random rand = new Random();
        questions = new Question[5];
        int num1,num2,result;
        for (int i = 0; i < questions.length ; i++) {
            num1=rand.nextInt(11);
            num2= rand.nextInt(11);
            result = num1*num2;
            questions[i] = new Question(num1,num2,result);

        }
    }

    /**
     * populate each question based on the current questionNumber
     */
    public void showQuestion()
    {
        TextView quest = (TextView) findViewById(R.id.textViewQuestion);
        quest.setText(questions[questionNumber].getNum1()+" * "+questions[questionNumber].getNum2());
        EditText etAnswer = (EditText) findViewById(R.id.editText);
        etAnswer.setText("");
    }

    @Override
    public void onClick(View v) {
        if (questionNumber<questions.length) {
            EditText etAnswer = (EditText) findViewById(R.id.editText);
            int answer = Integer.parseInt(etAnswer.getText().toString());
            if (answer == questions[questionNumber].getResult()) {
                score++;
            }
            else {
                Toast.makeText(this,"Wrong",Toast.LENGTH_LONG).show();
            }

            questionNumber++;
            if (questionNumber<questions.length) {
                showQuestion();
            }

        }
        else
        {

            //go to a new activity screen
            Intent changeActivity = new Intent(MainActivity.this, FinalActivity.class);
            changeActivity.putExtra("results",score);
            startActivity(changeActivity);

        }



    }
}
