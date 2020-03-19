package bit.dale.photoquiz;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{
    TextView iv4;
    TextView iv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv4 = (TextView) findViewById(R.id.textView4);
        iv4.setOnClickListener(this);
        iv1 = (TextView) findViewById(R.id.textView2);
        iv1.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.textView4) {
            iv4.setGravity(Gravity.CENTER);
            iv4.setBackgroundDrawable(null);
            iv4.setText("Correct\nGuinea Pig");
        }
        else   if (v.getId()==R.id.textView2)
        {
            iv1.setGravity(Gravity.CENTER);
            iv1.setBackgroundDrawable(null);
            iv1.setText("Wrong\nbeef\nCarne de res");
        }
       // iv2.setImageResource(R.drawable.finish);
       // Toast.makeText(this,"Correct",Toast.LENGTH_LONG).show();
    }
}
