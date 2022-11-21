package br.com.TrabalhoPratico.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Formacao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String area;
    private String nomeInstituicao;
    private String cursandoAtualmente;
    private Date dataInicio;
    private Date dataFim;
    private String grauFormacao;
    private String descricao;

    public Formacao(int id, String area, String nomeInstituicao, String cursandoAtualmente, Date dataInicio, Date dataFim, String grauFormacao, String descricao) {
        this.id = id;
        this.area = area;
        this.nomeInstituicao = nomeInstituicao;
        this.cursandoAtualmente = cursandoAtualmente;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.grauFormacao = grauFormacao;
        this.descricao = descricao;
    }

    public Formacao() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public String getCursandoAtualmente() {
        return cursandoAtualmente;
    }

    public void setCursandoAtualmente(String cursandoAtualmente) {
        this.cursandoAtualmente = cursandoAtualmente;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public String getGrauFormacao() {
        return grauFormacao;
    }

    public void setGrauFormacao(String grauFormacao) {
        this.grauFormacao = grauFormacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

