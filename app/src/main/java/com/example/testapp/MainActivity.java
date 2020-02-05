package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button convertButton = (Button) findViewById(R.id.convertButton);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText fahrenheitEditText = (EditText) findViewById(R.id.fahrenheitEditText);
                EditText celsiusEditText = (EditText) findViewById(R.id.celsiusEditText);
                int fNum = Integer.parseInt(fahrenheitEditText.getText().toString());
                int result = (fNum -30)/2;
                celsiusEditText.setText(result + "");



            }
        });
    }
}
