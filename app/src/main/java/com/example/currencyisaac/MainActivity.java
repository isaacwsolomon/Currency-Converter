package com.example.currencyisaac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton EuroPageButtonJ,DollarPageButtonJ,SterlingPageButtonJ,SwissPageButtonJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /////////////////////////////////////
        EuroPageButtonJ = findViewById(R.id.EuroPageButton);
        EuroPageButtonJ.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   startActivity(new Intent(MainActivity.this, EuroActivity.class));
                                               }
                                           });
                DollarPageButtonJ = findViewById(R.id.DollarPageButton);
                DollarPageButtonJ.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this, DollarActivity.class));
                    }
                });
                        SterlingPageButtonJ = findViewById(R.id.SterlingPageButton);
                        SterlingPageButtonJ.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity.this, SterlingActivity.class));
                            }
                        });
                                SwissPageButtonJ = findViewById(R.id.SwissPageButton);
                                SwissPageButtonJ.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        startActivity(new Intent(MainActivity.this, SwissfrancActivity.class));
                                    }
                                });
                                    }
                                }


