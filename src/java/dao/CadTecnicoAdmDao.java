/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaceDao.ICadTecnicoAdm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.CadTecnicoAdmModel;
import util.ConexaoBd;

/**
 *
 * @author marcos
 */
public class CadTecnicoAdmDao implements ICadTecnicoAdm{
Connection con;
    public CadTecnicoAdmDao() {
        con =  ConexaoBd.conecta();
    }

    
    @Override
    public void salvar(CadTecnicoAdmModel cadTecnicoAdmModel) {
                        String SQL = "insert into tecnico_adm (nome_completo, data_de_nascimento, sexo, matricula, rg, cpf, email, telefone_fixo, "
                        + "telefone_celular, endereco, numero, bairro, cidade, estado , cep) values(?, ?, ?, ?, ?, ?,?,?, ?, ?, ?, ?, ?,?,?) ";
        try {
            try (PreparedStatement ps = con.prepareStatement(SQL)) {
                ps.setString(1, cadTecnicoAdmModel.getNomeCompleto());
                ps.setString(2, cadTecnicoAdmModel.getDataDeNascimento());
                ps.setString(3,cadTecnicoAdmModel .getSexo());
                ps.setString(4, cadTecnicoAdmModel.getMatricula());
                ps.setString(5, cadTecnicoAdmModel.getRg());
                ps.setString(6, cadTecnicoAdmModel.getCpf());
                ps.setString(7, cadTecnicoAdmModel.getEmail());
                ps.setString(8, cadTecnicoAdmModel.getTelefoneFixo());
                ps.setString(9, cadTecnicoAdmModel.getTelefoneCelular());
                ps.setString(10, cadTecnicoAdmModel.getEndereco());
                ps.setString(11, cadTecnicoAdmModel.getNumero());
                ps.setString(12, cadTecnicoAdmModel.getBairro());
                ps.setString(13, cadTecnicoAdmModel.getCidade());
                ps.setString(14, cadTecnicoAdmModel.getEstado());
                ps.setString(15, cadTecnicoAdmModel.getCep());
                ps.executeUpdate();
                ps.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
