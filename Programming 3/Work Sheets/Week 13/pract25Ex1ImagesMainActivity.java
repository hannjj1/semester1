package bit.dale.greetings;

import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // call loadQuestion

        //get the ref to the button

        //make the button clickable


    }

    public void loadQuestion()
    {

    }

    @Override
    public void onClick(View v) {
        //grab a ref to the radio group

        //get the chosen radio button

        //check if its txt .equal "Holo"
    }
}
