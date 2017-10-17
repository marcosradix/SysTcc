/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Marcos Ferreira
 */
public class CadastrarTccModel {
    private Long id;
    private String titulo;
    private String resumo;
    private String palavraChave;
    private String curso;
    private String autor;
    private String orientador;

    public CadastrarTccModel(Long id, String titulo, String resumo, String palavraChave, String curso, String autor, String orientador) {
        this.id = id;
        this.titulo = titulo;
        this.resumo = resumo;
        this.palavraChave = palavraChave;
        this.curso = curso;
        this.autor = autor;
        this.orientador = orientador;
    }
    
      public CadastrarTccModel(Long id, String titulo, String curso, String autor, String orientador) {
        this.id = id;
        this.titulo = titulo;
        this.curso = curso;
        this.autor = autor;
        this.orientador = orientador;
    }
       public CadastrarTccModel(Long id) {
        this.id = id;
    }
    public CadastrarTccModel(String titulo, String resumo, String palavraChave, String curso, String autor, String orientador) {
        this.titulo = titulo;
        this.resumo = resumo;
        this.palavraChave = palavraChave;
        this.curso = curso;
        this.autor = autor;
        this.orientador = orientador;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

 
    
    
}
