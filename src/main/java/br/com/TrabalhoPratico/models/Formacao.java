package br.com.TrabalhoPratico.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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
    @OneToMany
    @JoinColumn(name="formacao_id")
    private List<Candidato> candidatos;

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

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }
}

