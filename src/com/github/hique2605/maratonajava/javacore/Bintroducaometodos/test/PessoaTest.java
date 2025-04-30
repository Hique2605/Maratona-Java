package com.github.hique2605.maratonajava.javacore.Bintroducaometodos.test;

import com.github.hique2605.maratonajava.javacore.Bintroducaometodos.entidade.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("AMALIA");
        pessoa.setIdade(80);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        //pessoa.imprime();



    }
}
