/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author Marcos Ferreira
 */
public class ConexaoBd {
   private static Connection connection  = null;
   private static final String usuario = "root";
    private static final String senha = "";
   private static  boolean status =false;
    private static final String URL = "jdbc:mysql://localhost:3306/systcc_db";
    
    public static Connection conecta(){
        try {
            status = true;
           //Context context = new InitialContext();
           //Context envCtx = (Context) context.lookup("java:comp/env");
           //DataSource dataSource = (DataSource) envCtx.lookup("jdbc/sysTcc");
            
            
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL,usuario, senha);
            System.out.println("Conectado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBd.class.getName()).log(Level.SEVERE, null, ex);
            	System.out.println("Erro na copnexão ao banco de dados, erro = "+ex);
        } catch (ClassNotFoundException ex) {
           Logger.getLogger(ConexaoBd.class.getName()).log(Level.SEVERE, null, ex);
       }
       return connection;
        
    }
    public static Connection desconectar(){
        if(status){
            try {
                connection.close();
                status = false;
                System.out.println("Você foi desconectado!");
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoBd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return connection;
    }

}
