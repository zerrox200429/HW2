package com.stalbeats.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText text1,text2;
    Button saveButton;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        saveButton = findViewById(R.id.next);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = text1.getText().toString();
                String name2 = text2.getText().toString();

                Intent intent = new Intent(MainActivity.this, Adilhan.class);
                intent.putExtra("key", name);
                intent.putExtra("key2", name2);
                startActivity(intent);
            }
        });


    }}




