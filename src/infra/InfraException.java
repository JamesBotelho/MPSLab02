/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra;

/**
 *
 * @author James
 */
public class InfraException extends Exception {
    private String mensagem;
    
    public InfraException(){
        this.mensagem = "Erro na manipulação do arquivo";
    }
    
    public InfraException(String mensagem){
        this.mensagem = mensagem;
    }
}
