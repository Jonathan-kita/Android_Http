package com.example.criptomoedas;

import android.app.Activity;
import android.app.NotificationManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerView_Ranking extends RecyclerView.Adapter<com.example.criptomoedas.RecyclerView_Ranking.ViewHolder> {


    @NonNull
    @Override
    public com.example.criptomoedas.RecyclerView_Ranking.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View Recycler = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemns,parent,false);
        ViewHolder holder = new ViewHolder(Recycler);
        return  holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ArrayList<String> dados = new ArrayList();
        Ranking ranking = new Ranking();
        dados = ranking.lista();
        System.out.println(" Mostar dados :" +dados.get(position));
        holder.Nome.setText(dados.get(position).toString().replaceAll("Â",""));

    }

    @Override
    public int getItemCount(){
    ArrayList<String> dados = new ArrayList();
    Ranking ranking = new Ranking();
    dados = ranking.lista();
    //System.out.println("teste de tamanho do array " + dados);
     return dados.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {   TextView Nome,Valor,Classe;


        public ViewHolder(View item)
        {
            super(item);
            Nome = (TextView) item.findViewById(R.id.txt1);

        }
    }
}
