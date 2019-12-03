package com.example.criptomoedas;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ArrayAdapter;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.Array;
import java.sql.DatabaseMetaData;
import java.util.ArrayList;

/**
 * Created by jonathan on 02/11/2017.
 */

public class bdRanking extends AsyncTask<String,ArrayList,ArrayList> {
    Context ctx;
    bdRanking(Context ctx) {
        this.ctx = ctx;
    }
    ArrayList<String> Dados = new ArrayList();

    @Override
    protected ArrayList doInBackground(String... paramets) {
        if(paramets[0].equals("get_Nome_Lista")) {
            String reg_Lista = "http://192.168.0.8/php_tcc/Lista.php";

            try {
                URL url = new URL(reg_Lista);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setDoInput(true);
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "ISO-8859-1"));
                String line = bufferedReader.readLine();


                int parametro = 0;
                String array[] = line.split(";");
                while (parametro < array.length) {
                    Dados.add(array[parametro]);
                //    System.out.println("TESTE R:"+Dados.get(parametro).toString());
                    parametro++;

                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
                System.out.println("Erro");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Erro1");
            }
        }else if(paramets[0].equals("get_Valor_Criptomoeda")){

            String reg_Lista1 = "http://192.168.0.8/php_tcc/Lista1.php";
            String nome = paramets[1];

            try {
                URL url = new URL(reg_Lista1);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                String data = URLEncoder.encode("nome", "UTF-8") + "=" + URLEncoder.encode(nome, "UTF-8") ;
                bufferedWriter.write(data);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "ISO-8859-1"));
                String line = bufferedReader.readLine();


                int parametro = 0;
                String array[] = line.split(";");
                while (parametro < array.length) {
                    Dados.add(array[parametro]);
                    parametro++;

                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
                System.out.println("Erro");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Erro1");
            }

        }else if(paramets[0 ].equals("Lista_Empresa")){

            String reg_Lista = "http://192.168.0.106:8080/mysqlapp/php_tcc/Lista_Empresa.php";

            try {
                URL url = new URL(reg_Lista);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setDoInput(true);
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "ISO-8859-1"));
                String line = bufferedReader.readLine();
                System.out.println( "teste " + line);

                int parametro = 0;
                String array[] = line.split(";");
                while (parametro < array.length) {
                    Dados.add(array[parametro]);

                    parametro++;

                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
                System.out.println("Erro");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Erro1");
            }

        }
        //System.out.println( "teste1 "+Dados);
        return Dados;

    }
    @Override
    protected void onPostExecute(ArrayList result) {


    }

}
