package models;

public class Empresa {
    private int id;
    private Usuario usuario;
    private String nome;
    private String cnpj;
    private String razao;
    private int telefone;
    private Endereco enderecoEmpresa;

    public Empresa(int id, Usuario usuario, String nome, String cnpj, String razao, int telefone, Endereco enderecoEmpresa) {
        this.id = id;
        this.usuario = usuario;
        this.nome = nome;
        this.cnpj = cnpj;
        this.razao = razao;
        this.telefone = telefone;
        this.enderecoEmpresa = enderecoEmpresa;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
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
}
