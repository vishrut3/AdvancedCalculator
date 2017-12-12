package com.example.vibhavkotriwala.advancedcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Collection;

import javax.microedition.khronos.egl.EGLDisplay;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnper, btnrot, btndec, btnbsp, btnclr, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnadd, btnsub, btnmul, btndiv, btnsin, btncos, btntan, btnlog, btnequ;
    private TextView textView, textView2;

    public void chemele(View view){
        Intent intent = new Intent(this, chemeleActivity.class);
        startActivity(intent);
    }
    public void soleqe(View view){
        Intent intent = new Intent(this, soleqeActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        btnper = (Button) findViewById(R.id.btnper);
        btnrot = (Button) findViewById(R.id.btnrot);
        btndec = (Button) findViewById(R.id.btndec);
        btnbsp = (Button) findViewById(R.id.btnbsp);
        btnclr = (Button) findViewById(R.id.btnclr);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btnadd = (Button) findViewById(R.id.btnadd);
        btnsub = (Button) findViewById(R.id.btnsub);
        btnmul = (Button) findViewById(R.id.btnmul);
        btndiv = (Button) findViewById(R.id.btndiv);
        btnsin = (Button) findViewById(R.id.btnsin);
        btncos = (Button) findViewById(R.id.btncos);
        btntan = (Button) findViewById(R.id.btntan);
        btnlog = (Button) findViewById(R.id.btnlog);
        btnequ = (Button) findViewById(R.id.btnequ);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);

        btnper.setOnClickListener(this);
        btnrot.setOnClickListener(this);
        btnbsp.setOnClickListener(this);
        btndec.setOnClickListener(this);
        btnclr.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnadd.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btnmul.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnsin.setOnClickListener(this);
        btncos.setOnClickListener(this);
        btntan.setOnClickListener(this);
        btnlog.setOnClickListener(this);
        btnequ.setOnClickListener(this);
        int width = (getApplicationContext().getResources().getDisplayMetrics().widthPixels) / 4;
        int height = (getApplicationContext().getResources().getDisplayMetrics().heightPixels) / 11;
        btn1.setWidth(width);
        btn1.setHeight(height);
        btn2.setWidth(width);
        btn2.setHeight(height);
        btn3.setWidth(width);
        btn3.setHeight(height);
        btn4.setWidth(width);
        btn4.setHeight(height);
        btn5.setWidth(width);
        btn5.setHeight(height);
        btn6.setWidth(width);
        btn6.setHeight(height);
        btn7.setWidth(width);
        btn7.setHeight(height);
        btn8.setWidth(width);
        btn8.setHeight(height);
        btn9.setWidth(width);
        btn9.setHeight(height);
        btn0.setWidth(width);
        btn0.setHeight(height);
        btnlog.setWidth(width);
        btnlog.setHeight(height);
        btnrot.setWidth(width);
        btnrot.setHeight(height);
        btnper.setWidth(width);
        btnper.setHeight(height);
        btndec.setWidth(width);
        btndec.setHeight(height);
        btnequ.setWidth(width);
        btnequ.setHeight(height);
        btnclr.setWidth(width);
        btnclr.setHeight(height);
        btnbsp.setWidth(width);
        btnbsp.setHeight(height);
        btndiv.setWidth(width);
        btndiv.setHeight(height);
        btnmul.setWidth(width);
        btnmul.setHeight(height);
        btnsub.setWidth(width);
        btnsub.setHeight(height);
        btnadd.setWidth(width);
        btnadd.setHeight(height);
        btnsin.setWidth(width);
        btnsin.setHeight(height);
        btncos.setWidth(width);
        btncos.setHeight(height);
        btntan.setWidth(width);
        btntan.setHeight(height);
        textView.setHeight(height / 2);
        textView2.setHeight(height);
    }


    @Override
    public void onClick(View view) {
        String num1 = textView.getText().toString();
        switch (view.getId()) {
            case (R.id.btnbsp):
                if (num1.equals("")) {
                    textView.setText("");
                } else {
                    int a1 = num1.length() - 1;
                    String num2 = num1.substring(0, a1);
                    textView.setText(num2);
                }
                break;
            case (R.id.btnrot):
                if(num1.contains("+") || num1.contains("-") || num1.contains("/") || num1.contains("x") || num1.equals("")){
                    textView.setText(num1);
                }
                else if(num1.contains(".")){
                    if(num1.contains("0") || num1.contains("1") || num1.contains("2") || num1.contains("3") || num1.contains("4") || num1.contains("5") || num1.contains("6") || num1.contains("7") || num1.contains("8") || num1.contains("9")){
                        double a = Double.parseDouble(num1);
                        String b = String.valueOf(Math.round(Math.sqrt(a) * 10000.0) / 10000.0);
                        textView.setText(b);
                        textView2.setText(b);
                    }
                    else{
                        textView.setText(num1);
                    }
                }
                else{
                    double a = Double.parseDouble(num1);
                    String b = String.valueOf(Math.round(Math.sqrt(a) * 10000.0) / 10000.0);
                    textView.setText(b);
                    textView2.setText(b);
                }
                break;
            case (R.id.btnclr):
                textView.setText("");
                textView2.setText("");
                break;
            case (R.id.btn0):
                textView.setText((String.valueOf(num1) + "0"));
                break;
            case (R.id.btn1):
                textView.setText((String.valueOf(num1) + "1"));
                break;
            case (R.id.btn2):
                textView.setText((String.valueOf(num1) + "2"));
                break;
            case (R.id.btn3):
                textView.setText((String.valueOf(num1) + "3"));
                break;
            case (R.id.btn4):
                textView.setText((String.valueOf(num1) + "4"));
                break;
            case (R.id.btn5):
                textView.setText((String.valueOf(num1) + "5"));
                break;
            case (R.id.btn6):
                textView.setText((String.valueOf(num1) + "6"));
                break;
            case (R.id.btn7):
                textView.setText((String.valueOf(num1) + "7"));
                break;
            case (R.id.btn8):
                textView.setText((String.valueOf(num1) + "8"));
                break;
            case (R.id.btn9):
                textView.setText((String.valueOf(num1) + "9"));
                break;
            case (R.id.btnsin):
                if(num1.equals("")){
                    textView.setText("");
                }
                else if (num1.contains("+") || num1.contains("-") || num1.contains("x") || num1.contains("/") || num1.equals(".")){
                    textView.setText(num1);
                }
                else {
                    double sin1 = Math.sin(Math.toRadians(Double.parseDouble(num1)));
                    double sin = Math.round(sin1 * 10000.0)/10000.0;
                    textView.setText(String.valueOf(sin));
                    textView2.setText(String.valueOf(sin));
                }
                break;
            case (R.id.btncos):
                if(num1.equals("")){
                    textView.setText("");
                }
                else if (num1.contains("+") || num1.contains("-") || num1.contains("x") || num1.contains("/") || num1.equals(".")){
                    textView.setText(num1);
                }
                else {
                    double cos1 = Math.cos(Math.toRadians(Double.parseDouble(num1)));
                    double cos = Math.round(cos1 * 10000.0)/10000.0;
                    textView.setText(String.valueOf(cos));
                    textView2.setText(String.valueOf(cos));
                }
                break;
            case (R.id.btntan):
                if(num1.equals("")){
                    textView.setText("");
                }
                else if (num1.contains("+") || num1.contains("-") || num1.contains("x") || num1.contains("/") || num1.equals(".")){
                    textView.setText(num1);
                }
                else {
                    double tan1 = Math.tan(Math.toRadians(Double.parseDouble(num1)));
                    double tan = Math.round(tan1 * 10000.0)/10000.0;
                    textView.setText(String.valueOf(tan));
                    textView2.setText(String.valueOf(tan));
                }
                break;
            case (R.id.btnlog):
                if(num1.equals("")){
                    textView.setText("");
                }
                else if (num1.contains("+") || num1.contains("-") || num1.contains("x") || num1.contains("/") || num1.equals(".")){
                    textView.setText(num1);
                }
                else {
                    double log1 = Math.log10(Double.parseDouble(num1));
                    double log = Math.round(log1 * 10000.0)/10000.0;
                    textView.setText(String.valueOf(log));
                    textView2.setText(String.valueOf(log));
                }
                break;
            case (R.id.btndec):
                int ua = num1.length() - 1;
                String ja = String.valueOf(ua);
                String pa = String.valueOf(num1.lastIndexOf("."));
                String ka = String.valueOf(num1.lastIndexOf("+"));
                String la = String.valueOf(num1.lastIndexOf("-"));
                String ma = String.valueOf(num1.lastIndexOf("x"));
                String na = String.valueOf(num1.lastIndexOf("/"));
                String oa = String.valueOf(num1.lastIndexOf("."));
                textView.setText(num1);
                String yz = "^[0-9]*$";
                if (num1.equals("")){
                    textView.setText("0.");
                }
                if (ja.equals(ka) || ja.equals(la) || ja.equals(ma) || ja.equals(na) || ja.equals(oa) || ja.equals(pa)){
                    textView.setText(num1);
                }
                if (num1.matches(yz)){
                    textView.setText(num1 + ".");
                }
                if (num1.contains("-")){
                    if (ja.equals(la)){
                        textView.setText(num1);
                    }
                    else {
                        String parts[] = num1.split("-");
                        if (parts[1].contains(".")){
                            textView.setText(num1);
                        }
                        else {
                            textView.setText(num1 + ".");
                        }
                    }
                }
                if (num1.contains("+")){
                    if (ja.equals(ka)){
                        textView.setText(num1);
                    }
                    else {
                        String parts[] = num1.split("[+]");
                        if (parts[1].contains(".")) {
                            textView.setText(num1);
                        } else {
                            textView.setText(num1 + ".");
                        }
                    }
                }
                if (num1.contains("x")){
                    if (ja.equals(ma)){
                        textView.setText(num1);
                    }
                    else {
                        String parts[] = num1.split("x");
                        if (parts[1].contains(".")) {
                            textView.setText(num1);
                        } else {
                            textView.setText(num1 + ".");
                        }
                    }
                }
                if (num1.contains("/")) {
                    if (ja.equals(na)) {
                        textView.setText(num1);
                    } else {
                        String parts[] = num1.split("/");
                        if (parts[1].contains(".")) {
                            textView.setText(num1);
                        } else {
                            textView.setText(num1 + ".");
                        }
                    }
                }
                if(num1.equals("[0-9]*$")){
                    textView.setText(num1 + ".");
                }
                break;
            case (R.id.btnequ):
                int u0 = num1.length() - 1;
                String j0 = String.valueOf(u0);
                String k0 = String.valueOf(num1.indexOf("+"));
                String l0 = String.valueOf(num1.indexOf("-"));
                String m0 = String.valueOf(num1.indexOf("x"));
                String n0 = String.valueOf(num1.indexOf("/"));
                String o0 = String.valueOf(num1.indexOf("."));
                String p0 = String.valueOf(num1.lastIndexOf("-"));
                textView.setText(num1);
                if (num1.equals("")) {
                    textView.setText("");
                }
                if (j0.equals(k0) || j0.equals(l0) || j0.equals(m0) || j0.equals(n0) || j0.equals(o0)){
                    textView.setText(num1);
                }
                if (num1.contains("-")) {
                    if (l0.equals("0")) {
                        if (j0.equals(p0)) {
                            textView.setText(num1);
                        }
                        else if (num1.contains(" ")) {
                            String parts[] = num1.split(" ");
                            String a = parts[0];
                            String b = parts[1];
                            double ak = Double.parseDouble(a);
                            double bk = Double.parseDouble(b);
                            double pl = ak + bk;
                            String plpl = String.valueOf(pl);
                            textView.setText(plpl);
                            textView2.setText(plpl);
                        }
                    }
                    else if(j0.equals(l0)){
                        textView.setText(num1);
                    }
                    else if (num1.contains("x")) {
                        if (j0.equals(m0)) {
                            textView.setText(num1);
                        }
                        else if(j0.equals(l0) || j0.equals(p0)){
                            textView.setText(num1);
                        }
                        else {
                            String parts[] = num1.split("x");
                            String a = parts[0];
                            String b = parts[1];
                            double ak = Double.parseDouble(a);
                            double bk = Double.parseDouble(b);
                            double mul = ak * bk;
                            String muls = String.valueOf(mul);
                            textView.setText((muls));
                            textView2.setText(muls);
                        }
                    }
                    else if (num1.contains("/")) {
                        if (j0.equals(n0)) {
                            textView.setText(num1);
                        }
                        else if(j0.equals(l0) || j0.equals(p0)){
                            textView.setText(num1);
                        }
                        else {
                            String parts[] = num1.split("/");
                            String a = parts[0];
                            String b = parts[1];
                            double ak = Double.parseDouble(a);
                            double bk = Double.parseDouble(b);
                            double div = ak / bk;
                            String divs = String.valueOf(div);
                            textView.setText((divs));
                            textView2.setText(divs);
                        }
                    }
                    else {
                        String parts[] = num1.split("-");
                        String a = parts[0];
                        String b = parts[1];
                        double ak = Double.parseDouble(a);
                        double bk = Double.parseDouble(b);
                        double sub = ak - bk;
                        String subs = String.valueOf(sub);
                        textView.setText(String.valueOf(subs));
                        textView2.setText(String.valueOf(subs));
                    }
                }
                if (num1.contains("/")) {
                    if (j0.equals(n0)) {
                        textView.setText(num1);
                    }
                    else if(j0.equals(l0) || j0.equals(p0)){
                        textView.setText(num1);
                    }
                    else {
                        String parts[] = num1.split("/");
                        String a = parts[0];
                        String b = parts[1];
                        double ak = Double.parseDouble(a);
                        double bk = Double.parseDouble(b);
                        double div = ak / bk;
                        String divs = String.valueOf(div);
                        textView.setText((divs));
                        textView2.setText(divs);
                    }
                }
                if (num1.contains("x")) {
                    if (j0.equals(m0)) {
                        textView.setText(num1);
                    }
                    else if(j0.equals(l0) || j0.equals(p0)){
                        textView.setText(num1);
                    }
                    else {
                        String parts[] = num1.split("x");
                        String a = parts[0];
                        String b = parts[1];
                        double ak = Double.parseDouble(a);
                        double bk = Double.parseDouble(b);
                        double mul = ak * bk;
                        String muls = String.valueOf(mul);
                        textView.setText((muls));
                        textView2.setText(muls);
                    }
                }
                if (num1.contains("+")) {
                    if (j0.equals(k0)) {
                        textView.setText(num1);
                    } else {
                        String parts[] = num1.split("[+]");
                        String a = parts[0];
                        String b = parts[1];
                        double ak = Double.parseDouble(a);
                        double bk = Double.parseDouble(b);
                        double add = ak + bk;
                        String adds = String.valueOf(add);
                        textView.setText(adds);
                        textView2.setText(adds);
                    }
                }
                break;
            case (R.id.btnadd):
                int u = num1.length() - 1;
                String j = String.valueOf(u);
                String k = String.valueOf(num1.indexOf("+"));
                String l = String.valueOf(num1.indexOf("-"));
                String m = String.valueOf(num1.indexOf("x"));
                String n = String.valueOf(num1.indexOf("/"));
                String o = String.valueOf(num1.indexOf("."));
                String p = String.valueOf(num1.lastIndexOf("-"));
                textView.setText(num1 + "+");
                if (num1.equals("")) {
                    textView.setText("");
                }
                if (j.equals(k) || j.equals(l) || j.equals(m) || j.equals(n) || j.equals(o)){
                    textView.setText(num1);
                }
                if (num1.contains("-")) {
                    if (l.equals("0")) {
                        if (j.equals(p)) {
                            textView.setText(num1);
                        } else if (num1.contains(" ")) {
                            String parts[] = num1.split(" ");
                            String a = parts[0];
                            String b = parts[1];
                            double ak = Double.parseDouble(a);
                            double bk = Double.parseDouble(b);
                            double pl = ak + bk;
                            String plpl = String.valueOf(pl);
                            textView.setText(plpl + "+");
                            textView2.setText(plpl);
                        }
                    }
                    else if(j.equals(l)){
                        textView.setText(num1);
                    }
                    else if (num1.contains("x")) {
                        if (j.equals(m)) {
                            textView.setText(num1);
                        }
                        else if(j.equals(l) || j.equals(p)){
                            textView.setText(num1);
                        }
                        else {
                            String parts[] = num1.split("x");
                            String a = parts[0];
                            String b = parts[1];
                            double ak = Double.parseDouble(a);
                            double bk = Double.parseDouble(b);
                            double mul = ak * bk;
                            String muls = String.valueOf(mul);
                            textView.setText((muls) + "+");
                            textView2.setText(muls);
                        }
                    }
                    else if (num1.contains("/")) {
                        if (j.equals(n)) {
                            textView.setText(num1);
                        }
                        else if(j.equals(l) || j.equals(p)){
                            textView.setText(num1);
                        }
                        else {
                            String parts[] = num1.split("/");
                            String a = parts[0];
                            String b = parts[1];
                            double ak = Double.parseDouble(a);
                            double bk = Double.parseDouble(b);
                            double div = ak / bk;
                            String divs = String.valueOf(div);
                            textView.setText((divs) + "+");
                            textView2.setText(divs);
                        }
                    }
                    else {
                        String parts[] = num1.split("-");
                        String a = parts[0];
                        String b = parts[1];
                        double ak = Double.parseDouble(a);
                        double bk = Double.parseDouble(b);
                        double sub = ak - bk;
                        String subs = String.valueOf(sub);
                        textView.setText((String.valueOf(subs) + "+"));
                        textView2.setText(String.valueOf(subs));
                    }
                }
                if (num1.contains("/")) {
                    if (j.equals(n)) {
                        textView.setText(num1);
                    }
                    else if(j.equals(l) || j.equals(p)){
                        textView.setText(num1);
                    }
                    else {
                        String parts[] = num1.split("/");
                        String a = parts[0];
                        String b = parts[1];
                        double ak = Double.parseDouble(a);
                        double bk = Double.parseDouble(b);
                        double div = ak / bk;
                        String divs = String.valueOf(div);
                        textView.setText((divs) + "+");
                        textView2.setText(divs);
                    }
                }
                if (num1.contains("x")) {
                    if (j.equals(m)) {
                        textView.setText(num1);
                    }
                    else if(j.equals(l) || j.equals(p)){
                        textView.setText(num1);
                    }
                    else {
                        String parts[] = num1.split("x");
                        String a = parts[0];
                        String b = parts[1];
                        double ak = Double.parseDouble(a);
                        double bk = Double.parseDouble(b);
                        double mul = ak * bk;
                        String muls = String.valueOf(mul);
                        textView.setText((muls) + "+");
                        textView2.setText(muls);
                    }
                }
                if (num1.contains("+")) {
                    if (j.equals(k)) {
                        textView.setText(num1);
                    } else {
                        String parts[] = num1.split("[+]");
                        String a = parts[0];
                        String b = parts[1];
                        double ak = Double.parseDouble(a);
                        double bk = Double.parseDouble(b);
                        double add = ak + bk;
                        String adds = String.valueOf(add);
                        textView.setText(adds + "+");
                        textView2.setText(adds);
                    }
                }
                break;
            case (R.id.btnsub):
                int u2 = num1.length() - 1;
                String j2 = String.valueOf(u2);
                String k2 = String.valueOf(num1.indexOf("+"));
                String l2 = String.valueOf(num1.indexOf("-"));
                String m2 = String.valueOf(num1.indexOf("x"));
                String n2 = String.valueOf(num1.indexOf("/"));
                String o2 = String.valueOf(num1.indexOf("."));
                String p2 = String.valueOf(num1.lastIndexOf("-"));
                textView.setText(num1 + "-");
                if (j2.equals(k2) || j2.equals(o2)){
                    textView.setText(num1);
                }
                if (num1.equals("")){
                    textView.setText("-");
                }
                if (num1.contains("-")) {
                    if (l2.equals("0")) {
                        if (j2.equals(p2)) {
                            textView.setText(num1);
                        }
                        if (num1.contains(" ")) {
                            String parts[] = num1.split(" ");
                            String a = parts[0];
                            String b = parts[1];
                            double ak = Double.parseDouble(a);
                            double bk = Double.parseDouble(b);
                            double pl = ak + bk;
                            String plpl = String.valueOf(pl);
                            textView.setText(plpl + " -");
                            textView2.setText(plpl);
                        }
                        else {
                            if(num1.contains("0") || num1.contains("1") || num1.contains("2") || num1.contains("3") || num1.contains("4") || num1.contains("5") || num1.contains("6") || num1.contains("7") || num1.contains("8") || num1.contains("9")){
                                textView.setText(num1 + " -");
                            }
                            else{
                                textView.setText(num1);
                            }
                        }
                    }
                    else if(p2.equals(j2)){
                        textView.setText(num1);
                    }
                    else if (num1.contains("x")) {
                        if (j2.equals(m2)) {
                            textView.setText(num1 + "-");
                        }
                        else if(j2.equals(l2) || j2.equals(p2)){
                            textView.setText(num1);
                        }
                        else {
                            String parts[] = num1.split("x");
                            String a = parts[0];
                            String b = parts[1];
                            double ak = Double.parseDouble(a);
                            double bk = Double.parseDouble(b);
                            double mul = ak * bk;
                            String muls = String.valueOf(mul);
                            if (muls.contains("-")) {
                                textView.setText((muls) + " -");
                                textView2.setText(muls);
                            }
                            else {
                                textView.setText(muls + "-");
                                textView2.setText(muls);
                            }
                        }
                    }
                    else if (num1.contains("/")) {
                        if (j2.equals(n2)) {
                            textView.setText(num1);
                        }
                        else if(j2.equals(l2) || j2.equals(p2)){
                            textView.setText(num1);
                        }
                        else {
                            String parts[] = num1.split("/");
                            String a = parts[0];
                            String b = parts[1];
                            double ak = Double.parseDouble(a);
                            double bk = Double.parseDouble(b);
                            double div = ak / bk;
                            String divs = String.valueOf(div);
                            if (divs.contains("-")) {
                                textView.setText((divs) + " -");
                                textView2.setText(divs);
                            }
                            else{
                                textView.setText((divs) + "-");
                                textView2.setText(divs);
                            }
                        }
                    }
                    else {
                        String parts[] = num1.split("-");
                        String a = parts[0];
                        String b = parts[1];
                        double ak = Double.parseDouble(a);
                        double bk = Double.parseDouble(b);
                        double sub = ak - bk;
                        String subs = String.valueOf(sub);
                        String subsj = String.valueOf(subs.indexOf("-"));
                        if (subsj.equals("0")) {
                            textView.setText((String.valueOf(subs) + " -"));
                            textView2.setText(String.valueOf(subs));
                        } else {
                            textView.setText(subs + "-");
                            textView2.setText(subs);
                        }
                    }
                }
                if (num1.contains("/")) {
                    if (j2.equals(n2)) {
                        textView.setText(num1 + "-");
                    }
                    else if(j2.equals(l2) || j2.equals(p2)){
                        textView.setText(num1);
                    }
                    else {
                        String parts[] = num1.split("/");
                        String a = parts[0];
                        String b = parts[1];
                        double ak = Double.parseDouble(a);
                        double bk = Double.parseDouble(b);
                        double div = ak / bk;
                        String divs = String.valueOf(div);
                        textView.setText((divs) + "-");
                        textView2.setText(divs);
                    }
                }
                if (num1.contains("x")) {
                    if (j2.equals(m2)) {
                        textView.setText(num1 + "-");
                    }
                    else if(j2.equals(l2) || j2.equals(p2)){
                        textView.setText(num1);
                    }
                    else {
                        String parts[] = num1.split("x");
                        String a = parts[0];
                        String b = parts[1];
                        double ak = Double.parseDouble(a);
                        double bk = Double.parseDouble(b);
                        double mul = ak * bk;
                        String muls = String.valueOf(mul);
                        textView.setText((muls) + "-");
                        textView2.setText(muls);
                    }
                }
                if (num1.contains("+")) {
                    if (j2.equals(k2)) {
                        textView.setText(num1);
                    } else {
                        String parts[] = num1.split("[+]");
                        String a = parts[0];
                        String b = parts[1];
                        double ak = Double.parseDouble(a);
                        double bk = Double.parseDouble(b);
                        double add = ak + bk;
                        String adds = String.valueOf(add);
                        textView.setText((String.valueOf(adds) + "-"));
                        textView2.setText(String.valueOf(adds));
                    }
                }
                break;
            case (R.id.btnmul):
                int u4 = num1.length() - 1;
                String j4 = String.valueOf(u4);
                String k4 = String.valueOf(num1.indexOf("+"));
                String l4 = String.valueOf(num1.indexOf("-"));
                String m4 = String.valueOf(num1.indexOf("x"));
                String n4 = String.valueOf(num1.indexOf("/"));
                String o4 = String.valueOf(num1.indexOf("."));
                String p4 = String.valueOf(num1.lastIndexOf("-"));
                textView.setText(num1 + "x");
                if (num1.equals("")) {
                    textView.setText("");
                }
                if (j4.equals(k4) || j4.equals(l4) || j4.equals(m4) || j4.equals(n4) || j4.equals(o4)){
                    textView.setText(num1);
                }
                if (num1.contains("-")) {
                    if (l4.equals("0")) {
                        if (j4.equals(p4)) {
                            textView.setText(num1);
                        } else if (num1.contains(" ")) {
                            String parts[] = num1.split(" ");
                            String a = parts[0];
                            String b = parts[1];
                            double ak = Double.parseDouble(a);
                            double bk = Double.parseDouble(b);
                            double pl = ak + bk;
                            String plpl = String.valueOf(pl);
                            textView.setText(plpl + "x");
                            textView2.setText(plpl);
                        }
                    }
                    else if(j4.equals(l4)){
                        textView.setText(num1);
                    }
                    else if (num1.contains("x")) {
                        if (j4.equals(m4)) {
                            textView.setText(num1);
                        }
                        else if(j4.equals(l4) || j4.equals(p4)){
                            textView.setText(num1);
                        }
                        else {
                            String parts[] = num1.split("x");
                            String a = parts[0];
                            String b = parts[1];
                            double ak = Double.parseDouble(a);
                            double bk = Double.parseDouble(b);
                            double mul = ak * bk;
                            String muls = String.valueOf(mul);
                            textView.setText((muls) + "x");
                            textView2.setText(muls);
                        }
                    }
                    else if (num1.contains("/")) {
                        if (j4.equals(n4)) {
                            textView.setText(num1);
                        }
                        else if(j4.equals(l4) || j4.equals(p4)){
                            textView.setText(num1);
                        }
                        else {
                            String parts[] = num1.split("/");
                            String a = parts[0];
                            String b = parts[1];
                            double ak = Double.parseDouble(a);
                            double bk = Double.parseDouble(b);
                            double div = ak / bk;
                            String divs = String.valueOf(div);
                            textView.setText((divs) + "x");
                            textView2.setText(divs);
                        }
                    }
                    else {
                        String parts[] = num1.split("-");
                        String a = parts[0];
                        String b = parts[1];
                        double ak = Double.parseDouble(a);
                        double bk = Double.parseDouble(b);
                        double sub = ak - bk;
                        String subs = String.valueOf(sub);
                        textView.setText((String.valueOf(subs) + "x"));
                        textView2.setText(String.valueOf(subs));
                    }
                }
                if (num1.contains("/")) {
                    if (j4.equals(n4)) {
                        textView.setText(num1);
                    }
                    else if(j4.equals(l4) || j4.equals(p4)){
                        textView.setText(num1);
                    }
                    else {
                        String parts[] = num1.split("/");
                        String a = parts[0];
                        String b = parts[1];
                        double ak = Double.parseDouble(a);
                        double bk = Double.parseDouble(b);
                        double div = ak / bk;
                        String divs = String.valueOf(div);
                        textView.setText((divs) + "x");
                        textView2.setText(divs);
                    }
                }
                if (num1.contains("x")) {
                    if (j4.equals(m4)) {
                        textView.setText(num1);
                    }
                    else if(j4.equals(l4) || j4.equals(p4)){
                        textView.setText(num1);
                    }
                    else {
                        String parts[] = num1.split("x");
                        String a = parts[0];
                        String b = parts[1];
                        double ak = Double.parseDouble(a);
                        double bk = Double.parseDouble(b);
                        double mul = ak * bk;
                        String muls = String.valueOf(mul);
                        textView.setText((muls) + "x");
                        textView2.setText(muls);
                    }
                }
                if (num1.contains("+")) {
                    if (j4.equals(k4)) {
                        textView.setText(num1);
                    } else {
                        String parts[] = num1.split("[+]");
                        String a = parts[0];
                        String b = parts[1];
                        double ak = Double.parseDouble(a);
                        double bk = Double.parseDouble(b);
                        double add = ak + bk;
                        String adds = String.valueOf(add);
                        textView.setText(adds + "x");
                        textView2.setText(adds);
                    }
                }
                break;
            case (R.id.btndiv):
                int u5 = num1.length() - 1;
                String j5 = String.valueOf(u5);
                String k5 = String.valueOf(num1.indexOf("+"));
                String l5 = String.valueOf(num1.indexOf("-"));
                String m5 = String.valueOf(num1.indexOf("x"));
                String n5 = String.valueOf(num1.indexOf("/"));
                String o5 = String.valueOf(num1.indexOf("."));
                String p5 = String.valueOf(num1.lastIndexOf("-"));
                textView.setText(num1 + "/");
                if (num1.equals("")) {
                    textView.setText("");
                }
                if (j5.equals(k5) || j5.equals(l5) || j5.equals(m5) || j5.equals(n5) || j5.equals(o5)){
                    textView.setText(num1);
                }
                if (num1.contains("-")) {
                    if (l5.equals("0")) {
                        if (j5.equals(p5)) {
                            textView.setText(num1);
                        } else if (num1.contains(" ")) {
                            String parts[] = num1.split(" ");
                            String a = parts[0];
                            String b = parts[1];
                            double ak = Double.parseDouble(a);
                            double bk = Double.parseDouble(b);
                            double pl = ak + bk;
                            String plpl = String.valueOf(pl);
                            textView.setText(plpl + "/");
                            textView2.setText(plpl);
                        }
                    }
                    else if(j5.equals(l5)){
                        textView.setText(num1);
                    }
                    else if (num1.contains("x")) {
                        if (j5.equals(m5)) {
                            textView.setText(num1);
                        }
                        else if(j5.equals(l5) || j5.equals(p5)){
                            textView.setText(num1);
                        }
                        else {
                            String parts[] = num1.split("x");
                            String a = parts[0];
                            String b = parts[1];
                            double ak = Double.parseDouble(a);
                            double bk = Double.parseDouble(b);
                            double mul = ak * bk;
                            String muls = String.valueOf(mul);
                            textView.setText((muls) + "/");
                            textView2.setText(muls);
                        }
                    }
                    else if (num1.contains("/")) {
                        if (j5.equals(n5)) {
                            textView.setText(num1);
                        }
                        else if(j5.equals(l5) || j5.equals(p5)){
                            textView.setText(num1);
                        }
                        else {
                            String parts[] = num1.split("/");
                            String a = parts[0];
                            String b = parts[1];
                            double ak = Double.parseDouble(a);
                            double bk = Double.parseDouble(b);
                            double div = ak / bk;
                            String divs = String.valueOf(div);
                            textView.setText((divs) + "/");
                            textView2.setText(divs);
                        }
                    }
                    else {
                        String parts[] = num1.split("-");
                        String a = parts[0];
                        String b = parts[1];
                        double ak = Double.parseDouble(a);
                        double bk = Double.parseDouble(b);
                        double sub = ak - bk;
                        String subs = String.valueOf(sub);
                        textView.setText((String.valueOf(subs) + "/"));
                        textView2.setText(String.valueOf(subs));
                    }
                }
                if (num1.contains("/")) {
                    if (j5.equals(n5)) {
                        textView.setText(num1);
                    }
                    else if(j5.equals(l5) || j5.equals(p5)){
                        textView.setText(num1);
                    }
                    else {
                        String parts[] = num1.split("/");
                        String a = parts[0];
                        String b = parts[1];
                        double ak = Double.parseDouble(a);
                        double bk = Double.parseDouble(b);
                        double div = ak / bk;
                        String divs = String.valueOf(div);
                        textView.setText((divs) + "/");
                        textView2.setText(divs);
                    }
                }
                if (num1.contains("x")) {
                    if (j5.equals(m5)) {
                        textView.setText(num1);
                    }
                    else if(j5.equals(l5) || j5.equals(p5)){
                        textView.setText(num1);
                    }
                    else {
                        String parts[] = num1.split("x");
                        String a = parts[0];
                        String b = parts[1];
                        double ak = Double.parseDouble(a);
                        double bk = Double.parseDouble(b);
                        double mul = ak * bk;
                        String muls = String.valueOf(mul);
                        textView.setText((muls) + "/");
                        textView2.setText(muls);
                    }
                }
                if (num1.contains("+")) {
                    if (j5.equals(k5)) {
                        textView.setText(num1);
                    } else {
                        String parts[] = num1.split("[+]");
                        String a = parts[0];
                        String b = parts[1];
                        double ak = Double.parseDouble(a);
                        double bk = Double.parseDouble(b);
                        double add = ak + bk;
                        String adds = String.valueOf(add);
                        textView.setText(adds + "/");
                        textView2.setText(adds);
                    }
                }
                break;
            case (R.id.btnper):
                String u99999 = String.valueOf(num1.length() - 1);
                String v99999 = String.valueOf(num1.indexOf("/"));
                if (num1.contains("/")){
                    if (u99999.equals(v99999)){
                        textView.setText(num1);
                    }
                    else {
                        String parts[] = num1.split("/");
                        String a = parts[0];
                        String b = parts[1];
                        double ak = Double.parseDouble(a);
                        double bk = Double.parseDouble(b);
                        double answ = (ak / bk) * 100;
                        textView.setText("");
                        textView2.setText(String.valueOf(answ) + "%");
                    }
                }
                break;
        }
    }
}