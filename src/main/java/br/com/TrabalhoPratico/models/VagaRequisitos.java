package br.com.TrabalhoPratico.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class VagaRequisitos extends Vaga {
    private boolean necessitaExperiencia;
    private String experienciaMin;
    private String formacaoMinima;
    private boolean residirCidade;

    public boolean isNecessitaExperiencia() {
        return necessitaExperiencia;
    }
    public void setNecessitaExperiencia(boolean necessitaExperiencia) {
        this.necessitaExperiencia = necessitaExperiencia;
    }

    public String getExperienciaMin() {
        return experienciaMin;
    }

    public void setExperienciaMin(String experienciaMin) {
        this.experienciaMin = experienciaMin;
    }

    public String getFormacaoMinima() {
        return formacaoMinima;
    }

    public void setFormacaoMinima(String formacaoMinima) {
        this.formacaoMinima = formacaoMinima;
    }

    public boolean isResidirCidade() {
        return residirCidade;
    }

    public void setResidirCidade(boolean residirCidade) {
        this.residirCidade = residirCidade;
    }


}
