package com.example.criptomoedas;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class Ranking extends AppCompatActivity {

    RecyclerView lista;
    RecyclerView.Adapter adp;
    bdRanking task = new bdRanking(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);
          lista = (RecyclerView) findViewById(R.id.lista);

          lista.setAdapter(new RecyclerView_Ranking());
          lista.setLayoutManager(new LinearLayoutManager(getApplicationContext()));


    }

    public ArrayList lista()
    {   ArrayList<String> dados = new ArrayList();

        try {

              dados = task.execute("get_Nome_Lista").get();

            return dados;

        }catch (Exception e)

        {
            return dados;
        }

    }

}
