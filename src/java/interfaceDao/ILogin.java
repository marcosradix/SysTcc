/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceDao;

import model.LoginModel;

/**
 *
 * @author marcos
 */
public interface ILogin {
 
    public LoginModel verificarLogin(String nome, String senha);
    
}
