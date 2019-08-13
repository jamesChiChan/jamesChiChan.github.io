package com.example.countmachine;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //暫存數字1與2
    private double num1=0;
    private double num2=0;
    //+-*/符號,用於判斷做何運算
    private String sign = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //數字鍵
        Button btn0 = (Button) findViewById(R.id.button_num0);
        Button btn1 = (Button) findViewById(R.id.button_num1);
        Button btn2 = (Button) findViewById(R.id.button_num2);
        Button btn3 = (Button) findViewById(R.id.button_num3);
        Button btn4 = (Button) findViewById(R.id.button_num4);
        Button btn5 = (Button) findViewById(R.id.button_num5);
        Button btn6 = (Button) findViewById(R.id.button_num6);
        Button btn7 = (Button) findViewById(R.id.button_num7);
        Button btn8 = (Button) findViewById(R.id.button_num8);
        Button btn9 = (Button) findViewById(R.id.button_num9);
        //符號+-*/.
        Button plus = (Button) findViewById(R.id.button_plus);
        Button subtract = (Button) findViewById(R.id.button_subtract);
        Button multiply = (Button) findViewById(R.id.button_multiply);
        Button divide = (Button) findViewById(R.id.button_divide);
        Button dot = (Button) findViewById(R.id.button_dot);
        //刪除鍵與等號鍵
        Button cancel = (Button) findViewById(R.id.button_cancel);
        Button equal = (Button) findViewById(R.id.button_epual);
        //算式
        final TextView textView = (TextView) findViewById(R.id.input_num);
        textView.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG); //添加下劃線

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (textView.getText().toString().equals("0")) {
                textView.setText("0");
            }else {textView.append("0");}
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().toString().equals("0")) {
                    textView.setText("1");
                }else {textView.append("1");}
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().toString().equals("0")) {
                    textView.setText("2");
                }else {textView.append("2");}
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().toString().equals("0")) {
                    textView.setText("3");
                }else {textView.append("3");}
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().toString().equals("0")) {
                    textView.setText("4");
                }else {textView.append("4");}
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().toString().equals("0")) {
                    textView.setText("5");
                }else {textView.append("5");}
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().toString().equals("0")) {
                    textView.setText("6");
                }else {textView.append("6");}
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().toString().equals("0")) {
                    textView.setText("7");
                }else {textView.append("7");}
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().toString().equals("0")) {
                    textView.setText("8");
                }else {textView.append("8");}
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().toString().equals("0")) {
                    textView.setText("9");
                }else {textView.append("9");}
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append(".");
            }
        });
        //清除
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = 0;
                num2 = 0;
                textView.setText("0");
            }
        });
        // + 加
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(textView.getText().toString());
                sign = "+";
                textView.setText("0");
            }
        });
        // - 減
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(textView.getText().toString());
                sign = "-";
                textView.setText("0");
            }
        });
        // * 乘
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(textView.getText().toString());
                sign = "*";
                textView.setText("0");
            }
        });
        // / 除
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(textView.getText().toString());
                sign = "/";
                textView.setText("0");
            }
        });
        // = 等於
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Double.parseDouble(textView.getText().toString());
                // 判斷 +-*/ 並做出運算
                switch (sign) {
                    case "+":
                        textView.setText(String.valueOf(num1 + num2));
                        break;
                    case "-":
                        textView.setText((String.valueOf(num1 - num2)));
                        break;
                    case "*":
                        textView.setText(String.valueOf(num1 * num2));
                        break;
                    case "/":
                        textView.setText(String.valueOf(num1 / num2));
                        break;
                    default:
                        break;
                }
                num1 = 0;
                num2 = 0;
            }
        });

    }
}
