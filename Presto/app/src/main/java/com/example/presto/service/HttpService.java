package com.example.presto.service;

import com.example.presto.model.Usuario;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class HttpService {
    private String usuarioUri = "http://localhost:8080/usuario";
    private String cardapioUri;
    private String produtoUri;
    private String pedidoUri;
    private String mesaUri;

    public Usuario buscar(String uri){
        StringBuilder resposta = new StringBuilder();
        try {
            URL url = new URL(uri);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);
            connection.setConnectTimeout(5000);
            connection.connect();

            Scanner scanner = new Scanner(url.openStream());
            while (scanner.hasNext()) {
                resposta.append(scanner.next());
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Gson().fromJson(resposta.toString(), Usuario.class);
    }

    public Usuario getUsuario(String email) {
        String url = this.usuarioUri+"/getemail/"+email;
        return this.buscar(email);
    }

//    public String httpRequisicaoTest() throws IOException {
//        URL url = new URL("http://localhost:8080/usuario/getById/1%22);
//                OkHttpClient client = new OkHttpClient();
//
//        Request request = new Request.Builder().url(url).build();
//
//        Response response = client.newCall(request).execute();
//
//        if (response.code() != 200) {
//            System.out.println("houve um erro na transição");
//            return "erro!";
//        } else {
//            String body = response.body().string();
//            // Usar o body retornado pelo servidor...
//            return body;
//        }
//    }
}
