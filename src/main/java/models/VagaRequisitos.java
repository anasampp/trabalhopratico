package models;

public class VagaRequisitos extends Vaga {
    private boolean necessitaExperiencia;
    private String experienciaMin;
    private String formacaoMinima;
    private boolean residirCidade;

    public VagaRequisitos(int id, String nomeVaga, String tipoVaga, double faixaSalarial, String observacao, String descricao,
                          String cargaHoraria, String modeloTrabalho, boolean necessitaExperiencia, String experienciaMin,
                          String formacaoMinima, boolean residirCidade){
        super(id, nomeVaga, tipoVaga, faixaSalarial, observacao, descricao, cargaHoraria, modeloTrabalho);
        this.necessitaExperiencia = necessitaExperiencia;
        this.formacaoMinima = formacaoMinima;
        this.residirCidade = residirCidade;
    }

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
