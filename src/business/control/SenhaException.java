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
public class SenhaException extends Exception {
    public SenhaException(){
        super("A senha digitada é inválida!");
    }
    
    public SenhaException(String msg){
        super(msg);
    }
}
