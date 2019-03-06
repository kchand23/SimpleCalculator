package com.example.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class CalcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        //Initialize all buttons
        Button addButton = (Button)findViewById(R.id.button);
        Button subButton = (Button)findViewById(R.id.button2);
        Button divButton = (Button)findViewById(R.id.button3);
        Button mulButton = (Button)findViewById(R.id.button4);

        Button sinButton = (Button)findViewById(R.id.button5);
        Button cosButton = (Button)findViewById(R.id.button6);
        Button tanButton = (Button)findViewById(R.id.button7);

        Button oneButton = (Button)findViewById(R.id.button9);
        Button twoButton = (Button)findViewById(R.id.button10);
        Button threeButton = (Button) findViewById(R.id.button11);
        Button fourButton = (Button) findViewById(R.id.button12);
        Button fiveButton = (Button) findViewById(R.id.button13);
        Button sixButton = (Button) findViewById(R.id.button14);
        Button sevenButton = (Button) findViewById(R.id.button15);
        Button eightButton = (Button) findViewById(R.id.button16);
        Button nineButton = (Button) findViewById(R.id.button17);
        Button zeroButton = (Button) findViewById(R.id.button18);


    }
}
