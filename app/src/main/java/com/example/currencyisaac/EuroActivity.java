package com.example.currencyisaac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class EuroActivity extends AppCompatActivity {
    TextView TextViewEuroJ;
    EditText EditTextEuroJ;
    Button EuroFrancButtonJ,FrancEuroButtonJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_euro);
        TextViewEuroJ = findViewById(R.id.TextViewEuro);
        EditTextEuroJ = findViewById(R.id.EditTextEuro);
        DecimalFormat df = new DecimalFormat("#.##");

        ////////////////////////////////////////////////////

        EuroFrancButtonJ = findViewById(R.id.EuroFrancButton);
        EuroFrancButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double userInput = Double.parseDouble(EditTextEuroJ.getText().toString());
                double answer = userInput * 1.04;

                TextViewEuroJ.setText("SFr"+df.format(answer)+"");
            }
        });
                FrancEuroButtonJ = findViewById(R.id.FrancEuroButton);
                FrancEuroButtonJ.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        double userInput = Double.parseDouble(EditTextEuroJ.getText().toString());
                        double answer = userInput / 1.04;

                        //df.format(answer);
                        TextViewEuroJ.setText("€"+df.format(answer));

            }
        });


    }
}