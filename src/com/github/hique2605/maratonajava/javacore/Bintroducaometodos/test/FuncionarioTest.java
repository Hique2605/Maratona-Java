package com.github.hique2605.maratonajava.javacore.Bintroducaometodos.test;

import com.github.hique2605.maratonajava.javacore.Bintroducaometodos.model.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        //AULA
        //funcionario1.nome = "Gui";
        //funcionario1.idade = 22;
        //funcionario1.salarios = new double[]{1200,2000,2500};
        //funcionario1.imprimeFuncionario();
        //funcionario1.imprimeMediaSalario();
        //chamei metodo dentro do metodo

        //AULA 56
        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Jorge");
        funcionario2.setIdade(64);
        funcionario2.setSalarios(new double[]{1200,987,2000});
        funcionario2.imprimeFuncionario();
        System.out.println("Média: "+ funcionario2.getMedia());






    }
}
