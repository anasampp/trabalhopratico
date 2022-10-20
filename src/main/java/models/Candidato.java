package models;

import java.util.ArrayList;

public class Candidato {
    private int id;
    private Usuario usuario;
    private String linkGit;
    private String linkLinkedln;
    private int telefone;
    private Endereco endereco;
    private ArrayList<Vaga> listaVagasCadastradas;

    public Candidato(int id, Usuario usuario, String linkGit, String linkLinkedln, int telefone, Endereco endereco) {
        this.id = id;
        this.usuario = usuario;
        this.linkGit = linkGit;
        this.linkLinkedln = linkLinkedln;
        this.telefone = telefone;
        this.endereco = endereco;
        this.listaVagasCadastradas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getLinkGit() {
        return linkGit;
    }

    public void setLinkGit(String linkGit) {
        this.linkGit = linkGit;
    }

    public String getLinkLinkedln() {
        return linkLinkedln;
    }

    public void setLinkLinkedln(String linkLinkedln) {
        this.linkLinkedln = linkLinkedln;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Vaga> getListaVagasCadastradas() {
        return listaVagasCadastradas;
    }

    public void setListaVagasCadastradas(Vaga vaga) {
        this.listaVagasCadastradas.add(vaga);
    }
}
