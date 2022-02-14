package com.example.exercicio01_desenvolmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Exercicio2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio2);
    }

    public void verificaTriangulo(View v){

        //Busca e atribui as textview's por id
        TextView valor1 = (TextView) findViewById(R.id.valor1);
        TextView valor2 = (TextView) findViewById(R.id.valor2);
        TextView valor3 = (TextView) findViewById(R.id.valor3);
        TextView textoVerificacao  = (TextView) findViewById(R.id.textoVerificacao);

        // recupera o valor das textview's
        String valor01 = valor1.getText().toString();
        String valor02 = valor2.getText().toString();
        String valor03 = valor3.getText().toString();

        int valor01c = Integer.parseInt(valor01);
        int valor02c = Integer.parseInt(valor02);
        int valor03c = Integer.parseInt(valor03);

        // Valida triangulo
        if(valor01c < (valor02c + valor03c) && valor02c < (valor01c + valor03c) && valor03c < (valor01c + valor02c))
        {
            textoVerificacao.setText("Formam um triângulo!");
        }
        else
        {
            textoVerificacao.setText("Não formam um triângulo!");
        }

        //limpar apos apertar botao
        valor1.setText("");
        valor2.setText("");
        valor3.setText("");
    }
}