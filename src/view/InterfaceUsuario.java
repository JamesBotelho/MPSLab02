/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author James
 */
public class InterfaceUsuario {
    private static String menu = "Escolha uma opção:\n[1] - Cadastrar\n[2] - Deletar cadastro\n[3] - Entrar no sistema"
            + "\n[4] Listar todos os usuarios\n[5] - Sair";
    
    String login, senha;
    int op;
    
    public static void exibeMenu(){
        System.out.println(menu);
    }
}
