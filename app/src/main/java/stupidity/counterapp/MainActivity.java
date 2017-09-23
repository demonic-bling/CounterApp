package stupidity.counterapp;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plusBtn = (Button) findViewById(R.id.plusButton);
        Button minusBtn = (Button) findViewById(R.id.minusButton);
        final TextView counterTxt = (TextView) findViewById(R.id.counterText);


        counterTxt.setText(String.valueOf(counter));

        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                counterTxt.setText(String.valueOf(counter));
            }
        });

        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter--;
                counterTxt.setText(String.valueOf(counter));
            }
        });
    }
}
