package com.github.hique2605.maratonajava.javacore.Hheranca.teste;

import com.github.hique2605.maratonajava.javacore.Hheranca.entidade.Endereco;
import com.github.hique2605.maratonajava.javacore.Hheranca.entidade.Funcionario;
import com.github.hique2605.maratonajava.javacore.Hheranca.entidade.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Rua A ");
        endereco.setCep("08856258");

        Endereco endereco02 = new Endereco();
        endereco02.setRua("Rua B ");
        endereco02.setCep("3333333333");


        Pessoa pessoa01 = new Pessoa();
        pessoa01.setNome("Mario");
        pessoa01.setCpf("012345");
        pessoa01.setEndereco(endereco);
        pessoa01.imprime();

        System.out.println("--------------");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("FUNCIONARIO01");
        funcionario.setCpf("078292");
        funcionario.setEndereco(endereco02);
        funcionario.setSalario(1800);
        funcionario.imprime();
       // System.out.println(funcionario.getSalario()); ou heranca usando super, imprime na classe funcioanrio usando super
        System.out.println("Relatorio pgment");
        funcionario.relatoriopagamento();
        
    }
}
