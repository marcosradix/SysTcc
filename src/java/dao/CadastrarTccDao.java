/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaceDao.ICadastrarTccDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        String SQL = "insert into cadastrar_tcc (autor, curso, orientador, palavra_chave, resumo) values(?, ?, ?, ?, ?) ";
        try {
            try (PreparedStatement ps = con.prepareStatement(SQL)) {
                ps.setString(1, cadastrarTccModel.getAutor());
                ps.setString(2, cadastrarTccModel.getCurso());
                ps.setString(3, cadastrarTccModel.getOrientador());
                ps.setString(4, cadastrarTccModel.getPalavraChave());
                ps.setString(5, cadastrarTccModel.getResumo());
                ps.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarTccDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    
}
