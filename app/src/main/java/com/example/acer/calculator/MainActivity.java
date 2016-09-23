package com.example.acer.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

    public class MainActivity extends AppCompatActivity {
    Button button0 , button1 , button2 , button3 , button4 , button5 , button6 ,
            button7 , button8 , button9 , buttonDot, buttonOpen, buttonClose,
            buttonAdd , buttonSub , buttonMult ,
            buttonDiv, buttonX2, buttonSquareRoot, buttonPercent, buttonDel,
            buttonCC , buttonEqual ;

    EditText editText2 ;

        float mValueOne, mValueTwo;
        double mPowerofTwo, mSquareRoot;
        boolean mAddition, mSubtract, mMultiplication, mDivision,  mPercent ;

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
        buttonOpen = (Button) findViewById(R.id.buttonOpen);
        buttonClose = (Button) findViewById(R.id.buttonClose);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonMult = (Button) findViewById(R.id.buttonMult);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonX2 = (Button) findViewById(R.id.buttonX2);
        buttonSquareRoot = (Button) findViewById(R.id.buttonSquareRoot);
        buttonPercent = (Button) findViewById(R.id.buttonPercent);
        buttonDel = (Button) findViewById(R.id.buttonDel);
        buttonCC = (Button) findViewById(R.id.buttonCC);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        editText2 = (EditText) findViewById(R.id.editText2);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText2.setText(editText2.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText2.setText(editText2.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText2.setText(editText2.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText2.setText(editText2.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText2.setText(editText2.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText2.setText(editText2.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText2.setText(editText2.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText2.setText(editText2.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText2.setText(editText2.getText()+"9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText2.setText(editText2.getText()+"0");
            }
        });

        buttonOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText2.setText(editText2.getText()+"(");
            }
        });

        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText2.setText(editText2.getText()+")");
            }
        });


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText2 == null){
                    editText2.setText("");
                }else {
                    mValueOne = Float.parseFloat(editText2.getText() + "");
                    mAddition = true;
                    editText2.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText2.getText() + "");
                mSubtract = true ;
                editText2.setText(null);
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText2.getText() + "");
                mMultiplication = true ;
                editText2.setText(null);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText2.getText()+"");
                mDivision = true ;
                editText2.setText(null);
            }
        });

         buttonX2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = editText2.getText().toString();
                mPowerofTwo = Double.parseDouble(x.toString());
                mPowerofTwo = Math.pow(mPowerofTwo,2);
                String answer = Double.toString(mPowerofTwo);
                editText2.setText(answer);
            }

        });

        buttonSquareRoot.setOnClickListener(new View.OnClickListener() {
            @Override
             public void onClick(View v) {
                String x = editText2.getText().toString();
                mSquareRoot = Double.parseDouble(x.toString());
                mSquareRoot = Math.sqrt(mSquareRoot);
                String answer = Double.toString(mSquareRoot);
                editText2.setText(answer);
            }
        });

        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText2.getText() + "");
                mPercent = true;
                editText2.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(editText2.getText() + "");

                if (mAddition == true){
                    editText2.setText(mValueOne + mValueTwo +"");
                    mAddition=false;
                }


                if (mSubtract == true){
                    editText2.setText(mValueOne - mValueTwo+"");
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    editText2.setText(mValueOne * mValueTwo+"");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    editText2.setText(mValueOne / mValueTwo+"");
                    mDivision=false;
                }

                if (mPercent == true) {
                    editText2.setText (((mValueOne/100)*mValueTwo)+"");
                    mPercent=false;
                }

            }
        });

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = editText2.getText().toString();
                str = str.substring(0,str.length()-1);
                editText2.setText(str);
            }
        });

        buttonCC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText2.setText("");
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText2.setText(editText2.getText()+".");
            }
        });
    }

}