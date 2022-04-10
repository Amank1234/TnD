package com.example.tadee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity10 extends AppCompatActivity {
TextView textView27;
    TextView textView28;
    TextView textView29;
    TextView textView30;
    TextView textView31;
    TextView textView32;
    TextView textView33;
    TextView textView34;
    Button button12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        textView27=findViewById(R.id.textView27);
        textView28=findViewById(R.id.textView28);
        textView29=findViewById(R.id.textView29);
        textView30=findViewById(R.id.textView30);
        textView31=findViewById(R.id.textView31);
        textView32=findViewById(R.id.textView32);
        textView33=findViewById(R.id.textView33);
        textView34=findViewById(R.id.textView34);

        button12=findViewById(R.id.button12);

        textView28.setText(MainActivity5.result1);
        textView30.setText(MainActivity5.result2);
        textView32.setText(MainActivity6.result3);
        textView34.setText(MainActivity6.result4);

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity10.this,MainActivity11.class);
                startActivity(i);
            }
        });
    }
}