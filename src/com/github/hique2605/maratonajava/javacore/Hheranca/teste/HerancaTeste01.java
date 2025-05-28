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


        //inicializao pessoa e dps funcionario
        //se ter heranca
        //1 pai e dps e desce

        // 0 - Bloco de **inicialização estática** da super classe é executado quando a JVM carregar classe pai
        // 1 - Bloco de **inicialização estática** da sub classe é executado quando a JVM carregar classe filha
        // 2 - Alocado espaço em memória pro objeto da superclasse
        // 3 - Cada **atributo de superclasse** é criado e **inicializado** com valores default ou o que for passado
        // 4 - **Bloco de inicialização** da superclasse é executado na ordem em que aparece
        // 5 - **Construtor** é executado da superclasse
        // 6 - Alocado espaço em memória pro objeto da subclasse
        // 7 - Cada **atributo de subclasse** é criado e **inicializado** com valores default ou o que for passado
        // 8 - **Bloco de inicialização** da subclasse é executado na ordem em que aparece
        // 9 - **Construtor** é executado da subclasse


    }
}
