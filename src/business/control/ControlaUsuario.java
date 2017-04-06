/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

import business.model.Usuarios;
import java.util.HashMap;

/**
 *
 * @author James
 */
public class ControlaUsuario {

    protected static HashMap<String, Usuarios> users = new HashMap<>();

    public static void adicionaUsuario(String login, String senha) throws LoginException, SenhaException {
        ValidaCampos.vLogin(login);
        ValidaCampos.vSenha(senha);
        Usuarios u = new Usuarios(login, senha);
        users.put(login, u);
    }
    
    public static void removeUsuario(String login, String senha) throws LoginException, SenhaException{
        Autenticacao.loginExistente(login);
        Autenticacao.comparaSenha(login, senha);
        users.remove(login);
    }
}
