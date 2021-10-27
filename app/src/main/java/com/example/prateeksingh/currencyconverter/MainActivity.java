package com.example.prateeksingh.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void pressed(View view)
    {
        EditText valEditText= (EditText)findViewById(R.id.valEditText);
        Log.i("Value",valEditText.getText().toString());
       // Toast.makeText(this, "Rs. "+con(valEditText.getText().toString()), Toast.LENGTH_LONG).show();
        //EditText printEditText= printEditText.setText("Rs. "+con(valEditText.getText().toString()));
        //TextView result = (TextView)findViewById(R.id.tvValue);
        valEditText.setText("Rs. "+con(valEditText.getText().toString()));
    }
    public String con(String s)
    {
        double d=Double.parseDouble(s);
        return (String.valueOf(d*73.45));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
