package com.ryu.mobilep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mototal, moavg, jatotal, jaavg, ostotal, osavg;
    EditText momid, mofin, moapp, jamid, jafin, jaapp, osmid, osfin, osapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}