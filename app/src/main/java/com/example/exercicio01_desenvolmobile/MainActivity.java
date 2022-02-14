package com.example.exercicio01_desenvolmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Exercicio01(View v){
        Intent in = new Intent(this, Exercicio1Activity.class);
        startActivity(in);
    }

    public void Exercicio02(View v){
        Intent in2 = new Intent(this, Exercicio2Activity.class);
        startActivity(in2);
    }

    public  void Exercicio03(View v){
        Intent in3 = new Intent(this, Exercicio3Activity.class);
        startActivity(in3);
    }



}