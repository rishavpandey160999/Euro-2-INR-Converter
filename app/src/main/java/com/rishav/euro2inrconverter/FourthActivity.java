package com.rishav.euro2inrconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FourthActivity extends AppCompatActivity {


    public void tap(View view)

    {
        EditText euroAmount = (EditText) findViewById(R.id.euroAmount);
        String euros = euroAmount.getText().toString();
        Double rishaveuro = Double.parseDouble(euros);
        Double rishavINR = 85.00 * rishaveuro;
        String laptop = "= " + "Rs " + rishavINR.toString();
        Toast.makeText(this, laptop, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

    }

}