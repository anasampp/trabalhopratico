package br.com.TrabalhoPratico.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Empresa{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String cnpj;
    private String razaoSocial;
    private int telefone;
    private String nome;
    private String email;
    private String senha;
    @OneToOne
    @JoinColumn(name="endereco_id", nullable=false)
    private Endereco enderecoEmpresa;

    @OneToMany
    @JoinColumn(name="empresa_id", nullable=false)
    private List<Vaga> listaVagas;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Endereco getEnderecoEmpresa() {
        return enderecoEmpresa;
    }

    public void setEnderecoEmpresa(Endereco enderecoEmpresa) {
        this.enderecoEmpresa = enderecoEmpresa;
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

    public List<Vaga> getListaVagas() {
        return listaVagas;
    }

    public void setListaVagas(List<Vaga> listaVagas) {
        this.listaVagas = listaVagas;
    }
}
