package org.pltw.examples.makingclasses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Arithmetic testArithmetic = new Arithmetic();
        System.out.println(testArithmetic);
        //showing off super class
        TaxArithmetic derp = new TaxArithmetic(5, 10);
        derp.calculateTax(5, 5);
        // using add() method
        derp.add(4, 10);
    }

}