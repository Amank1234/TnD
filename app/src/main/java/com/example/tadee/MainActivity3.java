package com.example.tadee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
TextView textView3;
TextView textView4;
EditText editText1;
Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        editText1=findViewById(R.id.editText1);
        button3=findViewById(R.id.button3);

    }
    public void next1(View v)
    {
        String data=editText1.getText().toString();

            double x = Double.parseDouble(data);
MainActivity2.count=3;
        Intent i=new Intent(MainActivity3.this,MainActivity5.class);
        i.putExtra("mgmdsymmetrical",data);
        startActivity(i);
    }
}