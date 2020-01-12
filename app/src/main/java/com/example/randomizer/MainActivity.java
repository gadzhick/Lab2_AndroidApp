package com.example.randomizer;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Random myRandom = new Random();

        Button buttonGenerator = (Button)findViewById(R.id.generateHandler);
        final TextView generatedView = (TextView)findViewById(R.id.generatedNumber);

        final int color[] = {Color.BLUE, Color.RED, Color.GREEN, Color.GRAY, Color.YELLOW};

        buttonGenerator.setOnClickListener(new View.OnClickListener() {
            public void onClick(View w) {
                int pos = myRandom.nextInt(color.length);
                generatedView.setBackgroundColor(color[pos]);
            }
        });
    }
}
