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
public class ValidaCampos {

    public static void vLogin(String login) throws LoginException {
        if (login.trim().isEmpty()) { //Verifica se o login é vazio
            throw new LoginException("O campo login não pode ficar em branco!");
        } else if (login.length() > 20) { //Verifica se o login possui mais de 20 caracteres
            throw new LoginException("O login não pode ter mais de 20 caracteres!");
        } else if (login.matches(".*\\d.*")) { // Verifica se o login possui dígitos
            throw new LoginException("O login não pode conter números");
        }
    }

    public static void vSenha(String senha) throws SenhaException {
        boolean correto;

        if (senha.trim().isEmpty()) {
            throw new SenhaException("O campo senha não pode ficar em branco");
        } else if (senha.length() < 8 || senha.length() > 12) { //Verifica o tamanho da senha
            throw new SenhaException("A senha deve conter entre 8 e 12 caracteres");
        }

        correto = senha.matches(".*\\d.*.*\\d.*") && senha.matches(".*\\D.*");

        if (!correto) {
            throw new SenhaException("O campo senha deve conter letras e números, e ao menos 2 números");
        }
    }
}
