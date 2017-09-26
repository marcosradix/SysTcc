/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Marcos Ferreira
 */
public class AgendamentoTccModel {
        private Long id;
    	private String tcc; 
	private String tituloTcc;
	private String aluno;
	private String curso;
	private String orientador;
	private String avaliadorInterno;
	private String avaliadorExterno;
	private String areaConhecimento;
	private Date dataInicio;
	private Date dataFinal;
	private Date dataDefesa;
	private String resultadoDefesa;

    public AgendamentoTccModel(String tcc, String tituloTcc, String aluno, String curso, String orientador, String avaliadorInterno, String avaliadorExterno, String areaConhecimento, Date dataInicio, Date dataFinal, Date dataDefesa, String resultadoDefesa) {
        this.tcc = tcc;
        this.tituloTcc = tituloTcc;
        this.aluno = aluno;
        this.curso = curso;
        this.orientador = orientador;
        this.avaliadorInterno = avaliadorInterno;
        this.avaliadorExterno = avaliadorExterno;
        this.areaConhecimento = areaConhecimento;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.dataDefesa = dataDefesa;
        this.resultadoDefesa = resultadoDefesa;
    }

   public AgendamentoTccModel(Long id,String aluno, String orientador, String curso, Date dataDefesa, String tituloTcc) {
       this.id = id; 
       this.aluno = aluno;
        this.curso = curso;
        this.orientador = orientador;
        this.dataDefesa = dataDefesa;
        this.tituloTcc = tituloTcc;
    }

    public String getTcc() {
        return tcc;
    }

    public void setTcc(String tcc) {
        this.tcc = tcc;
    }

    public String getTituloTcc() {
        return tituloTcc;
    }

    public void setTituloTcc(String tituloTcc) {
        this.tituloTcc = tituloTcc;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public String getAvaliadorInterno() {
        return avaliadorInterno;
    }

    public void setAvaliadorInterno(String avaliadorInterno) {
        this.avaliadorInterno = avaliadorInterno;
    }

    public String getAvaliadorExterno() {
        return avaliadorExterno;
    }

    public void setAvaliadorExterno(String avaliadorExterno) {
        this.avaliadorExterno = avaliadorExterno;
    }

    public String getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setAreaConhecimento(String areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Date getDataDefesa() {
        return dataDefesa;
    }

    public void setDataDefesa(Date dataDefesa) {
        this.dataDefesa = dataDefesa;
    }

    public String getResultadoDefesa() {
        return resultadoDefesa;
    }

    public void setResultadoDefesa(String resultadoDefesa) {
        this.resultadoDefesa = resultadoDefesa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
        
        
}
