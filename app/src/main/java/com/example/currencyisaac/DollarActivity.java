package com.example.currencyisaac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class DollarActivity extends AppCompatActivity {

    TextView DollarTextViewJ;
    EditText EditTextDollarJ;
    Button EuroDollarButtonJ,DollarEuroButtonJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dollar);
       DollarTextViewJ = findViewById(R.id.DollarTextView);
       EditTextDollarJ = findViewById(R.id.EditTextDollar);
        DecimalFormat df = new DecimalFormat("#.##");

       ///////////////////////////////////////////////////////////////

        EuroDollarButtonJ = findViewById(R.id.EuroDollarButton);
        EuroDollarButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double userInput = Double.parseDouble(EditTextDollarJ.getText().toString());
                double answer = userInput * 1.13;

                DollarTextViewJ.setText("$"+df.format(answer));
            }
        });
                DollarEuroButtonJ = findViewById(R.id.DollarEuroButton);
                DollarEuroButtonJ.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        double userInput = Double.parseDouble(EditTextDollarJ.getText().toString());
                        double answer = userInput / 1.13;

                        DollarTextViewJ.setText("€"+df.format(answer));

            }
        });

    }
}