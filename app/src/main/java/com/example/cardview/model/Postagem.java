package com.example.cardview.model;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class Postagem {

    private String nome;
    private String postagem;
    private int imagem;
    //private Drawable coracao;

    public Postagem() {

    }

    public Postagem(String nome, String postagem, int imagem) {
        this.nome = nome;
        this.postagem = postagem;
        this.imagem = imagem;
        //this.coracao = coracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPostagem() {
        return postagem;
    }

    public void setPostagem(String postagem) {
        this.postagem = postagem;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    /*public Drawable getCoracao() {
        return coracao;
    }

    public void setCoracao(Drawable coracao) {
        this.coracao = coracao;
    }*/
}
