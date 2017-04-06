/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

/**
 *
 * @author James
 */
public class LoginException extends Exception {
    public LoginException(){
        super("O login digitado é inválido");
    }
    
    public LoginException(String msg){
        super(msg);
    }
}
