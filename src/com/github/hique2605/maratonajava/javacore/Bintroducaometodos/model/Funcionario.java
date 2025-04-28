package com.github.hique2605.maratonajava.javacore.Bintroducaometodos.model;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimeFuncionario() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios != null) {
            for (double salario : salarios) {
                System.out.print(salario + " ");
            }
            imprimeMediaSalario();
        }
    }

    public void imprimeMediaSalario() {
        if (salarios != null) {
            for (double salario : salarios) {
                media += salario;
            }
            media /= salarios.length;
            System.out.println("\nmedia salarios: " + media);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    //public void setMedia(double media) { NAO PODE SETAR A MEDIA, REGRA DE NEGOCIOS
      //  this.media = media;               !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    //}

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
