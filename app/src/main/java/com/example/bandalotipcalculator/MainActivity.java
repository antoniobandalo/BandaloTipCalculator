package com.example.bandalotipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateTip(View v){
        // Get references to all elements on app screen
        DecimalFormat f = new DecimalFormat("##.00");
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        TextView textView5 = (TextView) findViewById(R.id.textView5);

        // get the values from the EditText boxes and convert then to int data types
        double bill = Double.parseDouble(editText.getText().toString());
        double tip = Double.parseDouble(editText2.getText().toString());

        // add the two ints
        double tipAmount = (tip/100) * bill;
        double total = bill + tipAmount;

        // set the text for the answer
        textView4.setText("Tip: $" + f.format(tipAmount));
        textView5.setText("Total: $" + f.format(total));
    }

    public void ratingBar(View v){
        RatingBar ratingbar = (RatingBar) findViewById(R.id.ratingBar);
        EditText editText2 = (EditText) findViewById(R.id.editText2);

        String rating = String.valueOf(ratingbar.getRating());


    }
}
