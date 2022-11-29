package com.ryu.mobilep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView mototal, moavg, jatotal, jaavg, ostotal, osavg;
    EditText momid, mofin, moapp, moatt, jamid, jafin, jaapp, jaatt, osmid, osfin, osapp, osatt;
    Button calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        mototal = findViewById(R.id.mototal);
        moavg = findViewById(R.id.moavg);
        jatotal = findViewById(R.id.jatotal);
        jaavg = findViewById(R.id.jaavg);
        ostotal = findViewById(R.id.ostotal);
        osavg = findViewById(R.id.osavg);
        momid = findViewById(R.id.momid);
        mofin = findViewById(R.id.mofin);
        moapp = findViewById(R.id.moapp);
        moatt = findViewById(R.id.moatt);
        jamid = findViewById(R.id.jamid);
        jafin = findViewById(R.id.jafin);
        jaapp = findViewById(R.id.jaapp);
        jaatt = findViewById(R.id.jaatt);
        osmid = findViewById(R.id.osmid);
        osfin = findViewById(R.id.osfin);
        osapp = findViewById(R.id.osapp);
        osatt = findViewById(R.id.osatt);
        Button calc = findViewById(R.id.calc);
        calc.setOnClickListener(btnl);


    }
    View.OnClickListener btnl = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            String momidres = momid.getText().toString();
            String mofinres = mofin.getText().toString();
            String moappres = moapp.getText().toString();
            String moattres = moatt.getText().toString();
            String jamidres = jamid.getText().toString();
            String jafinres = jafin.getText().toString();
            String jaappres = jaapp.getText().toString();
            String jaattres = jaatt.getText().toString();
            String osmidres = osmid.getText().toString();
            String osfinres = osfin.getText().toString();
            String osappres = osapp.getText().toString();
            String osattres = osatt.getText().toString();
            try {
                double momid, mofin, moapp, moatt, jamid, jafin, jaapp, jaatt, osmid, osfin, osapp, osatt;
                momid = Double.parseDouble(momidres);
                mofin = Double.parseDouble(mofinres);
                moapp = Double.parseDouble(moappres);
                moatt = Double.parseDouble(moattres);
                jamid = Double.parseDouble(jamidres);
                jafin = Double.parseDouble(jafinres);
                jaapp = Double.parseDouble(jaappres);
                jaatt = Double.parseDouble(jaattres);
                osmid = Double.parseDouble(osmidres);
                osfin = Double.parseDouble(osfinres);
                osapp = Double.parseDouble(osappres);
                osatt = Double.parseDouble(osattres);
                 double mores = momid + mofin + moapp + 20 - Math.floor(moatt / 3);
                 double jares = jamid + jafin + jaapp + 20 - Math.floor(jaatt / 3);
                 double osres = osmid + osfin + osapp + 20 - Math.floor(osatt / 3);
                 mototal.setText(mores + "");
                 jatotal.setText(jares + "");
                 ostotal.setText(osres + "");
                 if (100 >= mores && mores > 90) {
                     moavg.setText("A+");
                 } else if (89 >= mores && mores > 80) {
                     moavg.setText("A0");
                 } else if (89 >= mores && mores > 80) {
                     moavg.setText("B+");
                 } else if (79 >= mores && mores > 70) {
                     moavg.setText("B0");
                 } else if (69 >= mores && mores > 60) {
                     moavg.setText("C+");
                 } else if (59 >= mores && mores > 50) {
                     moavg.setText("C0");
                 } else if (49 >= mores && mores > 40) {
                     moavg.setText("D+");
                 } else if (39 >= mores && mores > 30) {
                     moavg.setText("D0");
                 }
                 if (30 >= mores || moatt >= 12) {
                     moavg.setText("F");
                 }
                 if (100 >= jares && jares > 90) {
                     jaavg.setText("A+");
                 } else if (89 >= jares && jares > 80) {
                     jaavg.setText("A0");
                 } else if (89 >= jares && jares > 80) {
                     jaavg.setText("B+");
                 } else if (79 >= jares && jares > 70) {
                     jaavg.setText("B0");
                 } else if (69 >= jares && jares > 60) {
                     jaavg.setText("C+");
                 } else if (59 >= jares && jares > 50) {
                     jaavg.setText("C0");
                 } else if (49 >= jares && jares > 40) {
                     jaavg.setText("D+");
                 } else if (39 >= jares && jares > 30) {
                     jaavg.setText("D0");
                 }
                 if (30 >= jares || jaatt >= 12) {
                     jaavg.setText("F");
                 }
                 if (100 >= osres && osres > 90) {
                     osavg.setText("A+");
                 } else if (89 >= osres && osres > 80) {
                     osavg.setText("A0");
                 } else if (89 >= osres && osres > 80) {
                     osavg.setText("B+");
                 } else if (79 >= osres && osres > 70) {
                     osavg.setText("B0");
                 } else if (69 >= osres && osres > 60) {
                     osavg.setText("C+");
                 } else if (59 >= osres && osres > 50) {
                     osavg.setText("C0");
                 } else if (49 >= osres && osres > 40) {
                     osavg.setText("D+");
                 } else if (39 >= osres && osres > 30) {
                     osavg.setText("D0");
                 }
                 if (30 >= osres || osatt >= 12) {
                     osavg.setText("F");
                 }
             }
             catch(Exception e){
                 Toast.makeText(MainActivity.this, "숫자 입력", Toast.LENGTH_SHORT).show();

            }
        }
    };
}