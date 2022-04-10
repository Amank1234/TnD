package com.example.tadee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity12 extends AppCompatActivity {
TextView textView41;
    TextView textView42;
    TextView textView43;
    TextView textView44;
    TextView textView45;
    TextView textView46;
    TextView textView47;
    TextView textView48;
    Button button14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        textView41=findViewById(R.id.textView41);
        textView42=findViewById(R.id.textView42);
        textView43=findViewById(R.id.textView43);
        textView44=findViewById(R.id.textView44);
        textView45=findViewById(R.id.textView45);
        textView46=findViewById(R.id.textView46);
        textView47=findViewById(R.id.textView47);
        textView48=findViewById(R.id.textView48);
        button14=findViewById(R.id.button14);

        textView42.setText(MainActivity7.q4);
        textView44.setText(MainActivity9.result5);
        textView46.setText(MainActivity9.result7);
        textView48.setText(MainActivity9.result8);

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k =new Intent(MainActivity12.this,MainActivity13.class);
                startActivity(k);
            }
        });

    }
}