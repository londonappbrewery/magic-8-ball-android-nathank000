package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button ballButton;
    private ImageView eightBallImage;

    final int[] eightBallImages = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.ballButton  = (Button) findViewById(R.id.button);
        this.ballButton.setOnClickListener(buttonListener);

        eightBallImage = (ImageView) findViewById(R.id.image_eightBall);
    }

    View.OnClickListener buttonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.d("OUTSIDE", "there was a click on the button outside");

            Random randomNumberGenerator = new Random();
            int randomNum = randomNumberGenerator.nextInt(5);

            Log.d("8 BALL", "random number = " +randomNum);

            eightBallImage.setImageResource(eightBallImages[randomNum]);

            Log.d("OUTSIDE", "view = "+ view);
        }
    };
}