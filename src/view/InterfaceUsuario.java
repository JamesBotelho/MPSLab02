/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import business.control.ControlaUsuario;
import business.control.LoginException;
import business.control.SenhaException;
import infra.InfraException;

/**
 *
 * @author James
 */
public class InterfaceUsuario {
    
    protected static String cadSistema(String login, String senha){
        try {
            ControlaUsuario.adicionaUsuario(login, senha);
        } catch (LoginException | SenhaException | InfraException ex) {
            return ex.getMessage();
        }
        return "Cadastro efetuado!";
    }
    
    protected static String logaSistema(String login, String senha){
        try{
            ControlaUsuario.logaUsuario(login, senha);
        }catch (LoginException | SenhaException ex){
            return ex.getMessage();
        }
        return "Usuário logado com sucesso";
    }
    
    protected static String deletaSistema(String login, String senha){
        try{
            ControlaUsuario.removeUsuario(login, senha);
        }catch (InfraException | LoginException | SenhaException ex){
            return ex.getMessage();
        }
        return "Usuário deletado do sistema";
    }
}
