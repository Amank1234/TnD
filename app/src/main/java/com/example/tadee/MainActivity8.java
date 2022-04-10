package com.example.tadee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity8 extends AppCompatActivity {
TextView textView20;
    TextView textView21;
    TextView textView22;
    TextView textView23;
    Button button10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        textView20=findViewById(R.id.textView20);
        textView21=findViewById(R.id.textView21);
        textView22=findViewById(R.id.textView22);
        textView23=findViewById(R.id.textView23);
        button10=findViewById(R.id.button10);
        textView20.setText(MainActivity7.q1);
        textView21.setText(MainActivity7.q2);
        textView22.setText(MainActivity7.q3);
        textView23.setText(MainActivity7.q4);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity8.this,MainActivity9.class);
                startActivity(i);
            }
        });
    }
}