package com.example.cardview.activity;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.LinearLayout;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);


        //Define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        //PRA LAYOUT IGUAL AO PINTEREST USAR GRIDLAYOUT:
        //RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);

        recyclerPostagem.setLayoutManager( layoutManager );

        //define adapter
        prepararPostagens();

        PostagemAdapter adapter = new PostagemAdapter( postagens);
        recyclerPostagem.setAdapter( adapter );

    }

    public void prepararPostagens(){

        Postagem p = new Postagem("Gustavo H. Schwerz", "#tbt Trip Louca", R.drawable.imagem1);
        this.postagens.add( p );

        p = new Postagem("Hotel G.H.S.", "Descontos incríveis!", R.drawable.imagem2);
        this.postagens.add( p );

        p = new Postagem("Ana L. S.", "#Paris", R.drawable.imagem3);
        this.postagens.add( p );

        p = new Postagem("Carol A.", "Que foto incrível!", R.drawable.imagem4);
        this.postagens.add( p );

    }

}