package com.example.android.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int quantity = 0;
    int cantidad = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */

    /**
     * Team A
     */


    public void increment3(View View) {
        quantity = quantity + 3;
        display(quantity);
    }

    public void increment2(View View) {
        quantity = quantity + 2;
        display(quantity);

    }

    public void increment1(View View) {
        quantity = quantity + 1;
        display(quantity);

    }



    private void display(int number) {
        TextView scoreA = (TextView) findViewById(R.id.scoreA);
        scoreA.setText("" + number);
    }


    /**
     * Team B
     */


    public void incrementar3(View View) {
        cantidad = cantidad + 3;
        muestra(cantidad);
    }

    public void incrementar2(View View) {
        cantidad = cantidad + 2;
        muestra(cantidad);

    }

    public void incrementar1(View View) {
        cantidad = cantidad + 1;
        muestra(cantidad);

    }

    private void muestra(int number) {
        TextView scoreA = (TextView) findViewById(R.id.scoreB);
        scoreA.setText("" + number);
    }






}

