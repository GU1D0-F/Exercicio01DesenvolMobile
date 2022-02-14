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


    public void verificaLogin(View v){
        // variáveis com login
        String user = "admin";
        String pasw = "1234";

        //Busca e atribui as textview's por id
        TextView usuario = (TextView) findViewById(R.id.usuario);
        TextView senha = (TextView) findViewById(R.id.senha);
        TextView textoVerificacao  = (TextView) findViewById(R.id.textoVerificacao);

        // recupera o valor das textview's
        String usuario1 = usuario.getText().toString();
        String senha1 = senha.getText().toString();

        // Valida usuário e senha
        if (usuario1.equals(user) && senha1.equals(pasw))
        {
            textoVerificacao.setText("Acesso permitido");
        }
        else
        {
            textoVerificacao.setText("Usuário ou Senha inválidos!");
        }

        //limpar apos apertar botao
        usuario.setText("");
        senha.setText("");
    }

}