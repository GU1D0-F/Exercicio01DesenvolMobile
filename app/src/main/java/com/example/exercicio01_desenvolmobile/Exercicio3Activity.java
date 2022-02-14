package com.example.exercicio01_desenvolmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Exercicio3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio3);
    }

    public void converteParaCelsius(View v){

        //Busca e atribui as textview's por id
        TextView temperatura = (TextView) findViewById(R.id.temperatura);
        TextView textoVerificacao  = (TextView) findViewById(R.id.textoVerificacao);

        // recupera o valor das textview's
        String tempF = temperatura.getText().toString();

        double temp = Integer.parseInt(tempF);


        // conversão de ºF para ºC
        double celsius = ((temp - 32) * 5)/9;

        textoVerificacao.setText("Temperatura: " + String.format("%.2f", celsius) + " ºC");


        //limpar apos apertar botao
        temperatura.setText("");
    }
}