package com.github.hique2605.maratonajava.javacore.Hheranca.entidade;

public class Funcionario extends Pessoa {

    //private String nome;
    //private String cpf;
    //private Endereco endereco;
    private double salario;

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);

    }

    public void relatoriopagamento(){
        System.out.println("Nome:" + this.nome + "Salario:" + this.salario ); //pq usa protect na classe Pessoa
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}


