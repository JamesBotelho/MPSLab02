/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

import business.model.Usuarios;
import infra.InfraException;
import infra.Persistencia;
import java.util.HashMap;

/**
 *
 * @author James
 */
public class ControlaUsuario {

    protected static HashMap<String, Usuarios> users = new HashMap<>();

    public static void adicionaUsuario(String login, String senha) throws LoginException, SenhaException, InfraException {
        ValidaCampos.vLogin(login);
        ValidaCampos.vSenha(senha);
        Autenticacao.loginExistente(login);
        Usuarios u = new Usuarios(login, senha);
        users.put(login, u);
        try{
            Persistencia.salvaUsuarios(users);
        }catch(InfraException ex){
            users.remove(login);
            throw ex;
        }
    }

    public static void removeUsuario(String login, String senha) throws LoginException, SenhaException, InfraException {
        Usuarios tmp;
        Autenticacao.loginExistente(login);         //Verifica se o login existe
        Autenticacao.comparaSenha(login, senha);    //Verifica se a senha existe
        tmp = users.remove(login);                  //Remove da memória e salva uma cópia
        try {
            Persistencia.salvaUsuarios(users);
        } catch (InfraException e) {                //Se der algum erro na leitura do arquivo, impede que o usuário seja removido
            users.put(login, tmp);                  //Recoloca o usuário na memória
            throw e;                                //Relança a exceção acima
        }
    }
    
    public static String logaUsuario(String login, String senha) throws SenhaException, LoginException{
        Usuarios tmp;
        Autenticacao.loginExistente(login);
        Autenticacao.comparaSenha(login, senha);
        tmp = users.get(login);
        return tmp.toString();
    }
    
    public static void iniciaSistema() throws InfraException{
        users = Persistencia.carregaUsuarios();
    }
}
