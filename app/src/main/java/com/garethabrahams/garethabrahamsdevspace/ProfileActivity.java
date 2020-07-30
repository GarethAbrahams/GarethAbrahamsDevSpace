package com.garethabrahams.garethabrahamsdevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {

    private ListView listView;
    private Context context;
    private ArrayList progList;

    public static Integer [] progImages={
            R.drawable.person,R.drawable.cellphone,R.drawable.phone,
            R.drawable.gmail,R.drawable.facebook,R.drawable.linkedin
    };

    public static String [] progNames={
            "Gareth Abrahams","082 552 2995","021 552 2955","gareth@gmail.com","www.facebook.com/GarethAbrahams","www.linkedin.com/in/gareth-abrahams"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        listView=(ListView) findViewById(R.id.listView);
        MyListAdapter myAdapter = new MyListAdapter(this,progNames,progImages);

        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ProfileActivity.this, "You clicked on "+progNames[position], Toast.LENGTH_SHORT).show();
            }
        });

    }
}