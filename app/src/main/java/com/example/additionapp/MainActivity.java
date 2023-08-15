package com.example.additionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                EditText f = (EditText) findViewById(R.id.fetch);
                EditText f1 = (EditText) findViewById(R.id.fetch1);

                TextView res = (TextView) findViewById(R.id.put);

                int sum = Integer.parseInt(f.getText().toString())+ Integer.parseInt(f1.getText().toString());

                res.setText(sum + " ");
                
            }
        });
    }}