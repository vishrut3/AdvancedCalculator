package com.example.vibhavkotriwala.advancedcalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class soleqeActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnans, btnan;
    private EditText editText, editText2, editText3, editText4, editText5, editText6, et11, et22, et33, et44, et55, et66, et10, et21, et32, et43, et54, et65;
    private TextView textView28, textView12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soleqe);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        init4();
    }
    private void init4(){
        btnans = (Button) findViewById(R.id.btnans);
        btnan = (Button) findViewById(R.id.btnan);
        et11 = (EditText) findViewById(R.id.et11);
        et22 = (EditText) findViewById(R.id.et22);
        et33 = (EditText) findViewById(R.id.et33);
        et44 = (EditText) findViewById(R.id.et44);
        et55 = (EditText) findViewById(R.id.et55);
        et66 = (EditText) findViewById(R.id.et66);
        et10 = (EditText) findViewById(R.id.et10);
        et21 = (EditText) findViewById(R.id.et21);
        et32 = (EditText) findViewById(R.id.et32);
        et43 = (EditText) findViewById(R.id.et43);
        et54 = (EditText) findViewById(R.id.et54);
        et65 = (EditText) findViewById(R.id.et65);
        textView12 = (TextView) findViewById(R.id.textView12);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);
        editText5 = (EditText) findViewById(R.id.editText5);
        editText6 = (EditText) findViewById(R.id.editText6);
        textView28 = (TextView) findViewById(R.id.textView28);
        btnans.setOnClickListener(this);
        btnan.setOnClickListener(this);
    }
    @Override
    public void onClick (View view){
        String zz = textView28.getText().toString();
        switch (view.getId()){
            case (R.id.btnans):
                String aa = editText.getText().toString();
                String bb = editText2.getText().toString();
                String cc = editText3.getText().toString();
                String dd = editText4.getText().toString();
                String ee = editText5.getText().toString();
                String ff = editText6.getText().toString();
                if (aa.contains("+")) {
                    if (cc.contains("+")){
                        if (ee.contains("+")){
                            double a = Double.parseDouble(bb);
                            double b = Double.parseDouble(dd);
                            double c = Double.parseDouble(ff);
                            double d = (-(b) + Math.sqrt((Math.pow(b, 2)) - (4*a*c))) / 2*a ;
                            double e = (-(b) - Math.sqrt((Math.pow(b, 2)) - (4*a*c))) / 2*a ;
                            String z = String.valueOf(d);
                            String y = String.valueOf(e);
                            textView28.setText(y + " and " + z);
                        }
                        else if(ee.contains("-")){
                            double a = Double.parseDouble(bb);
                            double b = Double.parseDouble(dd);
                            double f = Double.parseDouble(ff);
                            double c = -(f);
                            double d = (-(b) + Math.sqrt((Math.pow(b, 2)) - (4*a*c))) / 2*a ;
                            double e = (-(b) - Math.sqrt((Math.pow(b, 2)) - (4*a*c))) / 2*a ;
                            String z = String.valueOf(d);
                            String y = String.valueOf(e);
                            textView28.setText(y + " and " + z);
                        }
                        else{
                            textView28.setText("");
                        }
                    }
                    else if (cc.contains("-")) {
                        if (ee.contains("+")) {
                            double a = Double.parseDouble(bb);
                            double f = Double.parseDouble(dd);
                            double b = -(f);
                            double c = Double.parseDouble(ff);
                            double d = (-(b) + Math.sqrt((Math.pow(b, 2)) - (4*a*c))) / 2*a ;
                            double e = (-(b) - Math.sqrt((Math.pow(b, 2)) - (4*a*c))) / 2*a ;
                            String z = String.valueOf(d);
                            String y = String.valueOf(e);
                            textView28.setText(y + " and " + z);
                        }
                        else if (ee.contains("-")){
                            double a = Double.parseDouble(bb);
                            double f = Double.parseDouble(dd);
                            double b = -(f);
                            double g = Double.parseDouble(ff);
                            double c = -(g);
                            double d = (-(b) + Math.sqrt((Math.pow(b, 2)) - (4*a*c))) / 2*a ;
                            double e = (-(b) - Math.sqrt((Math.pow(b, 2)) - (4*a*c))) / 2*a ;
                            String z = String.valueOf(d);
                            String y = String.valueOf(e);
                            textView28.setText(y + " and " + z);
                        }
                        else {
                            textView28.setText("");
                        }
                    }
                    else{
                        textView28.setText("");
                    }
                }
                else if(aa.contains("-")){
                    if (cc.contains("+")){
                        if (ee.contains("+")){
                            double a = Double.parseDouble(bb);
                            double f = Double.parseDouble(dd);
                            double b = -(f);
                            double g = Double.parseDouble(ff);
                            double c = -(g);
                            double d = (-(b) + Math.sqrt((Math.pow(b, 2)) - (4*a*c))) / 2*a ;
                            double e = (-(b) - Math.sqrt((Math.pow(b, 2)) - (4*a*c))) / 2*a ;
                            String z = String.valueOf(d);
                            String y = String.valueOf(e);
                            textView28.setText(y + " and " + z);
                        }
                        else if (ee.contains("-")){
                            double a = Double.parseDouble(bb);
                            double f = Double.parseDouble(dd);
                            double b = -(f);
                            double c = Double.parseDouble(ff);
                            double d = (-(b) + Math.sqrt((Math.pow(b, 2)) - (4*a*c))) / 2*a ;
                            double e = (-(b) - Math.sqrt((Math.pow(b, 2)) - (4*a*c))) / 2*a ;
                            String z = String.valueOf(d);
                            String y = String.valueOf(e);
                            textView28.setText(y + " and " + z);
                        }
                        else {
                            textView28.setText("");
                        }
                    }
                    else if (cc.contains("-")){
                        if (ee.contains("+")){
                            double a = Double.parseDouble(bb);
                            double b = Double.parseDouble(dd);
                            double g = Double.parseDouble(ff);
                            double c = -(g);
                            double d = (-(b) + Math.sqrt((Math.pow(b, 2)) - (4*a*c))) / 2*a ;
                            double e = (-(b) - Math.sqrt((Math.pow(b, 2)) - (4*a*c))) / 2*a ;
                            String z = String.valueOf(d);
                            String y = String.valueOf(e);
                            textView28.setText(y + " and " + z);
                        }
                        else if (ee.contains("-")){
                            double a = Double.parseDouble(bb);
                            double b = Double.parseDouble(dd);
                            double c = Double.parseDouble(ff);
                            double d = (-(b) + Math.sqrt((Math.pow(b, 2)) - (4*a*c))) / 2*a ;
                            double e = (-(b) - Math.sqrt((Math.pow(b, 2)) - (4*a*c))) / 2*a ;
                            String z = String.valueOf(d);
                            String y = String.valueOf(e);
                            textView28.setText(y + " and " + z);
                        }
                        else {
                            textView28.setText("");
                        }
                    }
                }
                else {
                    textView28.setText("");
                }
                break;
            case (R.id.btnan):
                String a0 = et11.getText().toString();
                String b0 = et10.getText().toString();
                String a3 = et22.getText().toString();
                String b3 = et21.getText().toString();
                String a4 = et33.getText().toString();
                String b4 = et32.getText().toString();
                String a5 = et44.getText().toString();
                String b5 = et43.getText().toString();
                String a6 = et55.getText().toString();
                String b6 = et54.getText().toString();
                String a7 = et66.getText().toString();
                String b7 = et65.getText().toString();
                if (a0.isEmpty() || b0.isEmpty() || a3.isEmpty() || b3.isEmpty() || a4.isEmpty() || b4.isEmpty() ||a5.isEmpty() || b5.isEmpty() || a6.isEmpty() || b6.isEmpty() ||a7.isEmpty() || b7.isEmpty()){
                    textView12.setText("PLEASE ENTER VALID VALUES");
                }
                else{
                    double a = Double.parseDouble(et22.getText().toString());
                    double b = Double.parseDouble(et21.getText().toString());
                    double a1 = Double.parseDouble(et33.getText().toString() + et44.getText().toString());
                    double b1 = Double.parseDouble(et32.getText().toString() + et43.getText().toString());
                    double a2 = Double.parseDouble(et55.getText().toString() + et66.getText().toString());
                    double b2 = Double.parseDouble(et54.getText().toString() + et65.getText().toString());
                    if (a0.equals("+") && b0.equals("+")) {
                        if (a > b) {
                            double c = a / b;
                            double e = b1 * c;
                            double f = b2 * c;
                            double g = a1 - e;
                            double h = a2 - f;
                            double y = h / g;
                            double x = (a2 - (a1 * y)) / a;
                            textView12.setText("x = " + x + " and y = " + y);
                        } else if (b > a) {
                            double c = b / a;
                            double e = b1 * c;
                            double f = b2 * c;
                            double g = b1 - e;
                            double h = b2 - f;
                            double y = h / g;
                            double x = (b2 - (b1 * y)) / b;
                            textView12.setText("x = " + x + " and y = " + y);
                        } else if (a == b) {
                            if (String.valueOf(a).isEmpty()) {
                                textView12.setText("PLEASE ENTER VALID VALUES");
                            }
                            else if((a2==b2) && (a1==b1)){
                                textView12.setText("IMPROPER EQUATIONS");
                            }
                            else {
                                double c = a1 - b1;
                                double d = a2 - b2;
                                double y = d / c;
                                double x = -((a2 - (a1 * y)) / a);
                                textView12.setText("x = " + x + " and y = " + y);
                            }
                        }
                    } else if (a0.equals("+") && b0.equals("-")) {
                        if (a > b) {
                            double c = a / b;
                            double e = b1 * c;
                            double f = b2 * c;
                            double g = a1 + e;
                            double h = a2 + f;
                            double y = h / g;
                            double x = (a2 - (a1 * y)) / a;
                            textView12.setText("x = " + x + " and y = " + y);
                        } else if (b > a) {
                            double c = b / a;
                            double e = b1 * c;
                            double f = b2 * c;
                            double g = b1 + e;
                            double h = b2 + f;
                            double y = h / g;
                            double x = (b2 - (b1 * y)) / b;
                            textView12.setText("x = " + x + " and y = " + y);
                        } else if (a == b) {
                            double c = a1 + b1;
                            double d = a2 + b2;
                            double y = d / c;
                            double x = (a2 - (a1 * y)) / a;
                            textView12.setText("x = " + x + " and y = " + y);
                        }
                    } else if (a0.equals("-") && b0.equals("+")) {
                        if (a > b) {
                            double c = a / b;
                            double e = b1 * c;
                            double f = b2 * c;
                            double g = a1 + e;
                            double h = a2 + f;
                            double y = h / g;
                            double x = -((a2 - (a1 * y)) / a);
                            textView12.setText("x = " + x + " and y = " + y);
                        } else if (b > a) {
                            double c = b / a;
                            double e = b1 * c;
                            double f = b2 * c;
                            double g = b1 + e;
                            double h = b2 + f;
                            double y = h / g;
                            double x = -(b2 - (b1 * y)) / b;
                            textView12.setText("x = " + x + " and y = " + y);
                        } else if (a == b) {
                            double c = a1 + b1;
                            double d = a2 + b2;
                            double y = d / c;
                            double x = -((a2 - (a1 * y)) / a);
                            textView12.setText("x = " + x + " and y = " + y);
                        }
                    } else if (a0.equals("-") && b0.equals("-")) {
                        if (a > b) {
                            double c = a / b;
                            double d = b * c;
                            double e = b1 * c;
                            double f = b2 * c;
                            double g = a1 - e;
                            double h = a2 - f;
                            double y = h / g;
                            double x = -((a2 - (a1 * y)) / a);
                            textView12.setText("x = " + x + " and y = " + y);
                        } else if (b > a) {
                            double c = b / a;
                            double e = b1 * c;
                            double f = b2 * c;
                            double g = b1 - e;
                            double h = b2 - f;
                            double y = h / g;
                            double x = -((b2 - (b1 * y)) / b);
                            textView12.setText("x = " + x + " and y = " + y);
                        } else if (a == b) {
                            if (String.valueOf(a).isEmpty()) {
                                textView12.setText("PLEASE ENTER VALID VALUES");
                            }
                            else if((a2==b2) && (a1==b1)){
                                textView12.setText("IMPROPER EQUATIONS");
                            }
                            else {
                                double c = a1 - b1;
                                double d = a2 - b2;
                                double y = d / c;
                                double x = -((a2 - (a1 * y)) / a);
                                textView12.setText("x = " + x + " and y = " + y);
                            }
                        }
                    }
                    else{
                        textView12.setText("INVALID");
                    }
                }
                break;
        }
    }
}