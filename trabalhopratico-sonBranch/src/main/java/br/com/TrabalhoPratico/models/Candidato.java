package br.com.TrabalhoPratico.models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Candidato extends Usuario{
    @Id
    @GeneratedValue
    private int id;
    private String cpf;
    private String dataNascimento;
    private int telefone;
    @OneToOne
    @JoinColumn(name="endereco_id", nullable=false)
    private Endereco endereco;
    private String linkGit;
    private String linkLinkedln;
    @OneToMany
    @JoinColumn(name="competencia_id", nullable=false)
    private ArrayList<Competencia> listaCompetencias;
    @OneToMany
    @JoinColumn(name="experiencia_id", nullable=false)
    private ArrayList<Experiencia> listaExperiencias;
    @OneToMany
    @JoinColumn(name="formacao_id", nullable=false)
    private ArrayList<Formacao> formacao;
    @OneToMany
    @JoinColumn(name="especializacao_id", nullable=false)
    private ArrayList<Especializacao> especializacao;
    @OneToMany
    @JoinColumn(name="vaga_id", nullable=false)
    private ArrayList<Vaga> listaVagasCadastradas;



    public Candidato(int id, String nome, String email, String senha, int tipo, String cpf, String dataNascimento,
                     int telefone, Endereco endereco, String linkGit, String linkLinkedln) {
        super(id, nome, email, senha, tipo);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
        this.linkGit = linkGit;
        this.linkLinkedln = linkLinkedln;
        this.listaVagasCadastradas = new ArrayList<>();
        this.listaCompetencias = new ArrayList<>();
        this.listaExperiencias = new ArrayList<>();
        this.formacao = new ArrayList<>();
        this.especializacao = new ArrayList<>();
    }

    public Candidato() {

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public ArrayList<Vaga> getListaVagasCadastradas() {
        return listaVagasCadastradas;
    }

    public void setListaVagasCadastradas(ArrayList<Vaga> listaVagasCadastradas) {
        this.listaVagasCadastradas = listaVagasCadastradas;
    }
}
