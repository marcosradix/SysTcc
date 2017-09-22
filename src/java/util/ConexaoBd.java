/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcos Ferreira
 */
public class ConexaoBd {
    Connection connection  = null;
    String usuario = "root";
    String senha = "";
    boolean status =false;
    String URL = "jdbc:mysql://localhost:3306/systcc_db";
    
    public boolean conecta(){
        try {
            status = true;
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL,usuario, senha);
            System.out.println("Conectado com sucesso!");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConexaoBd.class.getName()).log(Level.SEVERE, null, ex);
            	System.out.println("Erro na copnexão ao banco de dados, erro = "+ex);
        }
        return true;
    }
    public boolean desconectar(){
        if(status){
            try {
                connection.close();
                status = false;
                System.out.println("Você foi desconectado!");
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoBd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return false;
    }
  
}
