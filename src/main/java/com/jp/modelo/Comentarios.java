package com.jp.modelo;

public class Comentarios {
    private int id = 0;
    private String conteudo = null;
    private int denuncia_id = 0;
    private int analista_id = 0;

    public Comentarios(int id, String conteudo, int denuncia_id, int analista_id) {
        this.id = id;
        this.conteudo = conteudo;
        this.denuncia_id = denuncia_id;
        this.analista_id = analista_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public int getDenuncia_id() {
        return denuncia_id;
    }

    public void setDenuncia_id(int denuncia_id) {
        this.denuncia_id = denuncia_id;
    }

    public int getAnalista_id() {
        return analista_id;
    }

    public void setAnalista_id(int analista_id) {
        this.analista_id = analista_id;
    }
}
