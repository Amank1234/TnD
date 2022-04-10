package com.example.tadee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity11 extends AppCompatActivity {

    TextView textView35;
    TextView textView36;
    TextView textView37;
    TextView textView38;
    TextView textView39;
    TextView textView40;
Button button13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        textView35=findViewById(R.id.textView35);
        textView36=findViewById(R.id.textView36);
        textView37=findViewById(R.id.textView37);
        textView38=findViewById(R.id.textView38);
        textView39=findViewById(R.id.textView39);
        textView40=findViewById(R.id.textView40);
        button13=findViewById(R.id.button13);

        textView35.setText(MainActivity7.q1);
        textView36.setText(MainActivity7.q2);
        textView37.setText(MainActivity7.q3);

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity11.this,MainActivity12.class);
                startActivity(i);
            }
        });

    }
}