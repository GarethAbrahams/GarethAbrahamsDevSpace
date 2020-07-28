package com.garethabrahams.garethabrahamsdevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AboutMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        String msg = "My name is Gareth Abrahams.\n"+"\n"+"A confident and well-rounded IT professional, with experience in management, service desk, desktop support procurement, SQL, IIS and server administration.\n" +
                "\n" +
                "Working for 17 year in a fast pace software development company, while studying part time for the past 4 years.\n" +
                "\n" +
                "Very much a family orientated person, married for 10 years and have a 6 year old daughter.\n";

        TextView aboutText = (TextView) findViewById(R.id.AboutText);
        aboutText.setText(msg);

        Button backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutMeActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}