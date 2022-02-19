package com.example.currencyisaac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class SwissfrancActivity extends AppCompatActivity {
    TextView TextViewFrancJ;
    EditText EditTextFrancJ;
    Button SterlingFrancButtonJ,FrancSterlingButtonJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swissfranc);

        TextViewFrancJ = findViewById(R.id.TextViewFranc);
        EditTextFrancJ = findViewById(R.id.EditTextFranc);
        DecimalFormat df = new DecimalFormat("#.##");

        ///////////////////////////////////////////////////

        FrancSterlingButtonJ = findViewById(R.id.FrancSterlingButton);
        FrancSterlingButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double userInput = Double.parseDouble(EditTextFrancJ.getText().toString());
                double answer = userInput * .81;

                TextViewFrancJ.setText("£"+df.format(answer));
            }
        });
        SterlingFrancButtonJ = findViewById(R.id.SterlingFrancButton);
                SterlingFrancButtonJ.setOnClickListener(new View.OnClickListener() {
              @Override
                    public void onClick(View v) {
                        double userInput = Double.parseDouble(EditTextFrancJ.getText().toString());
                        double answer = userInput / .81;

                        TextViewFrancJ.setText("SFr"+df.format(answer));

            }
        });

    }
}