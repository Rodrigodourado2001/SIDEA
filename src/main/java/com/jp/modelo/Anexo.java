package com.jp.modelo;

public class Anexo {
    private int id = 0;
    private String nomeDoArquivo = null;
    private String conteudo = null;
    private int denunciaId = 0;

    public Anexo(String nomeDoArquivo, String conteudo, int denunciaId) {
        this.nomeDoArquivo = nomeDoArquivo;
        this.conteudo = conteudo;
        this.denunciaId = denunciaId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDoArquivo() {
        return nomeDoArquivo;
    }

    public void setNomeDoArquivo(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public int getDenunciaId() {
        return denunciaId;
    }

    public void setDenunciaId(int denunciaId) {
        this.denunciaId = denunciaId;
    }
}
