package com.example.tadee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity17 extends AppCompatActivity {
TextView textView55;
TextView textView56;
    TextView textView57;
    TextView textView58;
Button button20;
ImageView imageView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);
        textView55=findViewById(R.id.textView55);
        textView56=findViewById(R.id.textView56);
        textView57=findViewById(R.id.textView57);
        textView58=findViewById(R.id.textView58);
        button20=findViewById(R.id.button20);
        imageView5=findViewById(R.id.imageView5);

        textView56.setText(MainActivity9.result15);
        if(MainActivity9.comp<0.0)
        {
            textView58.setText("Inductive Compensation");
        }
        else if(MainActivity9.comp>0.0)
        {
            textView58.setText("Capacitive Compensation");
        }
        else
        {
            textView58.setText("No Compensation Required");
        }
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
                System.exit(0);
            }
        });
    }
}