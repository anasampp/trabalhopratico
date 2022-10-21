package models;

public class Empresa extends Usuario{
    private String cnpj;
    private String razaoSocial;
    private int telefone;
    private Endereco enderecoEmpresa;

    public Empresa(int id, String nome, String email, String senha, int tipoUsuario, String cnpj, String razaoSocial, int telefone, Endereco enderecoEmpresa) {
        super(id, nome, email, senha, tipoUsuario);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.telefone = telefone;
        this.enderecoEmpresa = enderecoEmpresa;
    }

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
}
