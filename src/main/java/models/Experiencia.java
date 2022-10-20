package models;

import java.util.Date;

public class Experiencia {
    private int id;
    private Empresa empresa;
    private Date dataInicio;
    private Date dataFim;
    private String cargo;
    private String descricao;

    public Experiencia(int id, Empresa empresa, Date dataInicio, Date dataFim, String cargo, String descricao) {
        this.id = id;
        this.empresa = empresa;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.cargo = cargo;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
