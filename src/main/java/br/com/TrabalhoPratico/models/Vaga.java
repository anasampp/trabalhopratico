package br.com.TrabalhoPratico.models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Vaga {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nomeVaga;
    private String tipoVaga;
    private double faixaSalarial;
    private String observacao;
    private String descricao;
    private String cargaHoraria;
    private String modeloTrabalho;
    @OneToMany
    @JoinColumn(name="candidato_id", nullable=false)
    private ArrayList<Candidato> listaCandidatosCadastrados;
    @OneToOne
    @JoinColumn(name="empresa_id", nullable=false)
    private Empresa empresa;

    public Vaga(int id, String nomeVaga, String tipoVaga, double faixaSalarial, String observacao, String descricao,
                String cargaHoraria, String modeloTrabalho,Empresa empresa) {
        this.id = id;
        this.nomeVaga = nomeVaga;
        this.tipoVaga = tipoVaga;
        this.faixaSalarial = faixaSalarial;
        this.observacao = observacao;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.modeloTrabalho = modeloTrabalho;
        this.listaCandidatosCadastrados = new ArrayList<>();
        this.empresa = empresa;
    }

    public Vaga() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeVaga() {
        return nomeVaga;
    }

    public void setNomeVaga(String nomeVaga) {
        this.nomeVaga = nomeVaga;
    }

    public String getTipoVaga() {
        return tipoVaga;
    }

    public void setTipoVaga(String tipoVaga) {
        this.tipoVaga = tipoVaga;
    }

    public double getFaixaSalarial() {
        return faixaSalarial;
    }

    public void setFaixaSalarial(double faixaSalarial) {
        this.faixaSalarial = faixaSalarial;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getModeloTrabalho() {
        return modeloTrabalho;
    }

    public void setModeloTrabalho(String modeloTrabalho) {
        this.modeloTrabalho = modeloTrabalho;
    }

    public ArrayList<Candidato> getListaCandidatosCadastrados() {
        return listaCandidatosCadastrados;
    }

    public void setListaCandidatosCadastrados(ArrayList<Candidato> listaCandidatosCadastrados) {
        this.listaCandidatosCadastrados = listaCandidatosCadastrados;
    }
}
