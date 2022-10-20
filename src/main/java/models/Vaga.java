package models;

import java.util.ArrayList;

public class Vaga {
    private int id;
    private double faixaSalarial;
    private String observacao;
    private String nomeVaga;
    private String descricao;
    private String cargaHoraria;
    private ArrayList<Candidato> listaCandidatosCadastrados;

    public Vaga(int id, double faixaSalarial, String observacao, String nomeVaga, String descricao, String cargaHoraria) {
        this.id = id;
        this.faixaSalarial = faixaSalarial;
        this.observacao = observacao;
        this.nomeVaga = nomeVaga;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.listaCandidatosCadastrados = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNomeVaga() {
        return nomeVaga;
    }

    public void setNomeVaga(String nomeVaga) {
        this.nomeVaga = nomeVaga;
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

    public ArrayList<Candidato> getListaCandidatosCadastrados() {
        return listaCandidatosCadastrados;
    }

    public void setListaCandidatosCadastrados(Candidato candidato) {
        this.listaCandidatosCadastrados.add(candidato);
    }
}
