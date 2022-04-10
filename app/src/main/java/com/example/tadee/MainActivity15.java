package com.example.tadee;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
public class MainActivity15 extends AppCompatActivity {
TextView textView63;
    TextView textView64;TextView textView65;TextView textView66; TextView textView67;TextView textView68;ImageView imageView3; Button button21;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        textView63=findViewById(R.id.textView63);
        textView64=findViewById(R.id.textView64);
        textView65=findViewById(R.id.textView65);
        textView66=findViewById(R.id.textView66);
        textView67=findViewById(R.id.textView67);
        textView68=findViewById(R.id.textView68);
//        button18=findViewById(R.id.button18);
        button21=findViewById(R.id.button21);
        imageView3=findViewById(R.id.imageView3);
        textView65.setText(MainActivity9.result13x);
        textView66.setText(MainActivity9.result13y);
        textView68.setText(MainActivity9.result13r);
//        button18.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i =new Intent(MainActivity15.this,MainActivity17.class);
//                startActivity(i);
//            }
//        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                                if(MainActivity7.counter==1) {
                    Intent i = new Intent(MainActivity15.this, MainActivity17.class);
                    startActivity(i);
                }
                else
                {
                    Intent i1=new Intent(MainActivity15.this,MainActivity16.class);
                    startActivity(i1);
                }
            }
        });
    }
}