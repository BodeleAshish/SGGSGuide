package com.example.firstyear;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);


       button.setOnClickListener(new View.OnClickListener()
        {
            @NonNull
            @Override
            public void onClick(View v){
                openCSE();
            }
        });
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openEXTC();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIT();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openELEC();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCIVIL();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPROD();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMECH();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openINSTRU();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCHEM();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTEXT();
            }
        });

    }
    public void openCSE(){
        Intent intent = new Intent(this, CSE.class);
        startActivity(intent);
    }
    public void openEXTC(){
        Intent intent = new Intent(this, EXTC.class);
        startActivity(intent);
    }
    public void openIT(){
        Intent intent = new Intent(this, IT.class);
        startActivity(intent);
    }
    public void openELEC(){
        Intent intent = new Intent(this, ELEC.class);
        startActivity(intent);
    }
    public void openCIVIL(){
        Intent intent = new Intent(this, CIVIL.class);
        startActivity(intent);
    }
    public void openPROD(){
        Intent intent = new Intent(this, PROD.class);
        startActivity(intent);
    }
    public void openMECH(){
        Intent intent = new Intent(this, MECH.class);
        startActivity(intent);
    }
    public void openINSTRU(){
        Intent intent = new Intent(this, INSTRU.class);
        startActivity(intent);
    }
    public void openCHEM(){
        Intent intent = new Intent(this, CHEM.class);
        startActivity(intent);
    }
    public void openTEXT(){
        Intent intent = new Intent(this, TEXT.class);
        startActivity(intent);
    }
}
