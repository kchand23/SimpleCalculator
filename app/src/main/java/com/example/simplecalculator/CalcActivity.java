package com.example.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

        final TextView inputText = (TextView) findViewById(R.id.textView);

        //Define On Click listener for all buttons
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId())
                {
                    case (R.id.button):
                        break;
                    case (R.id.button2):
                        break;
                    case (R.id.button3):
                        break;
                    case (R.id.button4):
                        break;
                    case (R.id.button5):
                        break;
                    case (R.id.button6):
                        break;
                    case (R.id.button7):
                        break;
                    case (R.id.button9):
                        inputText.setText(inputText.getText() + "1");
                        break;
                    case (R.id.button10):
                        inputText.setText(inputText.getText() + "2");
                        break;
                    case (R.id.button11):
                        inputText.setText(inputText.getText() + "3");
                        break;
                    case (R.id.button12):
                        inputText.setText(inputText.getText() + "4");
                        break;
                    case (R.id.button13):
                        inputText.setText(inputText.getText() + "5");
                        break;
                    case (R.id.button14):
                        inputText.setText(inputText.getText() + "6");
                        break;
                    case (R.id.button15):
                        inputText.setText(inputText.getText() + "7");
                        break;
                    case (R.id.button16):
                        inputText.setText(inputText.getText() + "8");
                        break;
                    case (R.id.button17):
                        inputText.setText(inputText.getText() + "9");
                        break;
                    case (R.id.button18):
                        inputText.setText(inputText.getText() + "0");
                        break;


                }
            }
        };

        oneButton.setOnClickListener(listener);
        twoButton.setOnClickListener(listener);
        threeButton.setOnClickListener(listener);
        fourButton.setOnClickListener(listener);
        fiveButton.setOnClickListener(listener);
        sixButton.setOnClickListener(listener);
        sevenButton.setOnClickListener(listener);
        eightButton.setOnClickListener(listener);
        nineButton.setOnClickListener(listener);
        zeroButton.setOnClickListener(listener);

    }
}
