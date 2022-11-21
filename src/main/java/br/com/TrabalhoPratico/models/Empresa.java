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
}
