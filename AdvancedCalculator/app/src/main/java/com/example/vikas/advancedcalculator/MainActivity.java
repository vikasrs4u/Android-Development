//
//  MainActivity
//  Advanced Calculator
//
//  Created by Vikas Radhakrishna Shetty on 4/21/18.
//  Copyright © 2018 Vikas Radhakrishna Shetty All rights reserved.
//

package com.example.vikas.advancedcalculator;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button button0 , button1 , button2 , button3 , button4 , button5 , button6 ,
            button7 , button8 , button9 , buttonAdd , buttonSub , buttonDivision ,
            buttonMul , button10 , buttonC , buttonEqual ;
    TextView textFieldData;

    float firstValue = 0 , secondValue = 0 ;

    boolean   isAddition , isSubtract ,isMultiplication ,isDivision, wasEqualToPressedBefore ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonDivision = (Button) findViewById(R.id.buttonDiv);
        buttonC = (Button) findViewById(R.id.buttonDel);
        buttonEqual = (Button) findViewById(R.id.buttonEquals);
        textFieldData = (TextView) findViewById(R.id.text);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //After we press equals we need to start fresh transaction so have added this.
                if (wasEqualToPressedBefore)
                {
                    textFieldData.setText("");
                    wasEqualToPressedBefore = false;
                }
                textFieldData.setText(textFieldData.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //After we press equals we need to start fresh transaction so have added this.
                if (wasEqualToPressedBefore)
                {
                    textFieldData.setText("");
                    wasEqualToPressedBefore = false;

                }
                textFieldData.setText(textFieldData.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //After we press equals we need to start fresh transaction so have added this.
                if (wasEqualToPressedBefore)
                {
                    textFieldData.setText("");
                    wasEqualToPressedBefore = false;

                }
                textFieldData.setText(textFieldData.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //After we press equals we need to start fresh transaction so have added this.
                if (wasEqualToPressedBefore)
                {
                    textFieldData.setText("");
                    wasEqualToPressedBefore = false;

                }
                textFieldData.setText(textFieldData.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //After we press equals we need to start fresh transaction so have added this.
                if (wasEqualToPressedBefore)
                {
                    textFieldData.setText("");
                    wasEqualToPressedBefore = false;

                }
                textFieldData.setText(textFieldData.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //After we press equals we need to start fresh transaction so have added this.
                if (wasEqualToPressedBefore)
                {
                    textFieldData.setText("");
                    wasEqualToPressedBefore = false;

                }
                textFieldData.setText(textFieldData.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //After we press equals we need to start fresh transaction so have added this.
                if (wasEqualToPressedBefore)
                {
                    textFieldData.setText("");
                    wasEqualToPressedBefore = false;

                }
                textFieldData.setText(textFieldData.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //After we press equals we need to start fresh transaction so have added this.
                if (wasEqualToPressedBefore)
                {
                    textFieldData.setText("");
                    wasEqualToPressedBefore = false;

                }
                textFieldData.setText(textFieldData.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //After we press equals we need to start fresh transaction so have added this.
                if (wasEqualToPressedBefore)
                {
                    textFieldData.setText("");
                    wasEqualToPressedBefore = false;

                }
                textFieldData.setText(textFieldData.getText()+"9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //After we press equals we need to start fresh transaction so have added this.
                if (wasEqualToPressedBefore)
                {
                    textFieldData.setText("");
                    wasEqualToPressedBefore = false;

                }
                textFieldData.setText(textFieldData.getText()+"0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                textFieldData.setHint("");
                if (textFieldData.getText().length()<1){
                    textFieldData.setText("");
                }
                else {
                    firstValue = Float.parseFloat(textFieldData.getText() + "");
                    isAddition = true;
                    textFieldData.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textFieldData.setHint("");
                // if multiple times substarct is clciked we still show only one minus sign and also initially if no data is present still we need to show minus.
                if (textFieldData.getText().length()<1 || textFieldData.getText().equals("-"))
                {
                    textFieldData.setText("-");
                }
                else
                {
                    firstValue = Float.parseFloat(textFieldData.getText() + "");
                    isSubtract = true ;
                    textFieldData.setText(null);
                }

            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textFieldData.setHint("");
                if (textFieldData.getText().length()<1){
                    textFieldData.setText("");
                }
                else
                {
                    firstValue = Float.parseFloat(textFieldData.getText() + "");
                    isMultiplication = true ;
                    textFieldData.setText(null);
                }

            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textFieldData.setHint("");
                if (textFieldData.getText().length()<1)
                {
                    textFieldData.setText("");
                }
                else
                {
                    firstValue = Float.parseFloat(textFieldData.getText()+"");
                    isDivision = true ;
                    textFieldData.setText(null);
                }

            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (textFieldData.getText().length()>=1)
                {
                    secondValue = Float.parseFloat(textFieldData.getText() + "");

                    if (isAddition == true){

                        firstValue = firstValue+secondValue;

                        textFieldData.setText(firstValue +"");
                        isAddition=false;
                    }


                    if (isSubtract == true){
                        firstValue = firstValue - secondValue;
                        textFieldData.setText(firstValue +"");
                        isSubtract=false;
                    }

                    if (isMultiplication == true){
                        firstValue = firstValue * secondValue;
                        textFieldData.setText(firstValue +"");
                        isMultiplication=false;
                    }

                    if (isDivision == true){
                        if (secondValue == 0)
                        {
                            textFieldData.setText("");
                            textFieldData.setHint("Can't divide by zero, please press DEL and Restart Calculation.");
                        }
                        else
                        {
                            firstValue = firstValue / secondValue;
                            textFieldData.setText(firstValue+"");

                        }
                        isDivision=false;

                    }
                    wasEqualToPressedBefore = true;
                }

            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textFieldData.setText("");
                textFieldData.setHint("");
            }
        });




    }
}
