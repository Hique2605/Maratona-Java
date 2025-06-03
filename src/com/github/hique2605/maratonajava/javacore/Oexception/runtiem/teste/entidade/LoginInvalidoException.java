package com.github.hique2605.maratonajava.javacore.Oexception.runtiem.teste.entidade;

public class LoginInvalidoException extends Exception{
    //extends propria excacao criada

    public LoginInvalidoException() {
        super("Login invalido");
    }

    public LoginInvalidoException(String message) {
        super(message); //chama o construtor da classe Exception
    }



}
