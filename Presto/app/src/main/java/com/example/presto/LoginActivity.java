package com.example.presto;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;

import com.example.presto.model.Usuario;
import com.example.presto.service.HttpService;

import java.io.IOException;

public class LoginActivity extends AppCompatActivity {

    TextView resposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        resposta =  findViewById(R.id.tvResposta);

        Tarefa tarefa= new Tarefa();
        tarefa.execute("http://localhost:8080/usuario/getById/1");
    }


    @SuppressLint(value = "StaticFieldLeak")
    protected class Tarefa extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... strings) {
            HttpService http= new HttpService();
            Usuario retorno;
            retorno = http.buscar(strings[0]);
            return retorno.toString();
        }


        @Override
        protected void onPostExecute(String s) {
            resposta.setText(s);
        }

    }
}