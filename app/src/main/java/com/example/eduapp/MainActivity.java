package com.example.eduapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button button;
Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CreateClass_Activity.class);
                startActivity(intent);
            }
        }); button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent joinclassintent = new Intent(MainActivity.this, JoinClass_Activity.class);
                startActivity(joinclassintent);
            }
        });


    }
}