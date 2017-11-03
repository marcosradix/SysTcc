/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaceDao.ICadProfessorDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.CadProfessorModel;
import util.ConexaoBd;
/**
 *
 * @author Usuário
 */
public class CadProfessorDao implements ICadProfessorDao{

    Connection con;
    public CadProfessorDao() {
       con =  ConexaoBd.conecta();
    }

    @Override
    public void salvar(CadProfessorModel cadProfessorModel) {
                String SQL = "insert into cadastrar_professor (nome_completo, data_nascimento, sexo, matricula, rg, cpf, email, telefone_fixo, "
                        + "telefone_celular, endereco, numero, bairro, cidade, estado , cep) values(?, ?, ?, ?, ?, ?,?,?, ?, ?, ?, ?, ?,?,?) ";
        try {
            try (PreparedStatement ps = con.prepareStatement(SQL)) {
                ps.setString(1, cadProfessorModel.getNomeCompleto());
                ps.setString(2, cadProfessorModel.getDataDeNascimento());
                ps.setString(3,cadProfessorModel .getSexo());
                ps.setString(4, cadProfessorModel.getMatricula());
                ps.setString(5, cadProfessorModel.getRg());
                ps.setString(6, cadProfessorModel.getCpf());
                ps.setString(7, cadProfessorModel.getEmail());
                ps.setString(8, cadProfessorModel.getTelefoneFixo());
                ps.setString(9, cadProfessorModel.getTelefoneCelular());
                ps.setString(10, cadProfessorModel.getEndereco());
                ps.setString(11, cadProfessorModel.getNumero());
                ps.setString(12, cadProfessorModel.getBairro());
                ps.setString(13, cadProfessorModel.getCidade());
                ps.setString(14, cadProfessorModel.getEstado());
                ps.setString(15, cadProfessorModel.getCep());
                ps.executeUpdate();
                ps.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadProfessorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<CadProfessorModel> listar(String nomeCompleto) {
        List<CadProfessorModel> listConsulta = new ArrayList<>();
        PreparedStatement pst =null;
        ResultSet rs=null;
        try {
             if(!nomeCompleto.isEmpty()){
                con = ConexaoBd.conecta();
                pst = con.prepareStatement("SELECT id ,nome_completo, data_nascimento, sexo, matricula, rg, cpf, email, telefone_fixo, telefone_celular, endereco, numero, bairro, cidade, estado, cep FROM cadastrar_professor where nome_completo LIKE ?");
                pst.setString(1, nomeCompleto+"%");
                rs = pst.executeQuery();
            
            while(rs.next()){
                CadProfessorModel cadProfessorModel = new CadProfessorModel (
                    rs.getLong("id"), rs.getString("nome_completo"), rs.getString("data_nascimento"), rs.getString("sexo"), rs.getString("matricula"), 
                        rs.getString("rg"), rs.getString("cpf"), rs.getString("email"), rs.getString("telefone_fixo"), rs.getString("telefone_celular"), 
                        rs.getString("endereco"), rs.getString("numero"), rs.getString("bairro"), rs.getString("cidade"), rs.getString("estado"),
                rs.getString("cep"));
                
                listConsulta.add(cadProfessorModel);
                
                    }
               }
        } catch (SQLException ex) {
            Logger.getLogger(CadProfessorDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
          con = ConexaoBd.desconectar();
        }
        
        return listConsulta;
    }

    @Override
    public CadProfessorModel buscar(Long id) {
        CadProfessorModel cadProfessorModel = null;
        PreparedStatement pst =null;
        ResultSet rs=null;
        try {
             if(id != null){
                con = ConexaoBd.conecta();
                pst = con.prepareStatement("SELECT * FROM cadastrar_professor where id= ?");
                pst.setLong(1, id);
                rs = pst.executeQuery();
            
            if(rs.next()){
                    cadProfessorModel = new CadProfessorModel(
                            rs.getLong("id"), rs.getString("nome_completo"), rs.getString("data_nascimento"), rs.getString("sexo"),
                            rs.getString("matricula"), rs.getString("rg"), rs.getString("cpf"), rs.getString("email"),
                            rs.getString("telefone_fixo"), rs.getString("telefone_celular"), rs.getString("endereco"),
                            rs.getString("numero"), rs.getString("bairro"), rs.getString("cidade"), rs.getString("estado"),
                            rs.getString("cep"));
                }
               }
        } catch (SQLException ex) {
            Logger.getLogger(CadProfessorDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
          con = ConexaoBd.desconectar();
        }
        
        return cadProfessorModel;
    }

    @Override
    public void editar(CadProfessorModel cadProfessorodel) {
                String SQL = "update cadastrar_professor set nome_completo=?, data_nascimento=?, sexo=?, matricula=?, rg=?, "
                        + "cpf=?, email=?, telefone_fixo=?, " + "telefone_celular=?, endereco=?, numero=?, bairro=?, "
                        + "cidade=?, estado=?, cep=? where id=?";
        try {
            try (PreparedStatement ps = con.prepareStatement(SQL)) {
                ps.setString(1, cadProfessorodel.getNomeCompleto());
                ps.setString(2, cadProfessorodel.getDataDeNascimento());
                ps.setString(3, cadProfessorodel.getSexo());
                ps.setString(4, cadProfessorodel.getMatricula());
                ps.setString(5, cadProfessorodel.getRg());
                ps.setString(6, cadProfessorodel.getCpf());
                ps.setString(7, cadProfessorodel.getEmail());
                ps.setString(8, cadProfessorodel.getTelefoneFixo());
                ps.setString(9, cadProfessorodel.getTelefoneCelular());
                ps.setString(10, cadProfessorodel.getEndereco());
                ps.setString(11, cadProfessorodel.getNumero());
                ps.setString(12, cadProfessorodel.getBairro());
                ps.setString(13, cadProfessorodel.getCidade());
                ps.setString(14, cadProfessorodel.getEstado());
                ps.setString(15, cadProfessorodel.getCep());
                ps.setLong(16,cadProfessorodel.getId());
                ps.executeUpdate();
                ps.close();            }
        } catch (SQLException ex) {
            Logger.getLogger(CadProfessorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    public void deletar(CadProfessorModel id) {
        String SQL = "DELETE FROM cadastrar_professor where id=?";
       try {
           try (PreparedStatement ps = con.prepareStatement(SQL)) {
                ps.setLong(1, id.getId());
                ps.execute();
                ps.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadProfessorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
