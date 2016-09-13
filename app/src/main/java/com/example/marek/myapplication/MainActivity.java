package com.example.marek.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get the button as described
        final Button button = (Button) findViewById(R.id.mailButton);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //let's send a mail intent
                Intent msg_intent = new Intent(Intent.ACTION_SEND);
                msg_intent.putExtra(Intent.EXTRA_TEXT, "This is my message!");
                msg_intent.setType("text/plain");
                //start the activity
                startActivity(msg_intent);
            }
        });

        final Button button2 = (Button) findViewById(R.id.otherButton);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //let's send a mail intent
                Intent intent2 = new Intent(v.getContext(), WhateverActivity.class);
                intent2.putExtra("message", "Bogus Dude!");
                //start the activity
                startActivity(intent2);
            }
        });

        final Button button3 = (Button) findViewById(R.id.implicitButton);
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //let's send a mail intent
                Intent intent2 = new Intent("com.example.marek.myapplication.WHATEVER");
                intent2.putExtra("message", "Gnarly!");
                //start the activity
                startActivity(intent2);
            }
        });
    }
}
