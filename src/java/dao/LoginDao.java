/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaceDao.ILogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.LoginModel;
import util.ConexaoBd;

/**
 *
 * @author marcos
 */
public class LoginDao implements ILogin{
Connection con;
    public LoginDao() {
        con = ConexaoBd.conecta();
    }
    
    

    @Override
    public LoginModel verificarLogin(LoginModel loginModel) {
        PreparedStatement pst =null;
        LoginModel loginModel2 = new LoginModel("", "");
        ResultSet rs=null;
        try {
                con = ConexaoBd.conecta();
                pst = con.prepareStatement("SELECT usuario, senha FROM login where usuario=? and senha=?");
                pst.setString(1, loginModel.getUsuario());
                pst.setString(2, loginModel.getSenha());
                rs = pst.executeQuery();
                if(rs.next()){
                     loginModel2 = new LoginModel(rs.getString("usuario"),rs.getString("senha"));  
                }
               
        } catch (SQLException ex) {
            Logger.getLogger(AgendamentoTccDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
          con = ConexaoBd.desconectar();
        }
        
        return loginModel2;
    }
    
}
