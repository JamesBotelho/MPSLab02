/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author James
 */
public class Persistencia implements Serializable {

    private static FileOutputStream writeUsers;
    private static FileInputStream readUsers;

    private static ObjectInputStream readObj;
    private static ObjectOutputStream writeObj;

    public static void carregaUsuarios() throws InfraException {
        try {
            readUsers = new FileInputStream("users.dat");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
            throw new InfraException("Não foi possível iniciar o sistema\nTente novamente mais tarde");
        }
        
        try {
            readObj = new ObjectInputStream(readUsers);
        } catch (IOException ex) {
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
            throw new InfraException("Não foi possível iniciar o sistema\nTente novamente mais tarde");
        }
    }
    
    public static void salvaUsuarios(){
        
    }
}
