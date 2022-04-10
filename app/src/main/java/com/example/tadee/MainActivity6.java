package com.example.tadee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {
    TextView textView16;
    EditText editText9;
    TextView textView18;
    EditText editText10;
    TextView textView19;
    EditText editText11;
Button button6;
//static  double yyyy;
    public static String result3; public static String result4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        textView16 = findViewById(R.id.textView16);
        editText9 = findViewById(R.id.editText9);
        textView18 = findViewById(R.id.textView18);
        editText10 = findViewById(R.id.editText10);
        textView19=findViewById(R.id.textView19);
        editText11=findViewById(R.id.editText11);
        button6=findViewById(R.id.button6);

//        Intent k = getIntent();
        String inductance = MainActivity5.xae12;
        String capacitance = MainActivity5.xae13;

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double ind = Double.parseDouble(inductance);
                double cap = Double.parseDouble(capacitance);
                String t1=editText9.getText().toString();
                double linelength=Double.parseDouble(t1);

                String t2=editText10.getText().toString();
                double lineresistance=Double.parseDouble(t2);

                double totalInductance=ind*linelength;
                double totalCapacitance=cap*linelength;

                String freq=editText11.getText().toString();
                double t3=Double.parseDouble(freq);

                double inductiveReactance= 2 * 3.14 * t3 * totalInductance;
                String str1=String.valueOf(inductiveReactance);
                result3=str1;
                double capacitiveReactance= 1/(2 * 3.14 * t3 * totalCapacitance);
                String str2=String.valueOf(capacitiveReactance);
                result4=str2;
                double totalresistance=linelength*lineresistance;
                String str3=String.valueOf(totalresistance);

//                yyyy=1/capacitiveReactance;

                Intent i=new Intent(MainActivity6.this,MainActivity7.class);
                i.putExtra("Inductance1",inductance);
                i.putExtra("Capacitance1",capacitance);
                i.putExtra("InductiveReactance",str1);
                i.putExtra("CapacitiveReactance",str2);
                i.putExtra("TotalResistance",str3);
                startActivity(i);
            }
        });



    }
}