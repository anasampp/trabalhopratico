package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private ArrayList<Candidato> listaCandidatosCadastrados;

    public Vaga(int id, String nomeVaga, String tipoVaga, double faixaSalarial, String observacao, String descricao,
                String cargaHoraria, String modeloTrabalho) {
        this.id = id;
        this.nomeVaga = nomeVaga;
        this.tipoVaga = tipoVaga;
        this.faixaSalarial = faixaSalarial;
        this.observacao = observacao;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.modeloTrabalho = modeloTrabalho;
        this.listaCandidatosCadastrados = new ArrayList<>();
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
