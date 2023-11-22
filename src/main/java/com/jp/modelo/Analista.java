package com.jp.modelo;

public class Analista {
    private int id = 0;
    private String login = null;
    private String senha = null;
    private String nomeCompleto = null;
    private String email = null;
    private String telefone = null;

    public Analista(String login, String senha, String nomeCompleto, String email, String telefone) {
        this.login = login;
        this.senha = senha;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
