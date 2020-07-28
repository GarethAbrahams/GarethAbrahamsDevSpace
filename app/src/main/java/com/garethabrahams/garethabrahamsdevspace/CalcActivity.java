package com.garethabrahams.garethabrahamsdevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.nio.BufferUnderflowException;
import java.util.ArrayList;

public class CalcActivity extends AppCompatActivity {

    private EditText length,width,height;
    private int ln, wth, ht, volume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        Button calcButton = (Button) findViewById(R.id.calcButton);
        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                length = (EditText) findViewById(R.id.lengthTextNumber);
                width = (EditText) findViewById(R.id.widthTextNumber);
                height = (EditText) findViewById(R.id.heightTextNumber);

                ln = Integer.parseInt(length.getText().toString());
                wth = Integer.parseInt(width.getText().toString());
                ht = Integer.parseInt(height.getText().toString());

                volume = ln*wth*ht;
                String message = "Volume in cm is: " + volume;
                TextView volumeDisplay = (TextView) findViewById(R.id.volumeDisplay);
                volumeDisplay.setText(message);
            }
        });


        Button backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalcActivity.this, MenuActivity.class);
                startActivity(intent);

            }
        });

    }
}