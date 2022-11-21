package br.com.TrabalhoPratico.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Candidato{
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String cpf;
    private String dataNascimento;
    private int telefone;
    private String linkGit;
    private String linkLinkedln;

    @OneToOne
    @JoinColumn(name = "endereco_id", nullable = false)
    private Endereco endereco;

    @OneToMany
    @JoinColumn(name="candidato_id")
    private List<Vaga> listaVagasCadastradas;

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

    public List<Vaga> getListaVagasCadastradas() {
        return listaVagasCadastradas;
    }

    public void setListaVagasCadastradas(List<Vaga> listaVagasCadastradas) {
        this.listaVagasCadastradas = listaVagasCadastradas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
