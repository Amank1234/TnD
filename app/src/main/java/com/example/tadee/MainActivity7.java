package com.example.tadee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {
Button button7;
Button button8;
Button button9;
static String q1;
static String q2;
static String q3;
static String q4;
static double ReA; static double ImA;  static double ReB; static double ImB; static double ReC; static double ImC; static double ReD; static double ImD;
static double omegaC;
public static int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);
        Intent k=getIntent();
        String p1=k.getStringExtra("Inductance1");
        String p2=k.getStringExtra("Capacitance1");
        String p3=k.getStringExtra("InductiveReactance");
        String p4=k.getStringExtra("CapacitiveReactance");
        String p5=k.getStringExtra("TotalResistance");

        double d1=Double.parseDouble(p1);
        double d2=Double.parseDouble(p2);
        double d3=Double.parseDouble(p3);
        double d4=Double.parseDouble(p4);
        double d5=Double.parseDouble(p5);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=1;
                String as="1"; String cs="0";String ds="1";
                String bs=p5+"+ j("+p3+")";
                q1=as; q2=bs; q3=cs; q4=ds;
omegaC=0.0;
                ReA=1.0; ImA=0.0;
                ReB=d5; ImB=d3;
                ReC=0.0; ImC=0.0;
                ReD=1.0; ImD=0.0;


                Intent i=new Intent(MainActivity7.this,MainActivity8.class);
                i.putExtra("Inductance2",p1);
                i.putExtra("Capacitance2",p2);
                i.putExtra("InductiveReactance2",p3);
                i.putExtra("CapacitiveReactance2",p4);
                i.putExtra("TotalResistance2",p5);
                i.putExtra("As",as);
                i.putExtra("Bs",bs);
                i.putExtra("Cs",cs);
                i.putExtra("Ds",ds);
                startActivity(i);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=2;
double wC=1/d4;
double real=(wC*d3)/2; double imag=(wC*d5)/2;
int x=1; Double xd=Double.valueOf(x);
double adash=xd-real;
String str1=String.valueOf(adash); String str2=String.valueOf(imag);
String am=str1+"+ j("+str2+")";
String bm=p5+"+ j("+p3+")";

double r1=((-xd)*wC*wC*d5)/4;
double i1=(wC-(d3*wC*wC)/4);
String str3=String.valueOf(r1);
String str4=String.valueOf(i1);
String cm=str3+" j("+str4+")";

q1=am; q2=bm; q3=cm; q4=am;
                ReA=adash; ImA=imag;
                ReB=d5; ImB=d3;
                ReC=r1; ImC=i1;
                ReD=adash; ImD=imag;
                omegaC=wC;
                Intent i=new Intent(MainActivity7.this,MainActivity8.class);
                i.putExtra("Inductance2",p1);
                i.putExtra("Capacitance2",p2);
                i.putExtra("InductiveReactance2",p3);
                i.putExtra("CapacitiveReactance2",p4);
                i.putExtra("TotalResistance2",p5);
                i.putExtra("Am",am);
                i.putExtra("Bm",bm);
                i.putExtra("Cm",cm);
                i.putExtra("Dm",am);
                startActivity(i);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=3;
                int x=1; Double xd=Double.valueOf(x);
                double wC=1/d4;
                double real=(-xd*wC*d3); double imag=(wC*d5);
                double a=realunderroot(real,imag);
                double b=imagunderroot(real,imag);

                double re=Math.cosh(a)*Math.cos(b);
                double im=Math.sinh(a)*Math.sin(b)*(-xd);

                String str1=String.valueOf(re); String str2=String.valueOf(im);
                String ansOfA=str1+"+ j("+str2+")";

                double rl=d3/wC; double iy=((-xd)*d5)/wC;

                double pdash=realunderroot(rl,iy);
                double qdash=imagunderroot(rl,iy);

                double re2=Math.sinh(pdash)*Math.cos(qdash);
                double im2=Math.cosh(pdash)*Math.sin(qdash);
                double real2=(pdash*re2)-(qdash*im2);
                double imaginary2=(pdash*im2)+(qdash*re2);
                String s1=String.valueOf(real2); String s2=String.valueOf(imaginary2);
                String ansOfB=s1+"+ j("+s2+")";

                double mg=(pdash*pdash)+(qdash*qdash);
                double magnitude=Math.pow(mg,0.5);
                 double pdoubledash=pdash/magnitude;
                 double qdoubledash=-qdash/magnitude;
                 double real3=(pdoubledash*re2)-(qdoubledash*im2);
                 double imaginary3=(pdoubledash*im2)+(qdoubledash*re2);

                 String s3=String.valueOf(real3); String s4=String.valueOf(imaginary3);
                 String ansOfC=s3+"+ j("+s4+")";



                 q1=ansOfA; q2=ansOfB; q3=ansOfC; q4=ansOfA;

                ReA=re; ImA=im;
                ReB=real2; ImB=imaginary2;
                ReC=real3; ImC=imaginary3;
                ReD=re; ImD=im;
                omegaC=wC;
                Intent i=new Intent(MainActivity7.this,MainActivity8.class);
                i.putExtra("Inductance2",p1);
                i.putExtra("Capacitance2",p2);
                i.putExtra("InductiveReactance2",p3);
                i.putExtra("CapacitiveReactance2",p4);
                i.putExtra("TotalResistance2",p5);
                startActivity(i);
            }
        });

    }
    public double realunderroot(double p,double q)
    {
        double m=(p*p)+(q*q);
        double mag=Math.pow(m,0.25);
        double ang=Math.atan(q/p);
        double angle=ang/2;
        double r=mag*Math.cos(angle);
        return r;
    }
    public double imagunderroot(double p,double q)
    {
        double m=(p*p)+(q*q);
        double mag=Math.pow(m,0.25);
        double ang=Math.atan(q/p);
        double angle=ang/2;
        double r=mag*Math.sin(angle);
        return r;
    }
}