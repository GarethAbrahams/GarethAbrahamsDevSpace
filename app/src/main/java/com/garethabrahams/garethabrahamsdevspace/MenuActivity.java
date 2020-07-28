package com.garethabrahams.garethabrahamsdevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    private String msg;
    private TextView guestTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Declare intent and store message
        Intent intent = getIntent();
        msg = intent.getStringExtra("guestName");

        //Assign message to TextView
              String message = "Dear " + msg;
              guestTextView = (TextView) findViewById(R.id.guestTextView);
              guestTextView.setText(message);



        //homeButton
        Button homeButton = (Button) findViewById(R.id.homeButton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //calculationButton
        Button calcButton = (Button) findViewById(R.id.calcButton);
        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, CalcActivity.class);
                startActivity(intent);
            }
        });

        //aboutButton
        Button aboutButton = (Button) findViewById(R.id.AboutButton);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, AboutMeActivity.class);
                startActivity(intent);
            }
        });

        //ProfileButton
        Button profileButton = (Button) findViewById(R.id.ProfileButton);
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });



    }
}