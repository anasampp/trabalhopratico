package br.com.TrabalhoPratico.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Competencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String conhecimento;
    @ElementCollection
    private List<String> listaHabilidades;
    @ElementCollection
    private List<String> listaSoftSkills;
    @OneToMany
    @JoinColumn(name="candidato_id")
    private List<Candidato> candidatos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConhecimento() {
        return conhecimento;
    }

    public void setConhecimento(String conhecimento) {
        this.conhecimento = conhecimento;
    }
    //@ElementCollection
    public List<String> getListaHabilidades() {
        return listaHabilidades;
    }

    public void setListaHabilidades(String habilidade) {
        this.listaHabilidades.add(habilidade);
    }
    //@ElementCollection
    public List<String> getListaSoftSkills() {
        return listaSoftSkills;
    }

    public void setListaSoftSkills(String softskill) {
        this.listaSoftSkills.add(softskill);
    }

    public void setListaHabilidades(List<String> listaHabilidades) {
        this.listaHabilidades = listaHabilidades;
    }

    public void setListaSoftSkills(List<String> listaSoftSkills) {
        this.listaSoftSkills = listaSoftSkills;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }
}
