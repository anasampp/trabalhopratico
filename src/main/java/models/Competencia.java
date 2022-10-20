package models;

import java.util.ArrayList;

public class Competencia {
    private int id;
    private String conhecimento;
    private ArrayList<String> listaHabilidades;
    private ArrayList<String> listaSoftSkills;

    public Competencia(int id, String conhecimento) {
        this.id = id;
        this.conhecimento = conhecimento;
        this.listaHabilidades = new ArrayList<>();
        this.listaSoftSkills = new ArrayList<>();
    }

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

    public ArrayList<String> getListaHabilidades() {
        return listaHabilidades;
    }

    public void setListaHabilidades(String habilidade) {
        this.listaHabilidades.add(habilidade);
    }

    public ArrayList<String> getListaSoftSkills() {
        return listaSoftSkills;
    }

    public void setListaSoftSkills(String softskill) {
        this.listaSoftSkills.add(softskill);
    }
}
