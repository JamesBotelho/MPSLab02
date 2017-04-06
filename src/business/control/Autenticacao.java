/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

import static business.control.ControlaUsuario.users;
import business.model.Usuarios;
/**
 *
 * @author James
 */
public class Autenticacao {
    
    
    public static void loginExistente(String login) throws LoginException{
        if(!users.containsKey(login)){
            throw new LoginException("O login inserido não existe");
        }
    }
    
    public static void comparaSenha(String login, String senha) throws SenhaException{
        Usuarios u = users.get(login);
        if(!u.getSenha().equals(senha)){
            throw new SenhaException("A senha inserida está incorreta");
        }
    }
}
