/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaceDao.ICadAlunoDao;
import interfaceDao.ICadastrarTccDao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.AgendamentoTccModel;
import model.CadastrarTccModel;
import model.CadAlunoModel;
import util.ConexaoBd;
/**
 *
 * @author Usuário
 */
public class CadAlunoDao implements ICadAlunoDao{

    Connection con;
    public CadAlunoDao() {
       con =  ConexaoBd.conecta();
    }

    @Override
    public void salvar(CadAlunoModel cadAlunoModel) {
                String SQL = "insert into cadastrar_aluno (nome_completo, data_de_nascimento, sexo, rg, cpf, email, telefone_fixo, "
                        + "telefone_celular, endereco, numero, bairro, cidade, estado , cep, matricula, curso, semestre, turno) values(?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?) ";
        try {
            try (PreparedStatement ps = con.prepareStatement(SQL)) {
                ps.setString(1, cadAlunoModel.getNomeCompleto());
                ps.setString(2, cadAlunoModel.getDataDeNascimento());
                ps.setString(3, cadAlunoModel.getSexo());
                ps.setString(4, cadAlunoModel.getRg());
                ps.setString(5, cadAlunoModel.getCpf());
                ps.setString(6, cadAlunoModel.getEmail());
                ps.setString(7, cadAlunoModel.getTelefoneFixo());
                ps.setString(8, cadAlunoModel.getTelefoneCelular());
                ps.setString(9, cadAlunoModel.getEndereco());
                ps.setString(10, cadAlunoModel.getNumero());
                ps.setString(11, cadAlunoModel.getBairro());
                ps.setString(12, cadAlunoModel.getCidade());
                ps.setString(13, cadAlunoModel.getEstado());
                ps.setString(14, cadAlunoModel.getCep());
                ps.setString(15, cadAlunoModel.getMatricula());
                ps.setString(16, cadAlunoModel.getCurso());
                ps.setString(17, cadAlunoModel.getSemestre());
                ps.setString(18, cadAlunoModel.getTurno());
                ps.executeUpdate();
                ps.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadAlunoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<CadAlunoModel> listar(String nomeCompleto) {
        List<CadAlunoModel> listConsulta = new ArrayList<>();
        PreparedStatement pst =null;
        ResultSet rs=null;
        try {
             if(!nomeCompleto.isEmpty()){
                con = ConexaoBd.conecta();
                pst = con.prepareStatement("SELECT id ,nome_completo,data_de_nascimento, rg, cpf, endereco, email, curso, matricula, semestre, turno FROM cadastrar_aluno where nome_completo LIKE ?");
                pst.setString(1, nomeCompleto+"%");
                rs = pst.executeQuery();
            
            while(rs.next()){
                CadAlunoModel cadAlunoModel = new CadAlunoModel (
                    rs.getLong("id"), rs.getString("nome_completo"), rs.getString("rg"), rs.getString("cpf")
                        , rs.getString("endereco"), rs.getString("email"), rs.getString("curso"), rs.getString("matricula")
                       , rs.getString("semestre"), rs.getString("turno"), rs.getString("data_de_nascimento")
                );
                
                listConsulta.add(cadAlunoModel);
                
                    }
               }
        } catch (SQLException ex) {
            Logger.getLogger(AgendamentoTccDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
          con = ConexaoBd.desconectar();
        }
       
        return listConsulta;
    }

    @Override
    public CadAlunoModel buscar(Long id) {
        CadAlunoModel cadAlunoModel = null;
        PreparedStatement pst =null;
        ResultSet rs=null;
        try {
             if(id != null){
                con = ConexaoBd.conecta();
                pst = con.prepareStatement("SELECT * FROM cadastrar_aluno where id= ?");
                pst.setLong(1, id);
                rs = pst.executeQuery();
            
            if(rs.next()){
                cadAlunoModel = new CadAlunoModel(
                        rs.getLong("id"),rs.getString("nome_completo"),rs.getString("data_de_nascimento"),rs.getString("sexo"), rs.getString("rg"),
                        rs.getString("cpf"),rs.getString("email"),rs.getString("telefone_fixo"),rs.getString("telefone_celular"), rs.getString("endereco"), rs.getString("numero"),
                        rs.getString("bairro"), rs.getString("cidade"), rs.getString("estado"), rs.getString("cep"), rs.getString("matricula"),
                        rs.getString("curso"),rs.getString("semestre"),rs.getString("turno")
                    );
                
                }
               }
        } catch (SQLException ex) {
            Logger.getLogger(AgendamentoTccDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
          con = ConexaoBd.desconectar();
        }
        
        return cadAlunoModel;
    }

    @Override
    public void editar(CadAlunoModel cadAlunoModel) {
                String SQL = "update cadastrar_aluno set nome_completo=?, data_de_nascimento=?, sexo=?, rg=?, cpf=?, email=?, telefone_fixo=?, "
                        + "telefone_celular=?, endereco=?, numero=?, bairro=?, cidade=?, estado=?, cep=?, matricula=?, curso=?, semestre=?, turno=? where id=?";
        try {
            try (PreparedStatement ps = con.prepareStatement(SQL)) {
                ps.setString(1, cadAlunoModel.getNomeCompleto());
                ps.setString(2, cadAlunoModel.getDataDeNascimento());
                ps.setString(3, cadAlunoModel.getSexo());
                ps.setString(4, cadAlunoModel.getRg());
                ps.setString(5, cadAlunoModel.getCpf());
                ps.setString(6, cadAlunoModel.getEmail());
                ps.setString(7, cadAlunoModel.getTelefoneFixo());
                ps.setString(8, cadAlunoModel.getTelefoneCelular());
                ps.setString(9, cadAlunoModel.getEndereco());
                ps.setString(10, cadAlunoModel.getNumero());
                ps.setString(11, cadAlunoModel.getBairro());
                ps.setString(12, cadAlunoModel.getCidade());
                ps.setString(13, cadAlunoModel.getEstado());
                ps.setString(14, cadAlunoModel.getCep());
                ps.setString(15, cadAlunoModel.getMatricula());
                ps.setString(16, cadAlunoModel.getCurso());
                ps.setString(17, cadAlunoModel.getSemestre());
                ps.setString(18, cadAlunoModel.getTurno());
                ps.setLong(19,cadAlunoModel.getId());
                ps.executeUpdate();
                ps.close();            }
        } catch (SQLException ex) {
            Logger.getLogger(CadAlunoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    public void deletar(CadAlunoModel id) {
        String SQL = "DELETE FROM cadastrar_aluno where id=?";
       try {
           try (PreparedStatement ps = con.prepareStatement(SQL)) {
                ps.setLong(1, id.getId());
                ps.execute();
                ps.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadAlunoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<CadAlunoModel> listarAluno() {
                List<CadAlunoModel> listConsulta = new ArrayList<>();
        PreparedStatement pst =null;
        ResultSet rs=null;
        try {

                con = ConexaoBd.conecta();
                pst = con.prepareStatement("SELECT nome_completo FROM cadastrar_aluno");
                rs = pst.executeQuery();
            
            while(rs.next()){
                CadAlunoModel cadAlunoModel = new CadAlunoModel (
                   rs.getString("nome_completo")
                );
                
                listConsulta.add(cadAlunoModel);
                
                    }
               
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
          con = ConexaoBd.desconectar();
        }
       
        return listConsulta;
    }
   
}
