package com.example.tadee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity13 extends AppCompatActivity {
TextView textView49;
    TextView textView50;
    TextView textView51;
    TextView textView52;
    TextView textView53;
    TextView textView54;
//    TextView textView55;
//    TextView textView56;
    Button button15; Button button16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        textView49=findViewById(R.id.textView49);
        textView50=findViewById(R.id.textView50);
        textView51=findViewById(R.id.textView51);
        textView52=findViewById(R.id.textView52);
        textView53=findViewById(R.id.textView53);
        textView54=findViewById(R.id.textView54);
//        textView55=findViewById(R.id.textView55);
//        textView56=findViewById(R.id.textView56);
        button15=findViewById(R.id.button15);
        button16=findViewById(R.id.button16);

        textView50.setText(MainActivity9.result9);
        textView52.setText(MainActivity9.result10);
        textView54.setText(MainActivity9.result11);
//        textView56.setText(MainActivity9.result15);

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if(MainActivity7.counter==1) {
//                    Intent i = new Intent(MainActivity13.this, MainActivity14.class);
//                    startActivity(i);
//                }
//                else
//                {
//                    Intent i1=new Intent(MainActivity13.this,MainActivity16.class);
//                    startActivity(i1);
//                }
                Intent i =new Intent(MainActivity13.this,MainActivity14.class);
                startActivity(i);
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
                System.exit(0);
            }
        });
    }
}