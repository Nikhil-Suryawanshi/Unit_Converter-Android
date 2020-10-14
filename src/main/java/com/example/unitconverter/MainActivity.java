package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void Converter(View view){
        EditText cm=(EditText) findViewById(R.id.textCm);
        EditText in=(EditText) findViewById(R.id.textIn);
        EditText mm=(EditText) findViewById(R.id.textMm);
        String cmText=cm.getText().toString();
        String inText=in.getText().toString();
        String mmText=mm.getText().toString();
        if(!cmText.isEmpty()) {
            double toInches = 0.394 * Double.parseDouble(cmText);
            double toMm = 10 * Double.parseDouble(cmText);
            in.setText(Double.toString(toInches));
            mm.setText(Double.toString(toMm));
        }
        else {
            if(!inText.isEmpty()){
                double toCm=2.54*Double.parseDouble(inText);
                double toMm=25.4*Double.parseDouble(inText);
                cm.setText(Double.toString(toCm));
                mm.setText(Double.toString(toMm));
            }
            else if(!mmText.isEmpty()){
                double toCm=0.1*Double.parseDouble(mmText);
                double toInches=0.0394*Double.parseDouble(mmText);
                cm.setText(Double.toString(toCm));
                in.setText(Double.toString(toInches));
            }
            else{
                Toast.makeText(this, "Error: Type Something", Toast.LENGTH_SHORT).show();
            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}