package com.example.criptomoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Cadastro(View view) {
        startActivity(new Intent(this,Cadastro.class));

    }
    public void Ranking(View view) {
        startActivity(new Intent(this,Ranking.class));

    }
}