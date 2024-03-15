package com.example.apogcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    TextView display;
    Button add;
    Button minus;
    Button multiply;
    Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.txtNum1);
        num2 = findViewById(R.id.txtNum2);
        display = findViewById(R.id.txtDisplay);
        add = findViewById(R.id.btnAdd);
        minus = findViewById(R.id.btnMinus);
        multiply = findViewById(R.id.btnTimes);
        clear = findViewById(R.id.btnClear);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double sum = number1 + number2;
                display.setText(String.valueOf(sum));
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double difference = number1 - number2;
                display.setText(String.valueOf(difference));
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double product = number1 * number2;
                display.setText(String.valueOf(product));
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText(" ");
                num2.setText(" ");
            }

        });
    }
}