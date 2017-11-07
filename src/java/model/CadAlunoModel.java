/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author Usuário
 */
public class CadAlunoModel {
    private Long id;
    private String nomeCompleto;
    private String dataDeNascimento;
    private String sexo;
    private String rg;
    private String cpf;
    private String email;
    private String telefoneFixo;
    private String telefoneCelular;
    private String endereco;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String matricula;
    private String curso;
    private String semestre;
    private String turno;

    
   
       public CadAlunoModel(Long id) {
        this.id = id;
    }

    public CadAlunoModel(Long id, String nomeCompleto, String dataDeNascimento, String sexo, String rg,
            String cpf, String email, String telefoneFixo, String telefoneCelular, String endereco,
            String numero, String bairro, String cidade, String estado, String cep, String matricula,
            String curso, String semestre, String turno) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.dataDeNascimento = dataDeNascimento;
        this.sexo = sexo;
        this.rg = rg;
        this.cpf = cpf;
        this.email = email;
        this.telefoneFixo = telefoneFixo;
        this.telefoneCelular = telefoneCelular;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.matricula = matricula;
        this.curso = curso;
        this.semestre = semestre;
        this.turno = turno;
    }

    public CadAlunoModel(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    
       
       
        public CadAlunoModel(Long id, String nomeCompleto, String rg,String cpf,
        String endereco, String email, String curso, String matricula, String semestre, String turno, String dataNascimento) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.rg = rg;
        this.cpf = cpf;
        this.curso = curso;
        this.email = email;
        this.endereco = endereco;
        this.semestre = semestre;
        this.matricula = matricula;
        this.curso = curso;
        this.turno = turno;
        this.dataDeNascimento = dataNascimento;
    }

    public CadAlunoModel(String nomeCompleto, String dataDeNascimento, String sexo, String rg, String cpf, String email,
            String telefoneFixo, String telefoneCelular, String endereco, String numero, String bairro, String cidade,
            String estado, String cep, String matricula, String curso, String semestre, String turno) {
        this.nomeCompleto = nomeCompleto;
        this.dataDeNascimento = dataDeNascimento;
        this.sexo = sexo;
        this.rg = rg;
        this.cpf = cpf;
        this.email = email;
        this.telefoneFixo = telefoneFixo;
        this.telefoneCelular = telefoneCelular;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.matricula = matricula;
        this.curso = curso;
        this.semestre = semestre;
        this.turno = turno;
    }
       
        
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }
 
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    
    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

       
    
}
