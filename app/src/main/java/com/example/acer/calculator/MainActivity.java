package com.example.acer.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.Arrays;


//public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
  /*
  private static final String TAG = "MainActivity";
   // private String numText;
    private EditText editText2;
    private Button buttonX2, buttonCC;
    private ViewGroup rootView;
    private String[] opList = {"+", "-", "="};
    private String buttonString;
    private double tmpRes = 0;
    private String currentOp = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonX2 = (Button) findViewById(R.id.buttonX2);
        buttonX2.setText(Html.fromHtml("x<sup>2</sup>"));
        editText2 = (EditText) findViewById(R.id.editText2);
        editText2.setText("0");
        Button buttonCC =(Button) findViewById(R.id.buttonCC);
        buttonCC.setOnClickListener(this);
        rootView = (ViewGroup)findViewById(R.id.rootView);
        setupAllListeners(rootView);


    }

    private void setupAllListeners(ViewGroup rootView){
        int numChild = rootView.getChildCount();
        //Log.v(TAG, "child number
        for (int i = 0; i < numChild; i++) {
            View view = rootView.getChildAt(i);
            if(view instanceof ViewGroup){
                setupAllListeners((ViewGroup) view);
            } else if(view instanceof Button){
                Button button = (Button) view;
                button.setOnClickListener(this);
            }
            //Log.v(TAG,"View id: "+ view.getId());
        }
    }

    public void displayResult(View view){

        editText2.setText("Result");
    }

    @Override
    public void onClick(View v) {
        char[] txt = editText2.getText().toString().toCharArray();
        switch (v.getId()){
            case R.id.buttonCC:
                editText2.setText("0");
                break;
           *//* case R.id.buttonDiv:
                break;
            case R.id.buttonOpen:
                break;
            case R.id.buttonDel:
                break;
            case R.id.buttonMult:
                break;
            case R.id.buttonSub:
                break;
            case R.id.buttonPercent:
                break;
            case R.id.buttonSquareRoot:
                break;
            case R.id.buttonEqual:
                break;
            case R.id.buttonAdd:
                break;
            case R.id.buttonDot:
                break;
            case R.id.buttonClose:
                break;
                *//*
            default:
                //editText.setText()
                Button button = (Button) v;
                buttonString = button.getText().toString();
                if(Arrays.asList(opList).contains(buttonString)) {
                    setOperasi();
                } else {
                    if(txt[0] == '0') {
                        editText2.setText(buttonString);
                    } else {
                        editText2.setText(editText2.getText().toString() + buttonString);
                    }

                }

                Log.v(TAG, "Log All");
        }
    }

    public void setOperasi() {
        switch(buttonString) {
            case "+":
                tmpRes = Double.parseDouble(editText2.getText().toString());
                currentOp = "+";
                editText2.setText("0");
                break;
            case "-":
                tmpRes = Double.parseDouble(editText2.getText().toString());
                currentOp = "-";
                editText2.setText("0");
                break;
            case "=":
                hitungOperasi();
                break;
        }
    }

    public void hitungOperasi() {
        double tmp = Double.parseDouble(editText2.getText().toString());
        switch (currentOp) {
            case "+":
                tmp = tmp + tmpRes;
                //currentResult = tmp;
                System.out.println("+ Masuk sini : " + tmp);
                editText2.setText(String.valueOf((int) tmp));
                tmpRes = 0;
                currentOp = null;
                break;
            case "-":
                tmp = tmpRes - tmp;
                //currentResult = tmp;
                System.out.println("- Masuk sini : " + tmp);
                editText2.setText(String.valueOf((int) tmp));
                currentOp = null;
                tmpRes = 0;
                break;

        }
    }


}*/
    public class MainActivity extends AppCompatActivity {
    Button button0 , button1 , button2 , button3 , button4 , button5 , button6 ,
            button7 , button8 , button9 , buttonDot, buttonAdd , buttonSub , buttonMult ,
            buttonDiv, buttonX2, buttonSquareRoot, buttonPercent, buttonCC , buttonEqual ;

    EditText editText2 ;

    float mValueOne , mValueTwo ;

    boolean mAddition , mSubtract ,mMultiplication ,mDivision, mPowerofTwo, mSquareRoot, mPercent ;

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
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonMult = (Button) findViewById(R.id.buttonMult);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonX2 = (Button) findViewById(R.id.buttonX2);
        buttonSquareRoot = (Button) findViewById(R.id.buttonSquareRoot);
        buttonPercent = (Button) findViewById(R.id.buttonPercent);
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
                mValueOne = Float.parseFloat(editText2.getText() + "");
                mPowerofTwo = true ;
                editText2.setText(null);
            }

        });

        buttonSquareRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText2.getText() + "");
                mSquareRoot = true ;
                editText2.setText(null);
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

               if (mPowerofTwo == true) {
                    editText2.setText (Math.pow(mValueTwo,2.0)+"");
                    mPowerofTwo=false;
                }

              /*  if (mSquareRoot == true) {
                    editText2.setText (Math.sqrt(mValueTwo,2.0)+"");
                    mSquareRoot=false;
            }*/
                if (mPercent == true) {
                    editText2.setText (((mValueOne/100)*mValueTwo)+"");
                    mPercent=false;
                }

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