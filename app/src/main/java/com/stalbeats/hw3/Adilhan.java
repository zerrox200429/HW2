package com.stalbeats.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Adilhan extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    TextView view1,view2;
    int sum;
    int nameAdi ;
    int nameAdi2 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_window);
        view1=findViewById(R.id.view1);
        view2=findViewById(R.id.view2);
        btn1 =findViewById(R.id.btn1);
        btn2 =findViewById(R.id.btn2);
        btn3 =findViewById(R.id.btn3);
        btn4 =findViewById(R.id.btn4);


        Intent intent=getIntent();
        String name=intent.getStringExtra("key" );
        String name2=intent.getStringExtra("key2" );
        nameAdi = Integer.parseInt(name);
        view1.setText(name);
         nameAdi2 = Integer.parseInt(name2);
        view2.setText(name2);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                sum= nameAdi + nameAdi2;
                Intent intent= new Intent(Adilhan.this , Stalbek.class );
                intent.putExtra("key4", sum);
                startActivity(intent);
                break;
            case R.id.btn2:
                sum= nameAdi - nameAdi2;
                Intent intent2= new Intent(Adilhan.this , Stalbek.class );
                intent2.putExtra("key4", sum);
                startActivity(intent2);
                break;
            case R.id.btn3:
                sum= nameAdi * nameAdi2;
                Intent intent3= new Intent(Adilhan.this , Stalbek.class );
                intent3.putExtra("key4", sum);
                startActivity(intent3);
                break;
            case R.id.btn4:
                sum= nameAdi / nameAdi2;
                Intent intent4= new Intent(Adilhan.this , Stalbek.class );
                intent4.putExtra("key4", sum);
                startActivity(intent4);
                break;
        }
    }
}


