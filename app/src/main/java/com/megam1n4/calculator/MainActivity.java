package com.megam1n4.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_layout);

        final TextView calculatorScreen = findViewById(R.id.calculatorScreen);

        final Button n0 = findViewById(R.id.n0);
        final Button n1 = findViewById(R.id.n1);
        final Button n2 = findViewById(R.id.n2);
        final Button n3 = findViewById(R.id.n3);
        final Button n4 = findViewById(R.id.n4);
        final Button n5 = findViewById(R.id.n5);
        final Button n6 = findViewById(R.id.n6);
        final Button n7 = findViewById(R.id.n7);
        final Button n8 = findViewById(R.id.n8);
        final Button n9 = findViewById(R.id.n9);
        final Button dot = findViewById(R.id.dot);
        final Button equals = findViewById(R.id.equals);
        final Button addi = findViewById(R.id.addi);
        final Button sub = findViewById(R.id.sub);
        final Button mul = findViewById(R.id.mul);
        final Button div = findViewById(R.id.div);

        final View.OnClickListener calculatorListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int id = view.getId();

                switch (id) {
                    case R.id.n0:
                        calculatorScreen.append("0");
                        break;
                    case R.id.n1:
                        calculatorScreen.append("1");
                        break;
                    case R.id.n2:
                        calculatorScreen.append("2");
                        break;
                    case R.id.n3:
                        calculatorScreen.append("3");
                        break;
                    case R.id.n4:
                        calculatorScreen.append("4");
                        break;
                    case R.id.n5:
                        calculatorScreen.append("5");
                        break;
                    case R.id.n6:
                        calculatorScreen.append("6");
                        break;
                    case R.id.n7:
                        calculatorScreen.append("7");
                        break;
                    case R.id.n8:
                        calculatorScreen.append("8");
                        break;
                    case R.id.n9:
                        calculatorScreen.append("9");
                        break;
                    case R.id.dot:
                        calculatorScreen.append(".");
                        break;
                    case R.id.equals:
                        calculatorScreen.append("0");
                        break;
                    case R.id.addi:
                        calculatorScreen.append("+");
                        break;
                    case R.id.sub:
                        calculatorScreen.append("-");
                        break;
                    case R.id.mul:
                        calculatorScreen.append("*");
                        break;
                    case R.id.div:
                        calculatorScreen.append("/");
                        break;
                }
            }
        };

        n0.setOnClickListener(calculatorListener);
        n1.setOnClickListener(calculatorListener);
        n2.setOnClickListener(calculatorListener);
        n3.setOnClickListener(calculatorListener);
        n4.setOnClickListener(calculatorListener);
        n5.setOnClickListener(calculatorListener);
        n6.setOnClickListener(calculatorListener);
        n7.setOnClickListener(calculatorListener);
        n8.setOnClickListener(calculatorListener);
        n9.setOnClickListener(calculatorListener);
        dot.setOnClickListener(calculatorListener);
        equals.setOnClickListener(calculatorListener);
        addi.setOnClickListener(calculatorListener);
        sub.setOnClickListener(calculatorListener);
        mul.setOnClickListener(calculatorListener);
        div.setOnClickListener(calculatorListener);

        final Button del = findViewById(R.id.del);
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String displayedElements = calculatorScreen.getText().toString();
                int length = displayedElements.length();

                if (length > 0) {
                    displayedElements = displayedElements.substring(0, length - 1);
                    calculatorScreen.setText(displayedElements);
                }
            }
        });

        final Button clrEverything = findViewById(R.id.clrEverything);
        clrEverything.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.setText("");
            }
        });
    }
}
