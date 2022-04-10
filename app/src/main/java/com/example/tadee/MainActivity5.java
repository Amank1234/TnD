package com.example.tadee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Double.valueOf;

public class MainActivity5 extends AppCompatActivity {
TextView textView12;
//    TextView textView11;
TextView textView13;
TextView textView14;
TextView textView15;
//    TextView textView5;
//    TextView textView20;
EditText editText5;
EditText editText6;
EditText editText7;
EditText editText8;
Button button5;
   public static String mgmd; public static String xae12; public static String xae13;
   public static String result1; public static String result2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        textView12=findViewById(R.id.textView12);
//        textView11=findViewById(R.id.textView11);
        textView13=findViewById(R.id.textView13);
        textView14=findViewById(R.id.textView14);
        textView15=findViewById(R.id.textView15);
//        textView5=findViewById(R.id.textView5);
//        textView20=findViewById(R.id.textView20);
        button5=findViewById(R.id.button5);

        editText5=findViewById(R.id.editText5);
        editText6=findViewById(R.id.editText6);
        editText7=findViewById(R.id.editText7);
        editText8=findViewById(R.id.editText8);
        Intent k=getIntent();
//        mgmd=k.getStringExtra("mgmd");
        if(MainActivity2.count==3)
        {
            mgmd=k.getStringExtra("mgmdsymmetrical");
        }
        else if(MainActivity2.count==4)
        {
            mgmd=k.getStringExtra("mgmdunsymmetrical");
        }
//        textView5.setText(mgmd);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=editText5.getText().toString();
                int ns=Integer.parseInt(s1);
                if(ns==2)
                {
                    String s2=editText8.getText().toString();
                    int givenN=Integer.parseInt(s2);
                    int n=0;

                    for(int i=1;i<=100;i++)
                    {
                        int calcN=(3*i*i)-(3*i)+1;
                        if(calcN==givenN)
                        {
                            n=i;
                        }
                        else if(calcN>givenN)
                        {
                            break;
                        }
                    }
                    String dia=editText7.getText().toString();
                    double diameter = Double.parseDouble(dia);
                    Double nn=Double.valueOf(n);
                    double r=(nn-0.5)*diameter;
                    double rdash=0.7788*r;

                    String spacing=editText6.getText().toString();
                    double s12=Double.parseDouble(spacing);

                    double sgmd=Math.pow((s12*rdash),0.5);
                    double sgmdforcapacitance=Math.pow((s12*r),0.5);
                    double mgmdnew=Double.parseDouble(mgmd);
                    double x1=mgmdnew/sgmd;
                    double x2=mgmdnew/sgmdforcapacitance;

                    double inductance=0.0002*Math.log(x1);
                    String res=String.valueOf(inductance);
//                    textView11.setText(res);
result1=res;
                    double capacitance=0.0000000556/Math.log(x2);
                    String rescap=String.valueOf(capacitance);
//                    textView20.setText(rescap);
                    result2=rescap;
xae12=res; xae13=rescap;
                    Intent i=new Intent(MainActivity5.this,MainActivity6.class);

                    startActivity(i);

                }
                else if(ns==3)
                {
                    String s2=editText8.getText().toString();
                    int givenN=Integer.parseInt(s2);
                    int n=0;

                    for(int i=1;i<=100;i++)
                    {
                        int calcN=(3*i*i)-(3*i)+1;
                        if(calcN==givenN)
                        {
                            n=i;
                        }
                        else if(calcN>givenN)
                        {
                            break;
                        }
                    }
                    String dia=editText7.getText().toString();
                    double diameter = Double.parseDouble(dia);
                    Double nn=Double.valueOf(n);
                    double r=(nn-0.5)*diameter;
                    double rdash=0.7788*r;

                    String spacing=editText6.getText().toString();
                    double s12=Double.parseDouble(spacing);

                    double sgmd=Math.pow((s12*s12*rdash),0.34);
                    double sgmdforcapacitance=Math.pow((s12*r*s12),0.34);
                    double mgmdnew=Double.parseDouble(mgmd);
                    double x1=mgmdnew/sgmd;
                    double x2=mgmdnew/sgmdforcapacitance;

                    double inductance=0.0002*Math.log(x1);
                    String res=String.valueOf(inductance);
//                    textView11.setText(res);
                    result1=res;
                    double capacitance=0.0000000556/Math.log(x2);
                    String rescap=String.valueOf(capacitance);
//                    textView20.setText(rescap);
                    result2=rescap;
                    xae12=res; xae13=rescap;
                    Intent i=new Intent(MainActivity5.this,MainActivity6.class);

                    startActivity(i);

                }
                else if(ns==4)
                {
                    String s2=editText8.getText().toString();
                    int givenN=Integer.parseInt(s2);
                    int n=0;

                    for(int i=1;i<=100;i++)
                    {
                        int calcN=(3*i*i)-(3*i)+1;
                        if(calcN==givenN)
                        {
                            n=i;
                        }
                        else if(calcN>givenN)
                        {
                            break;
                        }
                    }
                    String dia=editText7.getText().toString();
                    double diameter = Double.parseDouble(dia);
                    Double nn=Double.valueOf(n);
                    double r=(nn-0.5)*diameter;
                    double rdash=0.7788*r;

                    String spacing=editText6.getText().toString();
                    double s12=Double.parseDouble(spacing);

                    double sgmd=Math.pow((s12*s12*s12*rdash*1.414),0.25);
                    double sgmdforcapacitance=Math.pow((s12*r*s12*s12*1.414),0.25);
                    double mgmdnew=Double.parseDouble(mgmd);
                    double x1=mgmdnew/sgmd;
                    double x2=mgmdnew/sgmdforcapacitance;

                    double inductance=0.0002*Math.log(x1);
                    String res=String.valueOf(inductance);
//                    textView11.setText(res);
                    result1=res;
                    double capacitance=0.0000000556/Math.log(x2);
                    String rescap=String.valueOf(capacitance);
//                    textView20.setText(rescap);
                    result2=rescap;
                    xae12=res; xae13=rescap;
                    Intent i=new Intent(MainActivity5.this,MainActivity6.class);

                    startActivity(i);

                }
                else if(ns==5)
                {
                    String s2=editText8.getText().toString();
                    int givenN=Integer.parseInt(s2);
                    int n=0;

                    for(int i=1;i<=100;i++)
                    {
                        int calcN=(3*i*i)-(3*i)+1;
                        if(calcN==givenN)
                        {
                            n=i;
                        }
                        else if(calcN>givenN)
                        {
                            break;
                        }
                    }
                    String dia=editText7.getText().toString();
                    double diameter = Double.parseDouble(dia);
                    Double nn=Double.valueOf(n);
                    double r=(nn-0.5)*diameter;
                    double rdash=0.7788*r;

                    String spacing=editText6.getText().toString();
                    double s12=Double.parseDouble(spacing);

                    double sgmd=Math.pow((s12*s12*rdash*s12*s12*1.618*1.618),0.2);
                    double sgmdforcapacitance=Math.pow((s12*r*s12*s12*s12*1.618*1.618),0.2);
                    double mgmdnew=Double.parseDouble(mgmd);
                    double x1=mgmdnew/sgmd;
                    double x2=mgmdnew/sgmdforcapacitance;

                    double inductance=0.0002*Math.log(x1);
                    String res=String.valueOf(inductance);
//                    textView11.setText(res);
                    result1=res;
                    double capacitance=0.0000000556/Math.log(x2);
                    String rescap=String.valueOf(capacitance);
//                    textView20.setText(rescap);
                    result2=rescap;
                    xae12=res; xae13=rescap;
                    Intent i=new Intent(MainActivity5.this,MainActivity6.class);

                    startActivity(i);

                }
                else if(ns==6)
                {
                    String s2=editText8.getText().toString();
                    int givenN=Integer.parseInt(s2);
                    int n=0;

                    for(int i=1;i<=100;i++)
                    {
                        int calcN=(3*i*i)-(3*i)+1;
                        if(calcN==givenN)
                        {
                            n=i;
                        }
                        else if(calcN>givenN)
                        {
                            break;
                        }
                    }
                    String dia=editText7.getText().toString();
                    double diameter = Double.parseDouble(dia);
                    Double nn=Double.valueOf(n);
                    double r=(nn-0.5)*diameter;
                    double rdash=0.7788*r;

                    String spacing=editText6.getText().toString();
                    double s12=Double.parseDouble(spacing);

                    double sgmd=Math.pow((s12*s12*rdash*s12*s12*s12*6),0.167);
                    double sgmdforcapacitance=Math.pow((s12*r*s12*s12*s12*s12*6),0.167);
                    double mgmdnew=Double.parseDouble(mgmd);
                    double x1=mgmdnew/sgmd;
                    double x2=mgmdnew/sgmdforcapacitance;

                    double inductance=0.0002*Math.log(x1);
                    String res=String.valueOf(inductance);
//                    textView11.setText(res);
                    result1=res;
                    double capacitance=0.0000000556/Math.log(x2);
                    String rescap=String.valueOf(capacitance);
//                    textView20.setText(rescap);
                    result2=rescap;
                    xae12=res; xae13=rescap;
                    Intent i=new Intent(MainActivity5.this,MainActivity6.class);

                    startActivity(i);

                }
                else
                {
                    Toast.makeText(MainActivity5.this, "Please limit number of sub-conductors !", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
//    public void next3(View v)
//    {
//        String s1=editText5.getText().toString();
//        int ns=Integer.parseInt(s1);
//        if(ns==2)
//        {
//            String s2=editText8.getText().toString();
//            int givenN=Integer.parseInt(s2);
//            int n=0;
//
//            for(int i=1;i<=100;i++)
//            {
//                int calcN=(3*i*i)-(3*i)+1;
//                if(calcN==givenN)
//                {
//                    n=i;
//                }
//                else if(calcN>givenN)
//                {
//                    break;
//                }
//            }
//            String dia=editText7.getText().toString();
//            double diameter = Double.parseDouble(dia);
//            Double nn=Double.valueOf(n);
//            double r=(nn-0.5)*diameter;
//            double rdash=0.7788*r;
//
//            String spacing=editText6.getText().toString();
//            double s12=Double.parseDouble(spacing);
//
//            double sgmd=Math.pow((s12*rdash),0.5);
//double mgmdnew=Double.parseDouble(MainActivity5.mgmd);
//double x1=mgmdnew/sgmd;
//
//double inductance=0.0000002*Math.log(x1);
//String res=String.valueOf(inductance);
//textView11.setText(res);
//        }
//        else if(ns==3)
//        {
//
//        }
//        else if(ns==4)
//        {
//
//        }
//        else if(ns==5)
//        {
//
//        }
//        else if(ns==6)
//        {
//
//        }
//    }
}