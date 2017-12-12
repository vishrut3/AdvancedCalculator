package com.example.vibhavkotriwala.advancedcalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class chemeleActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnatm;
    private TextView textView22;
    private EditText editText22;
    String [] elements = {
            "actinium", "aluminum", "americium", "antimony", "argon", "arsenic", "astatine", "barium", "berkelium", "beryllium", "bismuth", "bohrium", "boron", "bromine", "cadmium", "calcium", "californium", "carbon", "cerium", "cesium", "chlorine", "chromium", "cobalt", "copper", "curium", "dubnium", "dysprosium", "einsteinium", "erbium", "europium", "eermium", "fluorine", "francium", "gadolinium", "gallium", "germanium", "gold", "hafnium", "hassium", "helium", "holmium", "hydrogen", "indium", "iodine", "iridium", "iron", "krypton", "lanthanum", "lawrencium", "lead", "lithium", "lutetium", "magnesium", "manganese", "meitnerium", "mendelevium", "mercury", "molybdenum", "neodymium", "neon", "neptunium", "nickel", "niobium", "nitrogen", "nobelium", "osmium", "oxygen", "palladium", "phosphorus", "platinum", "plutonium", "polonium", "potassium", "praseodymium", "promethium", "protactinium", "radium", "radon", "rhenium", "rhodium", "rubidium", "ruthenium", "rutherfordium", "samarium", "scandium", "seaborgium", "selenium", "silicon", "silver", "sodium", "strontium", "sulfur", "tantalum", "technetium", "tellurium", "terbium", "thallium", "thorium", "thulium", "tin", "titanium", "tungsten", "uranium", "vanadium", "xenon", "ytterbium", "yttrium", "zinc", "zirconium"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemele);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        AutoCompleteTextView actv = (AutoCompleteTextView)findViewById(R.id.editText22);
        actv.setAdapter(new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,elements));
        init2();
    }
    private void init2() {
        btnatm = (Button) findViewById((R.id.btnatm));
        btnatm.setOnClickListener(this);
        editText22 = (EditText) findViewById(R.id.editText22);
        textView22 = (TextView) findViewById(R.id.textView22);

    }
    @Override
    public void onClick (View view){
        String b = editText22.getText().toString();
        String a = b.toLowerCase();
        String a2p2 = textView22.getText().toString();
        switch (view.getId()){
            case(R.id.btnatm):
                if (a.equals("actinium")){
                    textView22.setText("227.03");
                }
                if (a.equals("aluminum")){
                    textView22.setText("26.98");
                }
                if (a.equals("americium")){
                    textView22.setText("243");

                }
                if (a.equals("antimony")){
                    textView22.setText("121.76");

                }
                if (a.equals("argon")){
                    textView22.setText("39.95");

                }
                if (a.equals("arsenic")){
                    textView22.setText("74.92");

                }
                if (a.equals("astatine")) {
                    textView22.setText("210");

                }
                if (a.equals("barium")) {
                    textView22.setText("137.33");

                }
                if (a.equals("berkelium")){
                    textView22.setText("247");

                }
                if (a.equals("beryllium")){
                    textView22.setText("9.01");

                }
                if (a.equals("bismuth")){
                    textView22.setText("208.98");

                }
                if (a.equals("bohrium")){
                    textView22.setText("262");

                }
                if (a.equals("boron")){
                    textView22.setText("10.81");

                }
                if (a.equals("bromine")){
                    textView22.setText("79.90");

                }
                if (a.equals("cadmium")){
                    textView22.setText("112.41");

                }
                if (a.equals("calcium")){
                    textView22.setText("40.08");

                }
                if (a.equals("californium")){
                    textView22.setText("251");

                }
                if (a.equals("carbon")){
                    textView22.setText("12.01");

                }
                if (a.equals("cerium")){
                    textView22.setText("140.12");

                }
                if (a.equals("cesium")){
                    textView22.setText("132.91");

                }
                if (a.equals("chlorine")){
                    textView22.setText("35.45");

                }
                if (a.equals("chromium")){
                    textView22.setText("52");

                }
                if (a.equals("cobalt")){
                    textView22.setText("59");

                }
                if (a.equals("copper")){
                    textView22.setText("63.55");

                }
                if (a.equals("curium")){
                    textView22.setText("247");

                }
                if (a.equals("dubnium")){
                    textView22.setText("262");

                }
                if (a.equals("dysprosium")){
                    textView22.setText("162.50");

                }
                if (a.equals("einsteinium")){
                    textView22.setText("252");

                }
                if (a.equals("erbium")){
                    textView22.setText("167.26");

                }
                if (a.equals("europium")){
                    textView22.setText("152");

                }
                if (a.equals("eermium")){
                    textView22.setText("257");

                }
                if (a.equals("fluorine")){
                    textView22.setText("19");

                }
                if (a.equals("francium")){
                    textView22.setText("223");

                }
                if (a.equals("gadolinium")){
                    textView22.setText("157.25");

                }
                if (a.equals("gallium")){
                    textView22.setText("69.72");

                }
                if (a.equals("germanium")){
                    textView22.setText("72.61");

                }
                if (a.equals("gold")){
                    textView22.setText("197");

                }
                if (a.equals("hafnium")){
                    textView22.setText("178.49");

                }
                if (a.equals("hassium")){
                    textView22.setText("265");

                }
                if (a.equals("helium")){
                    textView22.setText("4");

                }
                if (a.equals("holmium")){
                    textView22.setText("164.93");

                }
                if (a.equals("hydrogen")){
                    textView22.setText("1");

                }
                if (a.equals("indium")){
                    textView22.setText("114.82");

                }
                if (a.equals("iodine")){
                    textView22.setText("126.90");

                }
                if (a.equals("iridium")){
                    textView22.setText("192.22");

                }
                if (a.equals("iron")){
                    textView22.setText("55.85");

                }
                if (a.equals("krypton")){
                    textView22.setText("83.80");

                }
                if (a.equals("lanthanum")){
                    textView22.setText("138.90");

                }
                if (a.equals("lawrencium")){
                    textView22.setText("262");

                }
                if (a.equals("lead")){
                    textView22.setText("207.2");

                }
                if (a.equals("lithium")){
                    textView22.setText("6.94");

                }
                if (a.equals("lutetium")){
                    textView22.setText("174.97");

                }
                if (a.equals("magnesium")){
                    textView22.setText("24.30");

                }
                if (a.equals("manganese")){
                    textView22.setText("55.94");

                }
                if (a.equals("meitnerium")){
                    textView22.setText("266");

                }
                if (a.equals("mendelevium")){
                    textView22.setText("258");

                }
                if (a.equals("mercury")){
                    textView22.setText("200.59");

                }
                if (a.equals("molybdenum")){
                    textView22.setText("95.94");

                }
                if (a.equals("neodymium")){
                    textView22.setText("144.24");

                }
                if (a.equals("neon")){
                    textView22.setText("20.18");

                }
                if (a.equals("neptunium")){
                    textView22.setText("237");

                }
                if (a.equals("nickel")){
                    textView22.setText("58.69");

                }
                if (a.equals("niobium")){
                    textView22.setText("93");

                }
                if (a.equals("nitrogen")){
                    textView22.setText("14");

                }
                if (a.equals("nobelium")){
                    textView22.setText("259");

                }
                if (a.equals("osmium")){
                    textView22.setText("190.2");

                }
                if (a.equals("oxygen")){
                    textView22.setText("16");

                }
                if (a.equals("palladium")){
                    textView22.setText("106.42");

                }
                if (a.equals("phosphorus")){
                    textView22.setText("31");

                }
                if (a.equals("platinum")){
                    textView22.setText("195.08");

                }
                if (a.equals("plutonium")){
                    textView22.setText("244");

                }
                if (a.equals("polonium")){
                    textView22.setText("209");

                }
                if (a.equals("potassium")){
                    textView22.setText("39");

                }
                if (a.equals("praseodymium")){
                    textView22.setText("141");

                }
                if (a.equals("promethium")){
                    textView22.setText("145");

                }
                if (a.equals("protactinium")){
                    textView22.setText("231");

                }
                if (a.equals("radium")){
                    textView22.setText("226");

                }
                if (a.equals("radon")){
                    textView22.setText("222");

                }
                if (a.equals("rhenium")){
                    textView22.setText("186.21");

                }
                if (a.equals("rhodium")){
                    textView22.setText("103");

                }
                if (a.equals("rubidium")){
                    textView22.setText("85.47");

                }
                if (a.equals("ruthenium")){
                    textView22.setText("101");

                }
                if (a.equals("rutherfordium")){
                    textView22.setText("261");

                }
                if (a.equals("samarium")){
                    textView22.setText("150.36");

                }
                if (a.equals("scandium")){
                    textView22.setText("45");

                }
                if (a.equals("seaborgium")){
                    textView22.setText("263");

                }
                if (a.equals("selenium")){
                    textView22.setText("79");

                }
                if (a.equals("silicon")){
                    textView22.setText("28");

                }
                if (a.equals("silver")){
                    textView22.setText("107.87");

                }
                if (a.equals("sodium")){
                    textView22.setText("23");

                }
                if (a.equals("strontium")){
                    textView22.setText("87.62");

                }
                if (a.equals("sulfur")){
                    textView22.setText("32");

                }
                if (a.equals("tantalum")){
                    textView22.setText("181");

                }
                if (a.equals("technetium")){
                    textView22.setText("98");

                }
                if (a.equals("tellurium")){
                    textView22.setText("127.60");

                }
                if (a.equals("terbium")){
                    textView22.setText("159");

                }
                if (a.equals("thallium")){
                    textView22.setText("204.38");

                }
                if (a.equals("thorium")){
                    textView22.setText("232");

                }
                if (a.equals("thulium")){
                    textView22.setText("169");

                }
                if (a.equals("tin")){
                    textView22.setText("118.71");

                }
                if (a.equals("titanium")){
                    textView22.setText("47.88");

                }
                if (a.equals("tungsten")){
                    textView22.setText("183.85");

                }
                if (a.equals("uranium")){
                    textView22.setText("238");

                }
                if (a.equals("vanadium")){
                    textView22.setText("51");

                }
                if (a.equals("xenon")){
                    textView22.setText("131.29");

                }
                if (a.equals("ytterbium")){
                    textView22.setText("173");

                }
                if (a.equals("yttrium")){
                    textView22.setText("89");

                }
                if (a.equals("zinc")){
                    textView22.setText("65.39");

                }
                if (a.equals("zirconium")){
                    textView22.setText("91.22");

                }

                break;



        }

    }

}