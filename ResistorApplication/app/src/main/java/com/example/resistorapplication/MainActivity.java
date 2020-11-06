package com.example.resistorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity<string> extends AppCompatActivity  {

    int currentBand = 0;
    int resistorValue = 0;
    double toleranceValue;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.tvDisplay);

    }

    public void doBand1 (View view) {
        currentBand = 1;
    }
    public void doBand2 (View view) {
        currentBand = 2;
    }
    public void doBand3 (View view) {
        currentBand = 3;
    }
    public void doBand4 (View view) {
        currentBand = 4;
    }
    public void doBrown (View view) {
        if (currentBand == 1) {
            resistorValue = 1 ; toleranceValue = 1;
        } else if (currentBand == 2) {
            resistorValue = resistorValue * 10 + 1;toleranceValue = 1;
        } else if (currentBand == 3) {
            resistorValue = resistorValue * 10;toleranceValue = 1;
        }
    }
    public void doRed (View view) {
        if (currentBand == 1) {
            resistorValue = 2; toleranceValue = 2;
        } else if (currentBand == 2) {
            resistorValue = resistorValue * 10 + 2; toleranceValue = 2;
        } else if (currentBand == 3) {
            resistorValue = resistorValue * 100; toleranceValue = 2;
        }
    }

    public void doOrange(View view) {
        if (currentBand == 1) {
            resistorValue = 3;
        } else if (currentBand == 2) {
            resistorValue = resistorValue * 10 + 3;
        } else if (currentBand == 3) {
            resistorValue = resistorValue * 1000;
        }
    }
    public void doYellow (View view) {
        if (currentBand == 1) {
            resistorValue = 4;
        } else if (currentBand == 2) {
            resistorValue = resistorValue * 10 + 4;
        } else if (currentBand == 3) {
            resistorValue = resistorValue * 10000;
        }
    }
    public void doGreen (View view) {
        if (currentBand == 1) {
            resistorValue = 5; toleranceValue = 0.5;
        } else if (currentBand == 2) {
            resistorValue = resistorValue * 10 + 5; toleranceValue = 0.5;
        } else if (currentBand == 3) {
            resistorValue = resistorValue * 100000; toleranceValue = 0.5;
        }
    }
    public void doBlue (View view) {
        if (currentBand == 1) {
            resistorValue = 6; toleranceValue = 0.25;
        } else if (currentBand == 2) {
            resistorValue = resistorValue * 10 + 6; toleranceValue = 0.25;
        } else if (currentBand == 3) {
            resistorValue = resistorValue * 1000000; toleranceValue = 0.25;
        }
    }
    public void doViolet (View view) {
        if (currentBand == 1) {
            resistorValue = 7; toleranceValue = 0.10;
        } else if (currentBand == 2) {
            resistorValue = resistorValue * 10 + 7; toleranceValue = 0.10;
        } else if (currentBand == 3) {
            resistorValue = resistorValue * 10000000; toleranceValue = 0.10;
        }
    }

    public void doGray (View view) {
        if (currentBand == 1) {
            resistorValue = 8; toleranceValue = 0.05;
        } else if (currentBand == 2) {
            resistorValue = resistorValue * 10 + 8; toleranceValue = 0.05;
        } else if (currentBand == 3) {
            resistorValue = resistorValue * 100000000; toleranceValue = 0.05;
        }
    }

    public void doCalculate (View view) {
        display.setText(String.valueOf("Ω" + resistorValue + "±" + toleranceValue + "%"));
    }
    public void doClear (View view) { display.setText(String.valueOf(resistorValue)); resistorValue = 0; toleranceValue = 0;
    }



}