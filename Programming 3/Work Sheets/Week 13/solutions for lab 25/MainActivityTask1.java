package bit.dale.lab2images;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //load the questions
        loadQuestion();
        //make the button clickable
        Button btnCheck = (Button) findViewById(R.id.button);
        btnCheck.setOnClickListener(this);

    }

    public void loadQuestion()
    {
        // load an image at run time
        image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(R.drawable.hello);
        //change the radio button txt
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton4);
        rb1.setText("Chao");
        rb2.setText("Gracias");
        rb3.setText("Hola");
        rb4.setText("Adios");

    }

    @Override
    public void onClick(View v) {
        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);
        int selected = rg.getCheckedRadioButtonId();
        //find out which radio button that was
        RadioButton chosen = (RadioButton) findViewById(selected);
        Toast.makeText(this,chosen.getText(),Toast.LENGTH_LONG).show();
        if (chosen.getText().equals("Hola"))
        {
            //change the image to correct picture
            image.setImageResource(R.drawable.correct);
        }
        else
        {
            Toast.makeText(this,"Wrong",Toast.LENGTH_LONG).show();
        }
    }
}
