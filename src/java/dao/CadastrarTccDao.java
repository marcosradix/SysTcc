/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaceDao.ICadastrarTccDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.AgendamentoTccModel;
import model.CadastrarTccModel;
import util.ConexaoBd;

/**
 *
 * @author Marcos Ferreira
 */
public class CadastrarTccDao implements ICadastrarTccDao{

    Connection con;
    public CadastrarTccDao() {
       con =  ConexaoBd.conecta();
    }

    
    @Override
    public void salvar(CadastrarTccModel cadastrarTccModel) {
        String SQL = "insert into cadastrar_tcc (titulo, autor, curso, orientador, palavra_chave, resumo) values(?, ?, ?, ?, ?, ?) ";
        try {
            try (PreparedStatement ps = con.prepareStatement(SQL)) {
                ps.setString(1, cadastrarTccModel.getTitulo());
                ps.setString(2, cadastrarTccModel.getAutor());
                ps.setString(3, cadastrarTccModel.getCurso());
                ps.setString(4, cadastrarTccModel.getOrientador());
                ps.setString(5, cadastrarTccModel.getPalavraChave());
                ps.setString(6, cadastrarTccModel.getResumo());
                ps.executeUpdate();
                ps.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarTccDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<CadastrarTccModel> listar(String titulo) {
        List<CadastrarTccModel> listConsulta = new ArrayList<>();
        PreparedStatement pst =null;
        ResultSet rs=null;
        try {
             if(!titulo.isEmpty()){
                con = ConexaoBd.conecta();
                pst = con.prepareStatement("SELECT id ,titulo, orientador, curso, autor, orientador FROM cadastrar_tcc where titulo LIKE ?");
                pst.setString(1, titulo+"%");
                rs = pst.executeQuery();
            
            while(rs.next()){
                CadastrarTccModel cadastrarTccModel = new CadastrarTccModel(
                    rs.getLong("id"), rs.getString("titulo"), rs.getString("curso"), rs.getString("autor"), rs.getString("orientador")
                );
                
                listConsulta.add(cadastrarTccModel);
                
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
    public CadastrarTccModel buscar(Long id) {
        CadastrarTccModel cadastrarTccModel= null;
        PreparedStatement pst =null;
        ResultSet rs=null;
        try {
             if(id != null){
                con = ConexaoBd.conecta();
                pst = con.prepareStatement("SELECT * FROM cadastrar_tcc where id= ?");
                pst.setLong(1, id);
                rs = pst.executeQuery();
            
            if(rs.next()){
                cadastrarTccModel = new CadastrarTccModel(
                    rs.getLong("id"), rs.getString("titulo"),rs.getString("resumo"),rs.getString("palavra_chave"), rs.getString("curso"), rs.getString("autor"), rs.getString("orientador")
                );
                
                }
               }
        } catch (SQLException ex) {
            Logger.getLogger(AgendamentoTccDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
          con = ConexaoBd.desconectar();
        }
        
        return cadastrarTccModel;
    }

    @Override
    public void editar(CadastrarTccModel cadastrarTccModel) {
                String SQL = "update cadastrar_tcc set titulo=?, autor=?, curso=?, orientador=?, palavra_chave=?, resumo=? where id=?";
        try {
            try (PreparedStatement ps = con.prepareStatement(SQL)) {
                ps.setString(1, cadastrarTccModel.getTitulo());
                ps.setString(2, cadastrarTccModel.getAutor());
                ps.setString(3, cadastrarTccModel.getCurso());
                ps.setString(4, cadastrarTccModel.getOrientador());
                ps.setString(5, cadastrarTccModel.getPalavraChave());
                ps.setString(6, cadastrarTccModel.getResumo());
                ps.setLong(7, cadastrarTccModel.getId());
                ps.execute();
                ps.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarTccDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
     public void deletar(CadastrarTccModel id) {
                String SQL = "DELETE FROM cadastrar_tcc where id=?";
            try (PreparedStatement ps = con.prepareStatement(SQL)) {
                ps.setLong(1, id.getId());
                ps.execute();
                ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarTccDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
