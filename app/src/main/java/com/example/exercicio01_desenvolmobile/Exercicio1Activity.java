package com.example.exercicio01_desenvolmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Exercicio1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio1);
    }


    public void VerificaUsuarioSenha(View v) {

        TextView usuarioDigitado = (TextView) findViewById(R.id.userInput);
        TextView senhaDigitado = (TextView) findViewById(R.id.passInput);

        TextView resultadoOperacao = (TextView) findViewById(R.id.resultado);

        String usuario = usuarioDigitado.getText().toString();
        String senha = senhaDigitado.getText().toString();

        if(usuario.equals("admin") && senha.equals("1234")) {
            resultadoOperacao.setText("Sucesso");
            usuarioDigitado.setText("");
            senhaDigitado.setText("");
        } else {
            resultadoOperacao.setText("Usuario ou senha incorretos");
            usuarioDigitado.setText("");
            senhaDigitado.setText("");
        }




    }

}