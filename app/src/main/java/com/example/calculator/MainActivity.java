package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mathResult;
    private Boolean isOperation;
    private Integer first;
    private Integer second;
    private Boolean isPlus;
    private Boolean isMinus;
    private Boolean isMultiply;
    private Boolean isDivision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mathResult = findViewById(R.id.tv_calculate);
    }
    public void onNumberClick(View view) {
        switch (view.getId()){
            case R.id.btn_1:
                setNumber("1");
                break;
            case R.id.btn_2:
                setNumber("2");
                break;
            case R.id.btn_3:
                setNumber("3");
                break;
            case R.id.btn_4:
                setNumber("4");
                break;
            case R.id.btn_5:
                setNumber("5");
                break;
            case R.id.btn_6:
                setNumber("6");
                break;
            case R.id.btn_7:
                setNumber("7");
                break;
            case R.id.btn_8:
                setNumber("8");
                break;
            case R.id.btn_9:
                setNumber("9");
                break;
            case R.id.btn_0:
                setNumber("0");
                break;
            case R.id.btn_plus:
                first = Integer.parseInt(mathResult.getText().toString());
                isOperation = true;
                isPlus = true;
                isMinus = false;
                isMultiply = false;
                isDivision = false;
                break;
            case R.id.btn_minus:
                first = Integer.parseInt(mathResult.getText().toString());
                isOperation = true;
                isPlus = false;
                isMinus = true;
                isMultiply = false;
                isDivision = false;
                break;
            case R.id.btn_multiply:
                first = Integer.parseInt(mathResult.getText().toString());
                isOperation = true;
                isPlus = false;
                isMinus = false;
                isMultiply = true;
                isDivision = false;
                break;
            case R.id.btn_division:
                first = Integer.parseInt(mathResult.getText().toString());
                isOperation = true;
                isPlus = false;
                isMinus = false;
                isMultiply = false;
                isDivision = true;
                break;
            case R.id.btn_clear:
                mathResult.setText("0");
                break;
            case R.id.btn_equal:
                if (isPlus = true) {
                    second = Integer.parseInt(mathResult.getText().toString());
                    Integer result = first + second;
                    mathResult.setText(result);
                } else if (isMinus = true){
                    second = Integer.parseInt(mathResult.getText().toString());
                    Integer result = first - second;
                    mathResult.setText(result);
                } else if (isMultiply = true){
                    second = Integer.parseInt(mathResult.getText().toString());
                    Integer result = first * second;
                    mathResult.setText(result);
                } else if(isDivision = true){
                    second = Integer.parseInt(mathResult.getText().toString());
                    Integer result = first / second;
                    mathResult.setText(result);
                } else{
                    mathResult.setText("0");
                }
                first = 0;
                second = 0;
                isOperation = true;
                break;
        }
    }
    public void setNumber(String number) {
        if (mathResult.getText().toString().equals(0)) mathResult.setText(number);
        else if (isOperation){
            mathResult.setText(number);
        }else {
            mathResult.append(number);
        }
    }
}