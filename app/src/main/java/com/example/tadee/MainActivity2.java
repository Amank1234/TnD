package com.example.tadee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
Button button;
Button button2;
TextView textView2;
public static int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView2=findViewById(R.id.textView2);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
    }

    public void navigateSymmetrical(View v)
    {
        Intent i =new Intent(MainActivity2.this,MainActivity3.class);
        startActivity(i);

    }
    public void navigateUnSymmetrical(View v)
    {
        Intent i =new Intent(MainActivity2.this,MainActivity4.class);
        startActivity(i);

    }
}