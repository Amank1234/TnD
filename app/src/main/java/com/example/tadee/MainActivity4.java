package com.example.tadee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
TextView textView6;
TextView textView7;
EditText editText2;
EditText editText3;
EditText editText4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        textView6=findViewById(R.id.textView6);
        textView7=findViewById(R.id.textView7);
        editText2=findViewById(R.id.editText2);
        editText3=findViewById(R.id.editText3);
        editText4=findViewById(R.id.editText4);

    }
    public void next2(View v)
    {
        String s1=editText2.getText().toString();
        double d12=Double.parseDouble(s1);
        String s2=editText3.getText().toString();
        double d23=Double.parseDouble(s2);
        String s3=editText4.getText().toString();
        double d31=Double.parseDouble(s3);
MainActivity2.count=4;
        double pr=d12*d23*d31;
        double mgmd=Math.pow(pr,0.34);
        String mgmdunsym=String.valueOf(mgmd);

        Intent i=new Intent(MainActivity4.this,MainActivity5.class);
        i.putExtra("d12",d12);
        i.putExtra("d23",d23);
        i.putExtra("d31",d31);
        i.putExtra("mgmdunsymmetrical",mgmdunsym);
        startActivity(i);
    }
}