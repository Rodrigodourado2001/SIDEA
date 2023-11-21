package com.jp.modelo;
import java.sql.Date;

public class Denuncia {
    private int id = 0;
    private String protocolo = null;
    private int id_denuncia = 0;
    private String sigilo = null;
    private String CEP = null;
    private String logradouro = null;
    private String atividadeCategoria = null;
    private String bairro = null;
    private String municipio = null;
    private String referencia = null;
    private String latitude = null;
    private String descricao = null;
    private String outrasIinformações;
    private Date dataDoOcorrido = null;
    private Date dataDaDenuncia = null;
    private String horaDaDenuncia = null;
    private Date dataEncerramento = null;
    private String horaEncerramento =  null;
    private String provavelCriminoso = null;
    private int denuncianteId = 0;
    private int analistaId = 0;
    private String status = null;
    private String parecerTecnico = null;

    public Denuncia(int id, String protocolo, int id_denuncia, String sigilo, String CEP, String logradouro,
                    String atividadeCategoria, String bairro, String municipio, String referencia, String latitude,
                    String descricao, String outrasIinformações, Date dataDoOcorrido, Date dataDaDenuncia, String horaDaDenuncia,
                    Date dataEncerramento, String horaEncerramento, String provavelCriminoso, int denuncianteId, int analistaId,
                    String status, String parecerTecnico) {

        this.id = id;
        this.protocolo = protocolo;
        this.id_denuncia = id_denuncia;
        this.sigilo = sigilo;
        this.CEP = CEP;
        this.logradouro = logradouro;
        this.atividadeCategoria = atividadeCategoria;
        this.bairro = bairro;
        this.municipio = municipio;
        this.referencia = referencia;
        this.latitude = latitude;
        this.descricao = descricao;
        this.outrasIinformações = outrasIinformações;
        this.dataDoOcorrido = dataDoOcorrido;
        this.dataDaDenuncia = dataDaDenuncia;
        this.horaDaDenuncia = horaDaDenuncia;
        this.dataEncerramento = dataEncerramento;
        this.horaEncerramento = horaEncerramento;
        this.provavelCriminoso = provavelCriminoso;
        this.denuncianteId = denuncianteId;
        this.analistaId = analistaId;
        this.status = status;
        this.parecerTecnico = parecerTecnico;
    }

    public Denuncia(int id, String protocolo, String sigilo, String CEP, String logradouro, String atividadeCategoria, String bairro,
                    String municipio, String referencia, Date dataDoOcorrido, Date dataDaDenuncia, int denuncianteId, String status){

        this.id = id;
        this.protocolo = protocolo;
        this.sigilo = sigilo;
        this.CEP = CEP;
        this.logradouro = logradouro;
        this.atividadeCategoria = atividadeCategoria;
        this.bairro = bairro;
        this.municipio = municipio;
        this.referencia = referencia;
        this.dataDoOcorrido = dataDoOcorrido;
        this.dataDaDenuncia = dataDaDenuncia;
        this.denuncianteId = denuncianteId;
        this.status = status;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public int getId_denuncia() {
        return id_denuncia;
    }

    public void setId_denuncia(int id_denuncia) {
        this.id_denuncia = id_denuncia;
    }

    public String getSigilo() {
        return sigilo;
    }

    public void setSigilo(String sigilo) {
        this.sigilo = sigilo;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getAtividadeCategoria() {
        return atividadeCategoria;
    }

    public void setAtividadeCategoria(String atividadeCategoria) {
        this.atividadeCategoria = atividadeCategoria;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getOutrasIinformações() {
        return outrasIinformações;
    }

    public void setOutrasIinformações(String outrasIinformações) {
        this.outrasIinformações = outrasIinformações;
    }

    public Date getDataDoOcorrido() {
        return dataDoOcorrido;
    }

    public void setDataDoOcorrido(Date dataDoOcorrido) {
        this.dataDoOcorrido = dataDoOcorrido;
    }

    public Date getDataDaDenuncia() {
        return dataDaDenuncia;
    }

    public void setDataDaDenuncia(Date dataDaDenuncia) {
        this.dataDaDenuncia = dataDaDenuncia;
    }

    public String getHoraDaDenuncia() {
        return horaDaDenuncia;
    }

    public void setHoraDaDenuncia(String horaDaDenuncia) {
        this.horaDaDenuncia = horaDaDenuncia;
    }

    public Date getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(Date dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }

    public String getHoraEncerramento() {
        return horaEncerramento;
    }

    public void setHoraEncerramento(String horaEncerramento) {
        this.horaEncerramento = horaEncerramento;
    }

    public String getProvavelCriminoso() {
        return provavelCriminoso;
    }

    public void setProvavelCriminoso(String provavelCriminoso) {
        this.provavelCriminoso = provavelCriminoso;
    }

    public int getDenuncianteId() {
        return denuncianteId;
    }

    public void setDenuncianteId(int denuncianteId) {
        this.denuncianteId = denuncianteId;
    }

    public int getAnalistaId() {
        return analistaId;
    }

    public void setAnalistaId(int analistaId) {
        this.analistaId = analistaId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getParecerTecnico() {
        return parecerTecnico;
    }

    public void setParecerTecnico(String parecerTecnico) {
        this.parecerTecnico = parecerTecnico;
    }
}
