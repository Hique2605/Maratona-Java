package com.github.hique2605.maratonajava.javacore.Oexception.teste;

import com.github.hique2605.maratonajava.javacore.Oexception.runtiem.teste.entidade.Funcionario;
import com.github.hique2605.maratonajava.javacore.Oexception.runtiem.teste.entidade.LoginInvalidoException;
import com.github.hique2605.maratonajava.javacore.Oexception.runtiem.teste.entidade.Pessoa;

public class SobrescritaExceptionTest01 {
    public static void main(String[] args) {


    Pessoa pessoa = new Pessoa();
    Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
           e.printStackTrace();
        }
    }
}
