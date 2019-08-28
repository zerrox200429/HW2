package com.stalbeats.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Stalbek extends AppCompatActivity {
    TextView view;
    Button share;
    int Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stalbek);
        view = findViewById(R.id.Result);
        share = findViewById(R.id.share);
        Intent intent = getIntent();
         Result = intent.getIntExtra("key4", 0);
        String result = String.valueOf(Result);
        view.setText(result);


        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = view.toString();

                Intent intent1 = new Intent();
                intent1.setAction(Intent.ACTION_SEND);
                intent1.putExtra(Intent.EXTRA_TEXT, message);
                intent1.setType("text/plain");
                if (intent1.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent1);
                }
            }
        });


    }
}
