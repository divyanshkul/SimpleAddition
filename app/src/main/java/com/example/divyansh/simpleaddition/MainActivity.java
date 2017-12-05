package com.example.divyansh.simpleaddition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstNumber;
    EditText secondNumber;
    TextView result;
    double numOne, numTwo, sumOfTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onAddButtonClick(View v){
        firstNumber = (EditText)findViewById(R.id.editText1);
        secondNumber = (EditText)findViewById(R.id.editText2);
        result = (TextView)findViewById(R.id.resultView);
        numOne = Double.parseDouble(firstNumber.getText().toString());
        numTwo = Double.parseDouble(secondNumber.getText().toString());
        sumOfTwo = numOne+numTwo;
        result.setText(Double.toString(sumOfTwo));
    }
}
