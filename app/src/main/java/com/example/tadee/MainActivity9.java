package com.example.tadee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity9 extends AppCompatActivity {
TextView textView24;
TextView textView25;
TextView textView26;
EditText editText12;
EditText editText13;
EditText editText14;
Button button11;
    public static String result5;
public static String result7; public static String result8; public static String result9; public static String result10; public static String result11;public static String result15;
public static String result12x; public static String result12y; public static String result12r; public static String result13x; public static String result13y; public static String result13r;
public static double comp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        textView24=findViewById(R.id.textView24);
        textView25=findViewById(R.id.textView25);
        textView26=findViewById(R.id.textView27);

        editText12=findViewById(R.id.editText12);
        editText13=findViewById(R.id.editText13);
        editText14=findViewById(R.id.editText14);
        button11=findViewById(R.id.button11);

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=editText12.getText().toString();
                double Vrdash=Double.parseDouble(str1);
                double VrThreePhaseinV=Vrdash*1000;
                double Vr=VrThreePhaseinV/1.732; // per phase receiving end voltage

                String str2=editText13.getText().toString();
                double Prdash=Double.parseDouble(str2);
                double Pr=Prdash*1000000;

                String str3=editText14.getText().toString();
                double pf=Double.parseDouble(str3);

                double Ir=Pr/(3*Vr*pf);
                double x=(1-(pf*pf));
                double y=Math.sqrt(x);
                double Reir=Ir*pf;
                double Imir=Ir*y;

                double ReVs=(Vr*(MainActivity7.ReA))+((MainActivity7.ReB)*Ir*pf) + ((MainActivity7.ImB)*Ir*y); //per phase
                double ImVs=((MainActivity7.ImA)*Vr)+((MainActivity7.ImB)*Ir*pf) - ((MainActivity7.ReB)*Ir*y); // per phase

                double totalSendingEndVoltage=(magnitude(ReVs,ImVs)*1.732)/1000;// total means 3-phase sending end voltage in kV
                String ss1=String.valueOf(totalSendingEndVoltage);
                result7=ss1;

                double ReIs=(Vr*(MainActivity7.ReC)) + ((MainActivity7.ReD)*Ir*pf) + ((MainActivity7.ImD)*Ir*y);
                double ImIs=((MainActivity7.ImC)*Vr) + ((MainActivity7.ImD)*Ir*pf)-((MainActivity7.ReD)*Ir*y);
                double sendingEndCurrent=magnitude(ReIs,ImIs); // sending end current in A
                String ss2=String.valueOf(sendingEndCurrent);
                result8=ss2;

                double ReIcharging=Vr*MainActivity7.ReC;
                double ImIcharging=Vr*MainActivity7.ImC;
                double Icharging = magnitude(ReIcharging,ImIcharging); //per phase charging current
                String ss6=String.valueOf(Icharging);
                result5=ss6;


                double xyz=(ImVs*ImVs)+(ReVs*ReVs);
                double magnitudeOfVs=Math.sqrt(xyz); // per phase magnitude of Vs
                double magnitudeOfA=magnitude(MainActivity7.ReA,MainActivity7.ImA);

                double v=((magnitudeOfVs/magnitudeOfA)-Vr)/Vr;
                double voltageRegulation=v*(100.0);
                String ss3=String.valueOf(voltageRegulation);
                result9=ss3;

                double RePsending=ReVs*ReIs + ImVs*ImIs;
                double RePreceiving=Vr*Reir;
                double PowerLoss=(3*(RePsending-RePreceiving))/1000000;  // 3-phase power loss in MW
                String ss4=String.valueOf(PowerLoss);
                result10=ss4;

                double efficiency=(RePreceiving*100)/RePsending;
                String ss5=String.valueOf(efficiency);
                result11=ss5;



                double beta=Math.atan((MainActivity7.ImB)/(MainActivity7.ReB));   double alpha=Math.atan((MainActivity7.ImA)/(MainActivity7.ReA));
                double cosOfBetaminusAlpha=Math.cos(beta-alpha);
                double sinOfBetaminusAlpha=Math.sin(beta-alpha);
                double receivingCentreXCord=-(magnitude(MainActivity7.ReA,MainActivity7.ImA))*Vr*Vr*3*cosOfBetaminusAlpha/magnitude(MainActivity7.ReB,MainActivity7.ImB);
                double receivingCentreYCord=-(magnitude(MainActivity7.ReA,MainActivity7.ImA))*Vr*Vr*3*sinOfBetaminusAlpha/magnitude(MainActivity7.ReB,MainActivity7.ImB);
                double radiusOfReceiving=Vr*magnitude(ReVs,ImVs)*3/magnitude(MainActivity7.ReB,MainActivity7.ImB);
                String sr1=String.valueOf(receivingCentreXCord);
                String sr2=String.valueOf(receivingCentreYCord);
                String sr3=String.valueOf(radiusOfReceiving);
                result13x=sr1; result13y=sr2; result13r=sr3;

                double delta=Math.atan(MainActivity7.ImD/MainActivity7.ReD);
                double cosOfBetaminusdelta=Math.cos(beta-delta);
                double sinOfBetaminusdelta=Math.sin(beta-delta);

                double sendingCentreXCord=magnitude(MainActivity7.ReD,MainActivity7.ImD)*magnitude(ReVs,ImVs)*magnitude(ReVs,ImVs)*3*cosOfBetaminusdelta/magnitude(MainActivity7.ReB,MainActivity7.ImB);
                double sendingCentreYCord=magnitude(MainActivity7.ReD,MainActivity7.ImD)*magnitude(ReVs,ImVs)*magnitude(ReVs,ImVs)*3*sinOfBetaminusdelta/magnitude(MainActivity7.ReB,MainActivity7.ImB);
                double radiusOfSending=magnitude(ReVs,ImVs)*Vr*3/magnitude(MainActivity7.ReB,MainActivity7.ImB);
                String rs1=String.valueOf(sendingCentreXCord);
                String rs2=String.valueOf(sendingCentreYCord);
                String rs3=String.valueOf(radiusOfSending);
                result12x=rs1; result12y=rs2; result12r=rs3;
                double Qr=(-Vr*Imir*3)/1000000; // 3-phase Qr in MVar
                comp=Qr;
                String ss7=String.valueOf(Qr);
                result15=ss7;

                Intent i=new Intent(MainActivity9.this,MainActivity10.class);
                startActivity(i);
            }
        });

    }

    public double magnitude(double real,double imaginary)
    {
        double x=(real*real)+(imaginary*imaginary);
        double y=Math.sqrt(x);
        return y;
    }
}