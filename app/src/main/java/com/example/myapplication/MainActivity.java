package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double tip = 0;
    private double bill = 0;

    private double totalTip= 0;
    private double totalAmount=0;
    private EditText billAmount;
    private EditText tipAmount;
    private TextView totalAmount1;
    private TextView billTotal;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        billAmount=findViewById(R.id.billAmountEditText);
        tipAmount = findViewById(R.id.tipEditText);
        totalAmount1 = findViewById(R.id.tipAmountTextView);
        billTotal = findViewById(R.id.totalAmountTextView);
    }


    public void calculate(View view) {
        bill = (Double.valueOf( (billAmount.getText().toString())));
        tip=Double.valueOf((tipAmount.getText().toString()));

        totalTip=(bill*tip)/100;

        totalAmount = bill+totalTip;

        String tipS = "Tip: " + totalTip;
        String totalS = "Total: " + totalAmount;
        totalAmount1.setText(tipS);
        billTotal.setText(totalS);

    }
}