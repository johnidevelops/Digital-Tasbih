package com.example.android.digitaltasbih;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Vibrator;

public class MainActivity extends AppCompatActivity {

    int scoreCount = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnVibrate=(Button)findViewById(R.id.buttonVibrate);

    }

    /**
     * Displays the given score for Counter
     */
    public void display(int number) {
        TextView scoreView = (TextView) findViewById(R.id.display);
        scoreView.setText(String.valueOf(number));
    }

    /**
     * This method is called when the addOne button is clicked.
     */
    public void addOne(View view) {
               scoreCount = scoreCount + 1;
              display(scoreCount);
// Get instance of Vibrator from current Context
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

// Vibrate for 400 milliseconds
        v.vibrate(50);
    }

    /**
     * This method is called when the reset button is clicked.
     */
    public void reset(View view) {
        scoreCount = 0;
        display(scoreCount);
    }


}
