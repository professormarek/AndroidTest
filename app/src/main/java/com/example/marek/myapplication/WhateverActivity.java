package com.example.marek.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WhateverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatever);

        Intent intent = getIntent();
        String temp = intent.getStringExtra("message");
        TextView text  = (TextView)findViewById(R.id.message);
        text.setText(temp);
    }
}
