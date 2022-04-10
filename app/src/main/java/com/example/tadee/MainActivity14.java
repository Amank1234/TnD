package com.example.tadee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity14 extends AppCompatActivity {
TextView textView57;
    TextView textView58;
    TextView textView59;
    TextView textView60;
    TextView textView61;
    TextView textView62;
    Button button17;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        textView57=findViewById(R.id.textView57);
        textView58=findViewById(R.id.textView58);
        textView59=findViewById(R.id.textView59);
        textView60=findViewById(R.id.textView60);
        textView61=findViewById(R.id.textView61);
        textView62=findViewById(R.id.textView62);

        textView62.setText(MainActivity9.result12x);
        textView58.setText(MainActivity9.result12y);
        textView60.setText(MainActivity9.result12r);


        button17=findViewById(R.id.button17);
        imageView=findViewById(R.id.imageView);

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity14.this,MainActivity15.class);
                startActivity(i);
            }
        });



    }
}