package com.numerica98.laboratorio2_ejercicio3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private LinearLayout panel1, panel2, panel3;
    private int numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        panel1= findViewById(R.id.panel_1);
        panel2= findViewById(R.id.panel_2);
        panel3= findViewById(R.id.panel_3);

        panel1.setOnClickListener(this);
        panel2.setOnClickListener(this);
        panel3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int viewId= v.getId();
        numero = (int) Math.floor(Math.random()*(255+40+1));

        switch (viewId){
            case R.id.panel_1:
                panel1.setBackgroundColor(Color.rgb(numero, 10, 10));
                break;
            case R.id.panel_2:
                panel2.setBackgroundColor(Color.rgb(10, 10, numero));
                break;
            case R.id.panel_3:
                panel3.setBackgroundColor(Color.rgb(10, numero, 10));
                break;
        }
    }
}
