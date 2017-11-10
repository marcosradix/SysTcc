/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author Marcos Ferreira
 */
public class ConexaoBd {
   private static Connection connection  = null;
   private static  boolean status =false;
    
    public static Connection conecta(){
        try {
            status = true;
            InitialContext context = new InitialContext();
           DataSource dataSource = (DataSource) context.lookup("jdbc/systcc");
            connection = dataSource.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBd.class.getName()).log(Level.SEVERE, null, ex);
            	System.out.println("Erro na copnexão ao banco de dados, erro = "+ex);
        } catch (NamingException ex) {
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
