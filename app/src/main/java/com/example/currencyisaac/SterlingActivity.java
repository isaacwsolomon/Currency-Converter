package com.example.currencyisaac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class SterlingActivity extends AppCompatActivity {
    TextView TextViewSterlingJ;
    EditText sterlingetJ;
    Button EuroSterlingbuttonJ,SterligEurobuttonJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sterling2);
        TextViewSterlingJ = findViewById(R.id.TextViewSterling);
        sterlingetJ = findViewById(R.id.sterlinget);


        /////////////////////////////////////////////////////////////

        EuroSterlingbuttonJ = findViewById(R.id.EuroSterlingbutton);
        EuroSterlingbuttonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double userInput = Double.parseDouble(sterlingetJ.getText().toString());
                double answer = userInput*.83;


                //TextViewSterlingJ.setText("£"+df.format(answer));
                TextViewSterlingJ.setText("£"+(answer));
            }
        });

                SterligEurobuttonJ = findViewById(R.id.SterligEurobutton);
                SterligEurobuttonJ.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        double userInput = Double.parseDouble(sterlingetJ.getText().toString());
                        double answer = userInput/ .83;
                        DecimalFormat df = new DecimalFormat("#.##");
                        df.format(answer);
                        TextViewSterlingJ.setText("€"+df.format(answer));


            }

        });
    }
}