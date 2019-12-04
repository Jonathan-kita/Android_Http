package com.example.criptomoedas;

import android.content.Context;
import android.os.AsyncTask;
import android.app.AlertDialog;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URLEncoder;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class BackgroundTask extends AsyncTask<String,Void,Boolean> {
    AlertDialog alertDialog;
    Context ctx;
    String localhost = "172.20.10.2" ;

    BackgroundTask(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    protected void onPreExecute() {
        // super.onPreExecute();
        alertDialog = new AlertDialog.Builder(ctx).create();
        alertDialog.setTitle("Login  Information...");

    }


    @Override
    protected Boolean doInBackground(String... params) {
        String reg_url ="http://"+localhost+"/php_tcc/registro.php";
        System.out.println("Ver local host :"+reg_url);

        String method = params[0];
        boolean verificacao = false;
        ArrayList<String> Dados = new ArrayList();

        if (method.equals("registro")) {
            String nome = params[1];
            String valor = params[2];


            try {
                URL url = new URL(reg_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                //  httpURLConnection.setDoInput(true);
                OutputStream OS = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(OS, "UTF-8"));
                String data = URLEncoder.encode("name", "UTF-8") + "=" + URLEncoder.encode(nome, "UTF-8") + "&" +
                        URLEncoder.encode("user_name", "UTF-8") + "=" + URLEncoder.encode(valor, "UTF-8");

                bufferedWriter.write(data);
                bufferedWriter.flush();
                bufferedWriter.close();
                OS.close();
                InputStream IS = httpURLConnection.getInputStream();
                IS.close();
                //httpURLConnection.coonnect();
                httpURLConnection.disconnect();

                return verificacao = false;

            } catch (MalformedURLException e) {
                e.printStackTrace();
                return verificacao;
            } catch (IOException e) {
                e.printStackTrace();
                return verificacao;
            }

        }
        return verificacao;
    }


    public AlertDialog getAlertDialog() {
        return alertDialog;
    }

    @Override
    protected void onProgressUpdate(Void... values) {

        super.onProgressUpdate(values);
    }

    /*    @Override
        protected void onPostExecute(String result) {

               Toast.makeText(ctx,result, Toast.LENGTH_LONG).show();
            }
    */
    @Override
    protected void onPostExecute(Boolean result) {

    }
}
