/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaceDao.IAgendamentoTcc;
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
import util.ConexaoBd;

/**
 *
 * @author Marcos Ferreira
 */
public class AgendamentoTccDao implements IAgendamentoTcc{
    Connection con;
    public AgendamentoTccDao() {
        con =  ConexaoBd.conecta();
    }
    

    @Override
    public void salvar(AgendamentoTccModel agendamentoTcc) {
               String SQL = "insert into agendamento_tcc (tcc, titulo_tcc, aluno, curso, orientador,"
                       + "avaliador_interno,avaliador_externo,area_conhecimento,"
                       + "data_inicio,data_final,data_defesa,resultado_defesa) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
        try {
            try (PreparedStatement ps = con.prepareStatement(SQL)) {
                ps.setString(1, agendamentoTcc.getTcc());
                ps.setString(2, agendamentoTcc.getTituloTcc());
                ps.setString(3, agendamentoTcc.getAluno());
                ps.setString(4, agendamentoTcc.getCurso());
                ps.setString(5, agendamentoTcc.getOrientador());
                
                ps.setString(6, agendamentoTcc.getAvaliadorInterno());
                ps.setString(7, agendamentoTcc.getAvaliadorExterno());
                ps.setString(8, agendamentoTcc.getAreaConhecimento());
                ps.setDate(9, (Date) agendamentoTcc.getDataInicio());
                ps.setDate(10, (Date) agendamentoTcc.getDataFinal());
                ps.setDate(11, (Date) agendamentoTcc.getDataDefesa());
                ps.setString(12, agendamentoTcc.getResultadoDefesa());
                
                ps.executeUpdate();
                ps.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarTccDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("SQL erro" + ex.getMessage());
        }finally{
            con =  ConexaoBd.desconectar();
        }
    }

    @Override
    public List<AgendamentoTccModel> listar(String curso) {
        List<AgendamentoTccModel> listConsulta = new ArrayList<>();
        con = ConexaoBd.desconectar();
        try {
            PreparedStatement pst = con.prepareStatement("SELECT aluno, orientador, curso, data_defesa FROM agendamento_tcc where tcc =?");
            pst.setString(1, curso);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                AgendamentoTccModel agendamentoTccModel = new AgendamentoTccModel(
                     rs.getString("aluno"), rs.getString("orientador"), rs.getString("curso"), rs.getDate("data_defesa")
                );
                
                listConsulta.add(agendamentoTccModel);
                System.out.println("Lista do banco" +listConsulta);
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(AgendamentoTccDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listConsulta;
    }
    
    
    
}
