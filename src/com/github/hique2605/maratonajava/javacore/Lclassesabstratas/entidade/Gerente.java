package com.github.hique2605.maratonajava.javacore.Lclassesabstratas.entidade;

public class Gerente extends Funcionario {


    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
