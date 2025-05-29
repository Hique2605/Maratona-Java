package com.github.hique2605.maratonajava.javacore.Lclassesabstratas.entidade;

public abstract class Funcionario {
//como se fosse um template , nao pode criar algo
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public void calculaBonus(){
        this.salario = salario + salario *0.1;
    }
}
