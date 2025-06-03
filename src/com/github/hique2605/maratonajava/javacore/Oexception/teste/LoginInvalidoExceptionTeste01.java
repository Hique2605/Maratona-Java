package com.github.hique2605.maratonajava.javacore.Oexception.teste;

import com.github.hique2605.maratonajava.javacore.Oexception.runtiem.teste.entidade.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTeste01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);

        String usernameDB = "hique";
        String senhaDB = "123";

        System.out.println("Digite seu login: ");
        System.out.println("username: ");
        String usernamedigitado = sc.nextLine();
        System.out.println("password: ");
        String senhadigitado = sc.nextLine();

        if(!usernameDB.equals(usernamedigitado) || !senhaDB.equals(senhadigitado)){
            throw new LoginInvalidoException("Login ou senha inválidos");
        }
        System.out.println("Usuário logado com sucesso!");


    }


}
